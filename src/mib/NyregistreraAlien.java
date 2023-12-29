
package mib;

import javax.swing.JComboBox;

/**
 *
 * @author joakimfockstedt
 */
public class NyregistreraAlien extends javax.swing.JFrame {
    private Databas db;
    private int alienId;
    private String epost;
    private String namn;
    private String lösenord;
    private String telefonnummer;
    private String datum;
    private int plats;
    private int ansvarigAgent;
    private Validering validering;

    /**
     * Creates new form LukasForm
     */
    public NyregistreraAlien() {
        initComponents();
        db = new Databas();
        validering = new Validering();
        plats = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLäggTill = new javax.swing.JButton();
        txtEpost = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        pswLösenord = new javax.swing.JPasswordField();
        txtDatum = new javax.swing.JTextField();
        txtAgent = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        lblNamn = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        lblDatum2 = new javax.swing.JLabel();
        lblAgent = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLäggTill.setText("Lägg till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        txtEpost.setColumns(5);

        txtNamn.setColumns(5);

        txtTelefon.setColumns(5);

        pswLösenord.setColumns(5);

        txtDatum.setColumns(5);

        txtAgent.setColumns(5);

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Örebro", "Västerås", "Vilhelmina", "Borås" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        lblNamn.setText("Namn:");

        lblEpost.setText("Epost:");

        lblTelefon.setText("Telefon:");

        lblDatum.setText("Datum:");

        lblRubrik.setText("Registrera ny alien");

        lblDatum2.setText("(ÅÅÅÅ-MM-DD)");

        lblAgent.setText("Ansvarig agent:");

        lblLösenord.setText("Lösenord:");

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
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLäggTill)
                            .addComponent(lblRubrik)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblDatum2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEpost)
                    .addComponent(lblTelefon)
                    .addComponent(lblNamn)
                    .addComponent(lblDatum)
                    .addComponent(lblLösenord))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAgent)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTillbaka)
                                    .addComponent(txtAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pswLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLäggTill)
                            .addComponent(btnTillbaka))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgent)
                            .addComponent(lblEpost))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLösenord)
                            .addComponent(pswLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefon)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDatum)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDatum2)
                        .addGap(41, 41, 41))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
        //Sätter alienId
        alienId = (db.antalAliensIDatabas() + 1);
        
        //Validerar och sätter epost
        if(validering.valideraAlienEpostTypo(txtEpost.getText())){
            epost = txtEpost.getText();
            System.out.println("Epost: " + epost);
        }
        //Validerar och sätter namnet
        if(validering.valideraAlienNamn(txtNamn.getText())) {
            namn = txtNamn.getText();
            System.out.println("Namn: " + namn);
        }
        //Validerar och sätter telefonnummer
        if(validering.valideraAlienTelefonnummer(txtTelefon.getText())){
            telefonnummer = txtTelefon.getText();
            System.out.println("Telefonnummer: " + telefonnummer);
        }
        //Validerar och sätter lösenord
        if(validering.valideraLösenord(pswLösenord.getText())){
            lösenord = pswLösenord.getText();
        }
        //Validerar och sätter datum
        if(validering.valideraAgentAnställningsDatum(txtDatum.getText())){
            datum = txtDatum.getText();
            System.out.println("Datum: " + datum);
        }
        //Validerar och sätter ansvarig agent
        if(ansvarigAgent <= db.antalAgenterIDatabas()){
            ansvarigAgent = Integer.parseInt(txtAgent.getText());
            System.out.println("Ansvarig agent: " + ansvarigAgent);
        }
        //Skapar alien i tabellen via databasklassen om eposten inte finns
        if(!validering.valideraAlienEpostExisterar(txtEpost.getText()) && !fältÄrNull()){    
        db.registreraNyAlien(alienId, datum, epost, lösenord, namn, telefonnummer, plats, ansvarigAgent);}
        else{
            System.out.println("Validering misslyckades, något fält är null");
        }    
        
                                  
    }//GEN-LAST:event_btnLäggTillActionPerformed

    //Anger plats
    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        JComboBox comboBox = (JComboBox) evt.getSource();

        Object selected = comboBox.getSelectedItem();
        if(selected.toString().equals("Örebro")) {
            plats = 1;
            System.out.println(plats);
        } else if(selected.toString().equals("Västerås")) {
            plats = 2;
            System.out.println(plats);
        } else if(selected.toString().equals("Vilhelmina")) {
            plats = 3;
            System.out.println(plats);
        } else if(selected.toString().equals("Borås")) {
          plats = 4;
          System.out.println(plats);
        }
    }//GEN-LAST:event_comboBoxActionPerformed

    //Tillbaka till hemsidan
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AgentHemsida agentHemsida = new AgentHemsida();
        agentHemsida.show();
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Kolla om fälten är null
    private boolean fältÄrNull(){
        boolean ärNull = false;
        if(epost == null || namn == null || lösenord == null || telefonnummer == null || datum == null){
            ärNull = true;
        }  
        return ärNull;
    }
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
            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NyregistreraAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblDatum2;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JPasswordField pswLösenord;
    private javax.swing.JTextField txtAgent;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
