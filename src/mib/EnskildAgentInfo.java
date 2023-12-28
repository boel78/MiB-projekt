package mib;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class EnskildAgentInfo extends javax.swing.JFrame {

    private String namn;
    private Databas db;
    private Validering validering;
    private String telefon;
    private String datum;
    private String lösenord;
    private String område;
    private String epost;
    
public EnskildAgentInfo()
{
    db = new Databas();
    initComponents();
    validering = new Validering();
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtTelefonnummer = new javax.swing.JTextField();
        txtAnställningsdatum = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        txtAdministratör = new javax.swing.JTextField();
        txtLösenord = new javax.swing.JTextField();
        btnHämta = new javax.swing.JButton();
        btnÄndra = new javax.swing.JButton();
        lblTelefon = new javax.swing.JLabel();
        lblAnställningsdatum = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblAdministratör = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        lblOmråde = new javax.swing.JLabel();
        lblinformation = new javax.swing.JLabel();
        comboBoxOmråde = new javax.swing.JComboBox<>();
        lblDatumHjälp = new javax.swing.JLabel();
        btnTaBort = new javax.swing.JButton();
        btnRensa = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agent ID");

        lblNamn.setText("Namn");

        txtEpost.setColumns(20);

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        lblTelefon.setText("Telefonnummer");

        lblAnställningsdatum.setText("Anställningsdatum");

        lblEpost.setText("Epost");

        lblAdministratör.setText("Administratör");

        lblLösenord.setText("Lösenord");

        lblOmråde.setText("Område");

        lblinformation.setText("Skriv in Namn, Epost eller Agent ID");

        comboBoxOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));

        lblDatumHjälp.setText("(YYYY-MM-DD)");

        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        btnRensa.setText("Rensa");
        btnRensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRensaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLösenord)
                                    .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblEpost)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnHämta)
                                .addGap(141, 141, 141)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnÄndra)
                                .addGap(24, 24, 24)
                                .addComponent(btnRensa))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(txtAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDatumHjälp)
                                .addComponent(lblAnställningsdatum)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAdministratör)
                                            .addComponent(lblOmråde)))
                                    .addComponent(comboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnTaBort))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamn, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefon)
                            .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblinformation))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblinformation)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNamn)
                        .addComponent(lblTelefon))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAdministratör)
                        .addComponent(lblAnställningsdatum)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatumHjälp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEpost)
                            .addComponent(lblLösenord)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHämta)
                            .addComponent(btnÄndra)
                            .addComponent(btnTaBort)
                            .addComponent(btnRensa))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblOmråde)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Hämta knappen
    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        //Ifall man skriver i epost
        if(!txtEpost.getText().isEmpty() && validering.valideraAgentEpostFinns(txtEpost.getText())){
            String epost = txtEpost.getText();
            String id = db.getAgentIDFrånEpost(epost);
            txtID.setText(id);
            setNamnTxtField(id);
            setTelefonTxtField(id);
            setAnställningsdatumTxtField(id);
            setAdminTxtField(epost);
            setLösenordTxtField(epost);
            setOmrådeComboBox(id);
            
        }
        //ifall man skriver i ID
        else if(!txtID.getText().isEmpty() && validering.valideraAgentIDTypo(txtID.getText()) && validering.valideraAgentIDExisterar(txtID.getText())){
            String id = txtID.getText();
            setEpostTxtField(id);
            setNamnTxtField(id);
            setTelefonTxtField(id);
            setAnställningsdatumTxtField(id);
            setAdminTxtField(epost);
            setLösenordTxtField(epost);
            setOmrådeComboBox(id);
        }
        //Ifall man skriver i namn
        else if(!txtNamn.getText().isEmpty() && validering.valideraAgentNamnFinns(txtNamn.getText())){
            namn = txtNamn.getText();
            String id = db.getAgentIDFrånNamn(namn);
            txtID.setText(id);
            setEpostTxtField(id);
            setNamnTxtField(id);
            setTelefonTxtField(id);
            setAnställningsdatumTxtField(id);
            setAdminTxtField(epost);
            setLösenordTxtField(epost);
            setOmrådeComboBox(id);  
        }
    }//GEN-LAST:event_btnHämtaActionPerformed

    //ändra knappen
    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        String id = txtID.getText();
        if(validering.valideraAgentAnställningsDatum(txtAnställningsdatum.getText())){
            db.uppdateraAgentAnställningsdatum(id, txtAnställningsdatum.getText());
        }
        if(validering.valideraLösenord(txtLösenord.getText())){
            db.uppdateraAgentLösenord(id, txtLösenord.getText());
        }
        if(validering.valideraAgentNamn(txtNamn.getText())){
            db.uppdateraAgentNamn(id, txtNamn.getText());    
        }
        
        if(validering.valideraAgentEpostFinns(txtEpost.getText())){
            db.uppdateraAgentEpost(id, txtEpost.getText());
        }
        område = comboBoxOmråde.getSelectedItem().toString();
        String områdesID = "";
        switch(område){
            case "Svealand" :
                områdesID = "1";
                break;
            case "Götaland" :
                områdesID = "2";
                break;
            case "Norrland" :
                områdesID = "4";
                break;
        }
        db.uppdateraAgentOmråde(id, områdesID);
        JOptionPane.showMessageDialog(null, "Dina ändringar har sparats");
    }//GEN-LAST:event_btnÄndraActionPerformed

    //Ta bort knappen
    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        //Ifall man skriver i epost
        if(!txtEpost.getText().isEmpty() && validering.valideraAgentEpostFinns(txtEpost.getText())){
            String id = db.getAgentIDFrånEpost(txtEpost.getText());
            ArrayList<String> tillhörandeAliens = db.getAlienListaFrånAgentID(id);
            if(tillhörandeAliens.isEmpty()){
                db.taBortInneharUtrustningVidAgentID(id);
                db.taBortFältAgentVidAgentID(id);
                db.taBortAgentFrånOmrådesChef(id);
                db.taBortAgent(id);
                JOptionPane.showMessageDialog(null, "Agenten är borttagen.");
            }
            else{
                db.taBortInneharUtrustningVidAgentID(id);
                db.taBortFältAgentVidAgentID(id);
                db.taBortAgentFrånOmrådesChef(id);
                String chefNamn = db.getAgentNamnFrånID(db.bytUtAgentFrånAlienTillChef(id));
                JOptionPane.showMessageDialog(null, "Agenten är borttagen och ansvaret har gått över till Områdeschefen " + chefNamn);
                db.taBortAgent(id);
            }
        }
        //ifall man skriver i ID
        else if(!txtID.getText().isEmpty() && validering.valideraAgentIDTypo(txtID.getText()) && validering.valideraAgentIDExisterar(txtID.getText())){
            String id = txtID.getText();
            ArrayList<String> tillhörandeAliens = db.getAlienListaFrånAgentID(id);
            if(tillhörandeAliens.isEmpty()){
                db.taBortInneharUtrustningVidAgentID(id);
                db.taBortFältAgentVidAgentID(id);
                db.taBortAgentFrånOmrådesChef(id);
                db.taBortAgent(id);
                JOptionPane.showMessageDialog(null, "Agenten är borttagen.");
            }
            else{
                db.taBortInneharUtrustningVidAgentID(id);
                db.taBortFältAgentVidAgentID(id);
                db.taBortAgentFrånOmrådesChef(id);
                String chefNamn = db.getAgentNamnFrånID(db.bytUtAgentFrånAlienTillChef(id));
                JOptionPane.showMessageDialog(null, "Agenten är borttagen och ansvaret har gått över till Områdeschefen " + chefNamn);
                db.taBortAgent(id);
            }
        }
        //Ifall man skriver i namn
        else if(!txtNamn.getText().isEmpty() && validering.valideraAgentNamnFinns(txtNamn.getText())){
            String id = db.getAgentIDFrånNamn(txtNamn.getText());
            ArrayList<String> tillhörandeAliens = db.getAlienListaFrånAgentID(id);
            if(tillhörandeAliens.isEmpty()){
                db.taBortInneharUtrustningVidAgentID(id);
                db.taBortFältAgentVidAgentID(id);
                db.taBortAgentFrånOmrådesChef(id);
                db.taBortAgent(id);
                JOptionPane.showMessageDialog(null, "Agenten är borttagen.");
            }
            else{
                db.taBortInneharUtrustningVidAgentID(id);
                db.taBortFältAgentVidAgentID(id);
                db.taBortAgentFrånOmrådesChef(id);
                String chefNamn = db.getAgentNamnFrånID(db.bytUtAgentFrånAlienTillChef(id));
                JOptionPane.showMessageDialog(null, "Agenten är borttagen och ansvaret har gått över till Områdeschefen " + chefNamn);
                db.taBortAgent(id);
            }
        }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnRensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRensaActionPerformed
            txtID.setText("");
            txtNamn.setText("");
            txtEpost.setText("");
            txtAnställningsdatum.setText("");
            txtLösenord.setText("");
            txtTelefonnummer.setText("");
            txtAdministratör.setText("");
            
    }//GEN-LAST:event_btnRensaActionPerformed

    private void setNamnTxtField(String id){  
        namn = db.getAgentsNamn(id);
        txtNamn.setText(namn); 
    }
    
    private void setTelefonTxtField(String id){
        telefon = db.getAgentsTelefon(id);
        txtTelefonnummer.setText(telefon);
    }
    
    private void setAnställningsdatumTxtField(String id){
        datum = db.getAgentAnställningsdatum(id);
        txtAnställningsdatum.setText(datum);
    }
    
    private void setAdminTxtField(String epost){
        boolean ärAdmin = db.getAdminStatus(epost);
        if(ärAdmin){
            txtAdministratör.setText("Ja");
        }
        else{
            txtAdministratör.setText("Nej");
        }
    }
    
    private void setLösenordTxtField(String epost){
        lösenord = db.getAgentLösenordFrånEpost(epost);
        txtLösenord.setText(lösenord);
    }
    
    private void setOmrådeComboBox(String id){
        String områdesID = db.getAgentOmråde(id);
        område = db.getOmrådeBenämningFrånID(områdesID);
        comboBoxOmråde.setSelectedItem(område);
    }
    
    private void setEpostTxtField(String id){
        epost = db.getAgentsEpost(id);
        txtEpost.setText(epost);
    }
    

    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnskildAgentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnRensa;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JComboBox<String> comboBoxOmråde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private javax.swing.JLabel lblAdministratör;
    private javax.swing.JLabel lblAnställningsdatum;
    private javax.swing.JLabel lblDatumHjälp;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblinformation;
    private javax.swing.JTextField txtAdministratör;
    private javax.swing.JTextField txtAnställningsdatum;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLösenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefonnummer;
    // End of variables declaration//GEN-END:variables
}
