package mib;

import javax.swing.JOptionPane;

public class BytaLösenord extends javax.swing.JFrame {

    private Validering validering;
    private Databas db;
    private String anvID;
    private String anvTyp;
    private String epost;

    public BytaLösenord(String anvID, String anvTyp) {
        initComponents();
        validering = new Validering();
        db = new Databas();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwNuvarandeLösenord = new javax.swing.JPasswordField();
        pwNyttLösenord = new javax.swing.JPasswordField();
        lblBytLösenord = new javax.swing.JLabel();
        lblNuvarandeLösenord = new javax.swing.JLabel();
        lblNyttLösenord = new javax.swing.JLabel();
        btnBytLösenord = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pwNuvarandeLösenord.setColumns(25);

        pwNyttLösenord.setColumns(20);

        lblBytLösenord.setText("Byt Lösenord");

        lblNuvarandeLösenord.setText("Nuvarande Lösenord");

        lblNyttLösenord.setText("Nytt Lösenord");

        btnBytLösenord.setText("Byt lösenord");
        btnBytLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLösenordActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblBytLösenord))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBytLösenord)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNyttLösenord)
                            .addComponent(lblNuvarandeLösenord)
                            .addComponent(pwNyttLösenord)
                            .addComponent(pwNuvarandeLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblBytLösenord)
                .addGap(58, 58, 58)
                .addComponent(lblNuvarandeLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwNuvarandeLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNyttLösenord)
                .addGap(3, 3, 3)
                .addComponent(pwNyttLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnBytLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTillbaka)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBytLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLösenordActionPerformed
        hämtaEpost();
        String nuvarandeLösenord = pwNuvarandeLösenord.getText();
        String nyttLösenord = pwNyttLösenord.getText();
        if(validering.valideraLösenord(nyttLösenord) && validering.valideraLösenord(nuvarandeLösenord)){
            //Agent lösenord
            if(anvTyp.equals("Agent") ||anvTyp.equals("Admin")){
                if(validering.valideraAgentLösenord(nuvarandeLösenord, epost)){
                    db.setAgentLösenordFrånEpost(epost, nyttLösenord);
                    JOptionPane.showMessageDialog(null, "Bytte lösenord.");
                }
            }
            //Alien lösenord
            else{
                if(validering.valideraAlienLösenord(nuvarandeLösenord, epost)){
                    db.setAlienLösenordFrånEpost(epost, nyttLösenord);
                    JOptionPane.showMessageDialog(null, "Bytte lösenord.");
                }
            }
        }
    }//GEN-LAST:event_btnBytLösenordActionPerformed

    //Tillbaka till hemsidan
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if(anvTyp.equals("Agent")){
            AgentHemsida agentHemsida = new AgentHemsida(anvID, anvTyp);
            agentHemsida.show();
            dispose();
        }
        else if(anvTyp.equals("Admin")){
            AdminHemsida adminsida = new AdminHemsida(anvID, anvTyp);
            adminsida.show();
            dispose();
        }
        else if(anvTyp.equals("Alien")){
            AlienHemsida aliensida = new AlienHemsida(anvID, anvTyp);
            aliensida.show();
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed
  
    private void hämtaEpost(){
        if(anvTyp.equals("Alien")){
            epost = db.getAlienEpostFrånID(anvID);
        }
        else if(anvTyp.equals("Agent") ||anvTyp.equals("Admin")){
            epost = db.getAgentsEpost(anvID);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBytLösenord;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblBytLösenord;
    private javax.swing.JLabel lblNuvarandeLösenord;
    private javax.swing.JLabel lblNyttLösenord;
    private javax.swing.JPasswordField pwNuvarandeLösenord;
    private javax.swing.JPasswordField pwNyttLösenord;
    // End of variables declaration//GEN-END:variables
}
