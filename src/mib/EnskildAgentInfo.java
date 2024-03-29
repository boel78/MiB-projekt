package mib;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


public class EnskildAgentInfo extends javax.swing.JFrame {

    private String namn;
    private String id;
    private Databas db;
    private Validering validering;
    private String telefon;
    private String datum;
    private String lösenord;
    private String område;
    private String epost;
    private String områdesChefOmråde;
    private String kontorsChefBeteckning;
    private String chef;
    private String admin;
    String områdesID;
    private String anvID;
    private String anvTyp;
    private boolean skrivUtNamn;
    
    public EnskildAgentInfo(String anvID, String anvTyp){
        db = new Databas();
        initComponents();
        validering = new Validering();
        txtOmrådesAnsvar.setVisible(false);
        lblOmrådesAnsvar.setVisible(false);
        this.anvID = anvID;
        this.anvTyp = anvTyp;
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
        comboBoxChef = new javax.swing.JComboBox<>();
        lblChef = new javax.swing.JLabel();
        txtOmrådesAnsvar = new javax.swing.JTextField();
        lblOmrådesAnsvar = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        lblFörklaring = new javax.swing.JLabel();

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

        comboBoxOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland", "---" }));
        comboBoxOmråde.setSelectedIndex(3);

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

        comboBoxChef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kontorschef", "Områdeschef", "---" }));
        comboBoxChef.setSelectedIndex(2);
        comboBoxChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxChefActionPerformed(evt);
            }
        });

        lblChef.setText("Chefsposition");

        txtOmrådesAnsvar.setColumns(9);

        lblOmrådesAnsvar.setText("Områdesansvar");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblFörklaring.setText("Fyll sedan i informationen du vill ändra");

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
                                .addComponent(btnTillbaka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                    .addComponent(comboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOmrådesAnsvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAdministratör)
                                            .addComponent(lblOmråde)
                                            .addComponent(lblChef)
                                            .addComponent(lblOmrådesAnsvar)))))
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
                    .addComponent(lblinformation)
                    .addComponent(lblFörklaring))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblinformation)
                .addGap(7, 7, 7)
                .addComponent(lblFörklaring)
                .addGap(18, 18, 18)
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
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblOmråde)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblChef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblOmrådesAnsvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOmrådesAnsvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHämta)
                    .addComponent(btnÄndra)
                    .addComponent(btnTaBort)
                    .addComponent(btnRensa)
                    .addComponent(btnTillbaka))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Hämta knappen
    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        txtOmrådesAnsvar.setVisible(false);
        lblOmrådesAnsvar.setVisible(false);
        skrivUtNamn = true;
        if(validering.valideraSträngTom(txtNamn.getText()) && validering.valideraSträngTom(txtEpost.getText()) && validering.valideraSträngTom(txtID.getText())){
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i Namn, Epost eller ett ID");
            skrivUtNamn = false;
        }
        //Ifall man skriver i epost
        else if(validering.valideraAgentEpostFinns(txtEpost.getText(), false) && validering.valideraSträngTom(txtNamn.getText()) && validering.valideraSträngTom(txtID.getText())){
            epost = txtEpost.getText();
            id = db.getAgentIDFrånEpost(epost);
            hämtaAgentInfo();   
            skrivUtNamn = false;
        }
        //ifall man skriver i ID
        else if(validering.valideraIDTypo(txtID.getText(), false) && validering.valideraAgentIDExisterar(txtID.getText(), true) && validering.valideraSträngTom(txtNamn.getText()) && validering.valideraSträngTom(txtEpost.getText())){
            id = txtID.getText();
            hämtaAgentInfo();
            skrivUtNamn = false;
        }
        //Ifall man skriver i namn
        else if(validering.valideraAgentNamnFinns(txtNamn.getText(), skrivUtNamn) && validering.valideraSträngTom(txtEpost.getText()) && validering.valideraSträngTom(txtID.getText())){
            namn = txtNamn.getText();
            id = db.getAgentIDFrånNamn(namn);
            hämtaAgentInfo();
        }
    }//GEN-LAST:event_btnHämtaActionPerformed

    //ändra knappen
    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        id = txtID.getText();
        namn = txtNamn.getText();
        epost = txtEpost.getText();
        datum = txtAnställningsdatum.getText();
        telefon = txtTelefonnummer.getText();
        lösenord = txtLösenord.getText();
        område = comboBoxOmråde.getSelectedItem().toString();
        admin = txtAdministratör.getText().toLowerCase();
        boolean ändrad = false;
        txtOmrådesAnsvar.setVisible(false);
        lblOmrådesAnsvar.setVisible(false);
        
        //Om man skriver i epost
        if(validering.valideraAgentEpostFinns(epost, false)){
            id = db.getAgentIDFrånEpost(epost);
            ändrad = ändraAgentInfo("epost");
        }
        
        //Ifall man skriver in namn
        else if(validering.valideraAgentNamnFinns(namn, true)){
            id = db.getAgentIDFrånNamn(namn);
            ändrad = ändraAgentInfo("namn");
        }
        
        //Ifall man skriver in ID
        else if(validering.valideraAgentIDExisterar(id, true)){
            id = txtID.getText();
            ändrad = ändraAgentInfo("id");
        }
        
        if(ändrad){
            JOptionPane.showMessageDialog(null, "Dina ändringar har sparats");
        }
        //Ifall man lämnat namn, epost och id tomt.
        else if(validering.valideraSträngTom(txtNamn.getText()) && validering.valideraSträngTom(txtEpost.getText()) && validering.valideraSträngTom(txtID.getText())){
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i Namn, Epost eller ett ID");
        }
        
    }//GEN-LAST:event_btnÄndraActionPerformed

    //Ta bort knappen
    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        //Ifall man skriver i epost
        if(validering.valideraAgentEpostFinns(txtEpost.getText(), false)){
            id = db.getAgentIDFrånEpost(txtEpost.getText());
            taBortAgent();
        }
        //ifall man skriver i ID
        else if(validering.valideraIDTypo(txtID.getText(), false) && validering.valideraAgentIDExisterar(txtID.getText(), true)){
            id = txtID.getText();
            taBortAgent();
        }
        //Ifall man skriver i namn
        else if(validering.valideraAgentNamnFinns(txtNamn.getText(), true)){
            id = db.getAgentIDFrånNamn(txtNamn.getText());
            System.out.println(id);
            taBortAgent();
        }
        //Ifall alla fälten är tomma
        else if(validering.valideraSträngTom(txtNamn.getText()) && validering.valideraSträngTom(txtEpost.getText()) && validering.valideraSträngTom(txtID.getText())){
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i Namn, Epost eller ett ID");
        }
    }//GEN-LAST:event_btnTaBortActionPerformed

    //Rensa knappen
    private void btnRensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRensaActionPerformed
        txtID.setText("");
        txtNamn.setText("");
        txtEpost.setText("");
        txtAnställningsdatum.setText("");
        txtLösenord.setText("");
        txtTelefonnummer.setText("");
        txtAdministratör.setText("");
        comboBoxOmråde.setSelectedIndex(3);
        txtOmrådesAnsvar.setVisible(false);
        lblOmrådesAnsvar.setVisible(false);
        comboBoxChef.setSelectedIndex(2);
    }//GEN-LAST:event_btnRensaActionPerformed

    //Chef combo box
    private void comboBoxChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxChefActionPerformed
        if(comboBoxChef.getSelectedItem().toString().equals("Områdeschef")){
            txtOmrådesAnsvar.setVisible(true);
            lblOmrådesAnsvar.setVisible(true);
            lblOmrådesAnsvar.setText("Områdesansvar");
            txtOmrådesAnsvar.setText("");
        }
        else if(comboBoxChef.getSelectedItem().toString().equals("Kontorschef")){
            txtOmrådesAnsvar.setVisible(true);
            lblOmrådesAnsvar.setVisible(true);
            lblOmrådesAnsvar.setText("Kontorsbeteckning");
            txtOmrådesAnsvar.setText("");
        }
        else{
            txtOmrådesAnsvar.setVisible(false);
            lblOmrådesAnsvar.setVisible(false);
        }
    }//GEN-LAST:event_comboBoxChefActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AdminHemsida ah = new AdminHemsida(anvID, anvTyp);
        ah.show();
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Metoder för att sätta in text i textfälten.
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
    
    private void setChefComboBox(String id){
        områdesChefOmråde = db.kontrolleraOmrådeschef(id);
        kontorsChefBeteckning = db.kontrolleraKontorschef(id);
        if(!områdesChefOmråde.equals("---")){
            lblOmrådesAnsvar.setText("Områdesansvar");
            comboBoxChef.setSelectedIndex(1);
            txtOmrådesAnsvar.setVisible(true);
            lblOmrådesAnsvar.setVisible(true);
            switch(områdesChefOmråde){
                case "1":
                    txtOmrådesAnsvar.setText("Svealand");
                break;
                case "2":
                    txtOmrådesAnsvar.setText("Götaland");
                break;
                case "4":
                    txtOmrådesAnsvar.setText("Norrland");
                break;
            }
        }
        else if(!kontorsChefBeteckning.equals("---")){
            txtOmrådesAnsvar.setVisible(true);
            lblOmrådesAnsvar.setVisible(true);
            comboBoxChef.setSelectedIndex(0);
            lblOmrådesAnsvar.setText("Kontorsbeteckning");
            txtOmrådesAnsvar.setText(kontorsChefBeteckning);
        }
        else{
            comboBoxChef.setSelectedIndex(2);
        }
    }
    
    private void uppdateraAliensKontaktperson(String agentID){     
        ArrayList<String> alienIDn = db.getAlienListaFrånAgentID(agentID);
        boolean ändrad = false;
        String områdesChef = "";
        for(String alienID : alienIDn){
            String områdesID = db.getOmrådesIDFrånPlatsID(db.getPlatsIDFrånAlienID(alienID));
            områdesChef = db.getOmrådesChef(områdesID);
            if(områdesChef == null){
                Random random = new Random();
                ArrayList<String> områdeschefer = db.getOmrådeschefer();
                områdesChef = områdeschefer.get(random.nextInt(områdeschefer.size()));
            }
            ändrad = true;
            db.bytUtAgentFrånAlienTillChef(agentID, områdesChef);  
        }
        if(ändrad){
            JOptionPane.showMessageDialog(null, "Agenten är borttagen och ansvaret har gått över till Områdeschefen " + db.getAgentNamnFrånID(Integer.parseInt(områdesChef)));
        }
        else{
           JOptionPane.showMessageDialog(null, "Det verkar inte finnas en områdeschef på den valda agentens område. Var vänlig och lägg till en ny områdeschef först.");    
        }
    }

    private void hämtaAgentInfo(){
        txtID.setText(id);
        setEpostTxtField(id);
        setNamnTxtField(id);
        setTelefonTxtField(id);
        setAnställningsdatumTxtField(id);
        setAdminTxtField(epost);
        setLösenordTxtField(epost);
        setOmrådeComboBox(id);
        setChefComboBox(id);  
    }
    
    private boolean ändraAgentInfo(String typ){
        boolean ändrad = false;
        if(!validering.valideraSträngTom(datum) && validering.valideraDatum(datum)){
                db.uppdateraAgentAnställningsdatum(id, datum);
                ändrad = true;
            }            
        if(!validering.valideraSträngTom(lösenord) && validering.valideraLösenord(lösenord)){
            db.uppdateraAgentLösenord(id, lösenord);
            ändrad = true;
        }
        if(!validering.valideraSträngTom(namn) && validering.valideraAgentNamn(namn) && (typ.equals("epost") ||typ.equals("id"))){
            System.out.println(namn);
            db.uppdateraAgentNamn(id, namn); 
            ändrad = true;
        }
        if(!validering.valideraSträngTom(epost) && validering.valideraAgentEpostTypo(epost, true) && (typ.equals("namn") ||typ.equals("id"))){
            db.uppdateraAgentEpost(id, epost); 
            ändrad = true;
        }
        if(!validering.valideraSträngTom(telefon) && validering.valideraAgentTelefonnummer(telefon)){
            db.uppdateraAgentTelefonnummer(id, telefon);
            ändrad = true;
        }
        if(!område.equals("---")){
            områdesID = "";
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
            ändrad = true;  
        }
        if(!validering.valideraSträngTom(admin) && validering.valideraAdminInput(admin)){
            if(!id.equals(anvID)){
                if(admin.equals("ja")){
                    admin = "J";
                }
                else{
                    admin = "N";
                }
                db.uppdateraAdminStatus(id, admin);
                ändrad = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Du kan inte byta din egna administratör status.");
            }
        }
        if(comboBoxChef.getSelectedIndex() == 1 && !validering.valideraSträngTom(txtOmrådesAnsvar.getText())){
            //kollar om områdeschef är användaren
            int områdesID = db.getOmrådeId(txtOmrådesAnsvar.getText());
            if(validering.valideraOmrådeExisterar(txtOmrådesAnsvar.getText(), true) && validering.valideraOmrådeschefPåSpecifik(id, txtOmrådesAnsvar.getText())){
                JOptionPane.showMessageDialog(null, "Du är redan chef här.");
            }       
            //Ändrar användare till områdeschef
            else if(validering.valideraOmrådeExisterar(txtOmrådesAnsvar.getText(), false) && !validering.valideraOmrådesChefExisterarPåOmråde(områdesID)){
                db.taBortOmrådesChef(id);
                db.taBortKontorsChef(id);
                db.läggTillOmrådeschef(id, områdesID);
                ändrad = true;               
            }      
            //Kollar om det redan finns en områdeschef på område.
            else if(validering.valideraOmrådeExisterar(txtOmrådesAnsvar.getText(), false) && validering.valideraOmrådesChefExisterarPåOmråde(områdesID)){
                JOptionPane.showMessageDialog(null, "En chef finns redan på den här positionen.");
            }
        }
        else if(comboBoxChef.getSelectedIndex() == 1 && validering.valideraSträngTom(txtOmrådesAnsvar.getText())){
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i ett områdesansvar");
        }
        
        if(comboBoxChef.getSelectedIndex() == 0 && !validering.valideraSträngTom(txtOmrådesAnsvar.getText())){
            //kollar kontorschef
            if(validering.valideraKontorschefPåSpecifik(id, txtOmrådesAnsvar.getText())){
                JOptionPane.showMessageDialog(null, "Du är redan chef här.");
            }
            //lägger till användaren som kontorschef
            else if(!validering.valideraKontorsBeteckningExisterar(txtOmrådesAnsvar.getText())){
                db.taBortOmrådesChef(id);
                db.taBortKontorsChef(id);
                db.läggTillKontorschef(id, txtOmrådesAnsvar.getText());
                ändrad = true;
            }
            //kollar om det redan finns en kontorschef
            else if(validering.valideraKontorsBeteckningExisterar(txtOmrådesAnsvar.getText()) && !txtOmrådesAnsvar.getText().equals(db.kontrolleraKontorschef(id))){
                JOptionPane.showMessageDialog(null, "En chef finns redan på den här positionen.");
            }
        }
        else if(comboBoxChef.getSelectedIndex() == 0 && validering.valideraSträngTom(txtOmrådesAnsvar.getText())){
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i en kontorsbeteckning.");
        }
        return ändrad;
    }
    
    private void taBortAgent(){
        if(!id.equals(anvID)){
            ArrayList<String> tillhörandeAliens = db.getAlienListaFrånAgentID(id);
            //Ifall agenten inte har något alienansvar
            if(tillhörandeAliens.isEmpty()){
                db.taBortInneharUtrustningVidAgentID(id);
                db.taBortFältAgentVidAgentID(id);
                if(validering.valideraOmrådeschefExisterar(id)){
                    db.taBortOmrådesChef(id);
                }
                if(validering.valideraKontorschefExisterar(id)){
                    db.taBortKontorsChef(id);
                }
                db.taBortAgent(id);
                JOptionPane.showMessageDialog(null, "Agenten är borttagen.");
            }
            //Ifall agenten har alienansvar
            else{
                db.taBortInneharUtrustningVidAgentID(id);
                db.taBortFältAgentVidAgentID(id);
                if(validering.valideraOmrådeschefExisterar(id)){
                    db.taBortOmrådesChef(id);
                }
                if(validering.valideraKontorschefExisterar(id)){
                    db.taBortKontorsChef(id);
                }
                uppdateraAliensKontaktperson(id);
                db.taBortAgent(id);
                JOptionPane.showMessageDialog(null, "Agenten är borttagen.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Du kan inte ta bort dig själv.");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnRensa;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JComboBox<String> comboBoxChef;
    private javax.swing.JComboBox<String> comboBoxOmråde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private javax.swing.JLabel lblAdministratör;
    private javax.swing.JLabel lblAnställningsdatum;
    private javax.swing.JLabel lblChef;
    private javax.swing.JLabel lblDatumHjälp;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFörklaring;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblOmrådesAnsvar;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblinformation;
    private javax.swing.JTextField txtAdministratör;
    private javax.swing.JTextField txtAnställningsdatum;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLösenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtOmrådesAnsvar;
    private javax.swing.JTextField txtTelefonnummer;
    // End of variables declaration//GEN-END:variables
}
