package mib;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class NyregistreraAlien extends javax.swing.JFrame {
    private Databas db;
    private int alienId;
    private String epost;
    private String namn;
    private String lösenord;
    private String telefonnummer;
    private String datum;
    private String ras;
    private String rasInfo;
    private int plats;
    private int ansvarigAgent;
    private Validering validering;
    private String anvID;
    private String anvTyp;
   
    public NyregistreraAlien(String anvID, String anvTyp) {
        initComponents();
        db = new Databas();
        validering = new Validering();
        plats = 1;
        ras = "Boglodite";
        this.anvID = anvID;
        this.anvTyp = anvTyp;
    }

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
        comboBoxRas = new javax.swing.JComboBox<>();
        lblRas = new javax.swing.JLabel();
        txtRasInfo = new javax.swing.JTextField();
        lblRasInfo = new javax.swing.JLabel();

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

        comboBoxRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        comboBoxRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRasActionPerformed(evt);
            }
        });

        lblRas.setText("Ras");

        lblRasInfo.setText("Antal boogies:");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
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
                                                    .addComponent(txtAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRasInfo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblRas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pswLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRas))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRasInfo))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLäggTill)
                            .addComponent(btnTillbaka))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
        boolean skapad = false;
        //Sätter alienId
        alienId = (db.getNyttAlienID());
        
        //Validerar och sätter epost
        if(validering.valideraAlienEpostExisterar(txtEpost.getText(), true) || !validering.valideraAlienEpostTypo(txtEpost.getText(), false)){
            
        }
        //Validerar och sätter namnet
        else if(!validering.valideraAlienNamn(txtNamn.getText(), true)) {
            
        }
        //Validerar och sätter telefonnummer
        else if(!validering.valideraAlienTelefonnummer(txtTelefon.getText())){
            
        }
        //Validerar och sätter lösenord
        else if(!validering.valideraLösenord(pswLösenord.getText())){
            
        }
        //Validerar och sätter datum
        else if(!validering.valideraDatum(txtDatum.getText())){
            
        }
        //Validerar och sätter ansvarig agent
        else if(!validering.valideraAgentIDExisterar(txtAgent.getText(), true)){
            
        }
        //Validerar rasinput
        else if(!validering.valideraRasInfo(txtRasInfo.getText())){
            
        }
        
        //Skapar alien i tabellen
        else {    
            epost = txtEpost.getText();
            namn = txtNamn.getText();
            telefonnummer = txtTelefon.getText();
            lösenord = pswLösenord.getText();
            datum = txtDatum.getText();
            ansvarigAgent = Integer.parseInt(txtAgent.getText());
            rasInfo = txtRasInfo.getText();

            db.registreraNyAlien(alienId, datum, epost, lösenord, namn, telefonnummer, plats, ansvarigAgent);
            skapad = true;            
            //Sätter in alien i en ras tabell
            if(skapad){
                db.läggTillIRas(alienId, rasInfo, ras);
            }
        }         


                                  
    }//GEN-LAST:event_btnLäggTillActionPerformed

    //Anger plats
    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        JComboBox comboBox = (JComboBox) evt.getSource();
        Object selected = comboBox.getSelectedItem();
        if(selected.toString().equals("Örebro")) {
            plats = 1;
        } 
        else if(selected.toString().equals("Västerås")) {
            plats = 2;
        } 
        else if(selected.toString().equals("Vilhelmina")) {
            plats = 3;
        } 
        else if(selected.toString().equals("Borås")) {
          plats = 4;
        }
    }//GEN-LAST:event_comboBoxActionPerformed

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
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Ras combobox
    private void comboBoxRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRasActionPerformed
        if(comboBoxRas.getSelectedIndex() == 0){
            ras = "Boglodite";
            lblRasInfo.setText("Antal boogies:");
        }
        else if(comboBoxRas.getSelectedIndex() == 1){
            ras = "Squid";
            lblRasInfo.setText("Antal armar:");
        }
        else if(comboBoxRas.getSelectedIndex() == 2){
            ras = "Worm";
            lblRasInfo.setText("Längd:");
        }
    }//GEN-LAST:event_comboBoxRasActionPerformed

    //Kolla om fälten är null
    private boolean fältÄrNull(){
        boolean ärNull = false;
        if(epost == null || namn == null || lösenord == null || telefonnummer == null || datum == null || rasInfo == null || ras == null){
            ärNull = true;
        }  
        return ärNull;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JComboBox<String> comboBoxRas;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblDatum2;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasInfo;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JPasswordField pswLösenord;
    private javax.swing.JTextField txtAgent;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasInfo;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
