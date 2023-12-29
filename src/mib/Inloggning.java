package mib;

import javax.swing.JOptionPane;


public class Inloggning extends javax.swing.JFrame {

    private Databas idb;
    private String typ;
    private String id;
    private Validering validering;
   
    public Inloggning() {
        initComponents();
        idb = new Databas();
        validering = new Validering();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwField = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        txtEpost = new javax.swing.JTextField();
        lblRubrik = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblLösen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pwField.setColumns(20);

        btnLogin.setText("Logga in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtEpost.setColumns(20);

        lblRubrik.setText("Välkommen till MIB");

        lblEpost.setText("Epost");

        lblLösen.setText("Lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnLogin))
                            .addComponent(lblEpost)
                            .addComponent(lblLösen)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblRubrik)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(lblEpost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLösen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnLogin)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(inlogKontroll()){
            if(typ.equals("Agent")){
                AgentHemsida agentHemsida = new AgentHemsida(id, typ);
                agentHemsida.show();
                dispose();
            }
            else if(typ.equals("Admin")){
                AdminHemsida adminsida = new AdminHemsida(id, typ);
                adminsida.show();
                dispose();
            }
            else if(typ.equals("Alien")){
                JOptionPane.showMessageDialog(null, "Alien");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inloggning().setVisible(true);
            }
        });
    }
    
    public boolean inlogKontroll(){
        boolean valid = false;
        if(!txtEpost.getText().isEmpty() || !pwField.getText().isEmpty()){
            String user = txtEpost.getText();
            String pass = pwField.getText();
            typ = ÄrInloggTyp(user);
            if(typ.equals("Alien")){
                if(validering.valideraAlienLösenord(pass, user)){
                   id = idb.getAlienIDFrånEpost(user);
                   valid = true; 
                }
            }
            else if(typ.equals("Agent") ||typ.equals("Admin")){                
                if(validering.valideraAgentLösenord(pass, user)){
                    id = idb.getAgentIDFrånEpost(user);
                    valid = true;
                } 
            System.out.println(valid);
            }
        }
        return valid;
    }
    
    public String ÄrInloggTyp(String email){
        typ = "Alien";
        String[] emailTyper = email.split("@");
            if(emailTyper[1].equals("mib.net")){
                boolean ärAdmin = idb.getAdminStatus(email);
                typ = "Agent";
                if(ärAdmin){
                    typ = "Admin";
                }
            }
        return typ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLösen;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JTextField txtEpost;
    // End of variables declaration//GEN-END:variables
}


