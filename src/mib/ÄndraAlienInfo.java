package mib;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ÄndraAlienInfo extends javax.swing.JFrame {
    private Databas db;
    private int alienId;
    private String epost;
    private String namn;
    private String lösenord;
    private String telefonnummer;
    private String datum;
    private String ras;
    private int plats;
    private Integer ansvarigAgent;
    private Validering validering;
    private String anvID;
    private String anvTyp;

    public ÄndraAlienInfo(String anvID, String anvTyp) {
        initComponents();
        db = new Databas();
        validering = new Validering();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
        plats = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblLösen = new javax.swing.JLabel();
        pswLösen = new javax.swing.JPasswordField();
        lblAgent = new javax.swing.JLabel();
        txtAgent = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblOmråde = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        lblDatum2 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        lblNyttNamn = new javax.swing.JLabel();
        txtNyttNamn = new javax.swing.JTextField();
        btnTillbaka = new javax.swing.JButton();
        comboBoxRas = new javax.swing.JComboBox<>();
        lblRas = new javax.swing.JLabel();
        txtRasInfo = new javax.swing.JTextField();
        lblRasInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setText("Ändra infromation om alien");

        txtNamn.setColumns(5);

        lblNamn.setText("Namn:");

        lblTelefon.setText("Nytt telefonnummer:");

        txtTelefon.setColumns(5);

        lblLösen.setText("Nytt lösenord:");

        pswLösen.setColumns(5);

        lblAgent.setText("Ny ansvarig agent:");

        txtAgent.setColumns(5);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Örebro", "Västerås", "Vilhelmina", "Borås" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblOmråde.setText("Nytt område:");

        lblDatum.setText("Nytt registreringsdatum:");

        txtDatum.setColumns(5);

        lblDatum2.setText("(ÅÅÅÅ-MM-DD)");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lblNyttNamn.setText("Nytt namn:");

        txtNyttNamn.setColumns(5);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        comboBoxRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Worm", "Squid" }));
        comboBoxRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRasActionPerformed(evt);
            }
        });

        lblRas.setText("Ras");

        txtRasInfo.setColumns(6);

        lblRasInfo.setText("Antal boogies");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblRubrik)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblOmråde)
                                .addGap(9, 9, 9))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNamn)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNyttNamn)
                                    .addComponent(txtNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTelefon))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(pswLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblDatum2)
                                    .addGap(3, 3, 3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRas))
                                    .addGap(7, 7, 7)))
                            .addComponent(lblRasInfo))))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDatum)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRubrik)
                        .addGap(9, 9, 9)
                        .addComponent(lblOmråde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(lblDatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDatum2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNyttNamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTelefon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRas)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLösen)
                        .addGap(18, 18, 18)
                        .addComponent(pswLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAgent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblRasInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(txtAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbaka))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Anger plats
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        JComboBox comboBox = (JComboBox) evt.getSource();
        Object selected = comboBox.getSelectedItem();
        if(selected.toString().equals("Örebro")) {
            plats = 1;
            System.out.println(plats);
        } 
        else if(selected.toString().equals("Västerås")) {
            plats = 2;
            System.out.println(plats);
        } 
        else if(selected.toString().equals("Vilhelmina")) {
            plats = 3;
            System.out.println(plats);
        } 
        else if(selected.toString().equals("Borås")) {
            plats = 4;
            System.out.println(plats);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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

    private void comboBoxRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRasActionPerformed
        if(comboBoxRas.getSelectedIndex() == 0){
            lblRasInfo.setText("Antal boogies");
        }
        else if(comboBoxRas.getSelectedIndex() == 1){
            lblRasInfo.setText("Längd");
        }
        else if(comboBoxRas.getSelectedIndex() == 2){
            lblRasInfo.setText("Antal armar");
        }
    }//GEN-LAST:event_comboBoxRasActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String namnAttÄndra = txtNamn.getText();
        int id = db.hämtaAlienIdFrånNamn(namnAttÄndra);      
        if(validering.valideraAlienNamnExisterar(txtNamn.getText())){
            //Validerar
            if(!validering.valideraAlienNamn(txtNyttNamn.getText(), true)){
            }
            else if(!validering.valideraAlienTelefonnummer(txtTelefon.getText())) {

            }
            else if(!validering.valideraLösenord(pswLösen.getText())) {

            }
            else if(!validering.valideraDatum(txtDatum.getText())){

            }
            else if(!validering.valideraAgentIDExisterar(txtAgent.getText(), true)) {
  
            }
            else if(!validering.valideraRasInfo(txtRasInfo.getText())){
            
            }
            //Sätter värden på fälten
            else{
                namn = txtNyttNamn.getText();
                telefonnummer = txtTelefon.getText();
                lösenord = pswLösen.getText();
                datum = txtDatum.getText();
                ras = comboBoxRas.getSelectedItem().toString();

                try {
                    ansvarigAgent = Integer.parseInt(txtAgent.getText());
                } 
                catch(NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }
                
                //Tar bort nuvarande rasen och sätter in i nya
                db.taBortRas(id);
                db.läggTillIRas(id, txtRasInfo.getText(), ras);

                //Lägger till värden i tabellen via databasklassen
                db.ändraAlienInfo(id, datum, lösenord, namn, telefonnummer, plats, ansvarigAgent);
                }   
            }
        else{
            JOptionPane.showMessageDialog(null, "Det finns ingen registrerad alien med det namnet.");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBoxRas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblDatum2;
    private javax.swing.JLabel lblLösen;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblNyttNamn;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasInfo;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JPasswordField pswLösen;
    private javax.swing.JTextField txtAgent;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtNyttNamn;
    private javax.swing.JTextField txtRasInfo;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
