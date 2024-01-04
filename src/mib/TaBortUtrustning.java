package mib;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TaBortUtrustning extends javax.swing.JFrame {
    private Databas db;
    private Validering validering;
    private String valdID;
    private String valdSträng;
    private String valdTyp;
    private String kategoriText;
    private String anvID;
    private String anvTyp;

    public TaBortUtrustning(String anvID, String anvTyp) {
        initComponents();
        db = new Databas();
        validering = new Validering();
        fyllCombo();
        if(comboBox.getItemCount() == 0){
            comboBox.addItem("Ingen utrustning finns");
        }
        setKolumnITabell();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
        System.out.println(anvTyp);
        if(anvTyp.equals("Agent")){
            lblTaBort.setVisible(false);
            comboBox.setVisible(false);
            btnTaBort.setVisible(false);
        }
        else{
            lblTaBort.setVisible(true);
            comboBox.setVisible(true);
            btnTaBort.setVisible(true);
        }
        setDataITabell();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBox = new javax.swing.JComboBox<>();
        btnTaBort = new javax.swing.JButton();
        table = new javax.swing.JTable();
        lblTaBort = new javax.swing.JLabel();
        comboBoxValAvTyp = new javax.swing.JComboBox<>();
        txtBenämning = new javax.swing.JTextField();
        txtÖvrigInfo = new javax.swing.JTextField();
        btnLäggTill = new javax.swing.JButton();
        lblBenämning = new javax.swing.JLabel();
        lblKategoriTyp = new javax.swing.JLabel();
        lblDinUtrustning = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        lblRegistreraNyUtrustning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Datum", "UtrustningsID", "Benämning"
            }
        ));

        lblTaBort.setText("Ta bort");

        comboBoxValAvTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kommunikation", "Vapen", "Teknik" }));
        comboBoxValAvTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxValAvTypActionPerformed(evt);
            }
        });

        txtBenämning.setColumns(12);

        txtÖvrigInfo.setColumns(12);

        btnLäggTill.setText("Lägg till");
        btnLäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillActionPerformed(evt);
            }
        });

        lblBenämning.setText("Benämning");

        lblKategoriTyp.setText("Överföringsteknik");

        lblDinUtrustning.setText("Din kvitterade utrustning");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblRubrik.setText("Utrustning");

        lblRegistreraNyUtrustning.setText("Registrera ny utrustning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDinUtrustning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaBort, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTaBort)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxValAvTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBenämning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBenämning))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtÖvrigInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKategoriTyp)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addGap(43, 43, 43)
                        .addComponent(btnLäggTill))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblRegistreraNyUtrustning)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTaBort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaBort)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRubrik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(lblDinUtrustning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                        .addComponent(lblRegistreraNyUtrustning)
                        .addGap(18, 18, 18)))
                .addComponent(comboBoxValAvTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBenämning)
                    .addComponent(lblKategoriTyp))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBenämning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtÖvrigInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLäggTill)
                    .addComponent(btnTillbaka)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Combobox ta bort
    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        valdSträng = comboBox.getSelectedItem().toString();
        valdID = db.getUtrustningID(valdSträng);
    }//GEN-LAST:event_comboBoxActionPerformed

    //Ta bort knappen
    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        if(!comboBox.getItemAt(0).equals("Ingen utrustning finns")){
            tabortVapen();
            tabortTeknik();
            tabortInneharUtrustning();
            tabortKommunikation();
            db.taBortUtrustning(valdID);
            System.out.println("Tog bort utrustning " + valdID);
            comboBox.removeItem(valdSträng);
            valideraCombo();           
        }
        else{
            JOptionPane.showMessageDialog(null, "Det finns ingen utrustning att ta bort");
        }
    }//GEN-LAST:event_btnTaBortActionPerformed

    //Combobox val utav typ
    private void comboBoxValAvTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxValAvTypActionPerformed
        valdTyp = comboBoxValAvTyp.getSelectedItem().toString();
        kategoriText = "";
        switch(valdTyp){
            case "Vapen": kategoriText = "Kaliber";
            break;
            case "Teknik": kategoriText = "Kraftkälla";
            break;
            case "Kommunikation": kategoriText = "Överföringsteknik";
            break;
        }
        lblKategoriTyp.setText(kategoriText);
    }//GEN-LAST:event_comboBoxValAvTypActionPerformed

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

    //Lägg till knappen
    private void btnLäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillActionPerformed
        if(!txtBenämning.getText().isEmpty() && !txtÖvrigInfo.getText().isEmpty()){
            if(validering.valideraUtrustning(txtBenämning.getText())){
                db.nyregistreraUtrustning(txtBenämning.getText(),valdTyp ,txtÖvrigInfo.getText());
                JOptionPane.showMessageDialog(null, "Utrustningen har lagts till.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i fälten med det du vill lägga till.");
        }
    }//GEN-LAST:event_btnLäggTillActionPerformed
  
    //Ta bort utrustning metod
    public void taBortUtrustning(String namn){
        for(String namnet : db.getUtrustningBenämning()){
            if(namn.equals(namnet)){
                String ID = db.getUtrustningID(namn);
                db.taBortUtrustning(ID);
            }
        }
    }
    
    //Fyll Combolistan med benämningar
    public void fyllCombo(){
        for(String benämning : db.getUtrustningBenämning()){
            comboBox.addItem(benämning);
        }
    }
    
    //Kollar om comboItem redan finns annars lägger den till
    public void valideraCombo(){
        for(int i = 0; i<comboBox.getItemCount(); i++){
            String benämning = db.getUtrustningBenämning().get(i);
            if(!comboBox.getItemAt(i).equals(benämning)){
                comboBox.addItem(benämning);
            }
        }
    }
    
    //metoder för alla fall utav foreign keys och dylikt
    private void tabortVapen(){
        if(validering.valideraVapenExisterar(valdID)){
            db.taBortVapen(valdID);
            JOptionPane.showMessageDialog(null, "Tog bort vapen " + valdID);
        }
    }
    
    private void tabortInneharUtrustning(){
        if(validering.valideraOmUtrustningInnehas(valdID)){
            db.taBortInneharUtrustning(valdID);
            JOptionPane.showMessageDialog(null, "Tog bort inneharUtrustning " + valdID);
        }
    }
    
    private void tabortKommunikation(){
        if(validering.valideraKommunikationUtrustningsID(valdID)){
            db.taBortKommunikation(valdID);
            JOptionPane.showMessageDialog(null, "Tog bort Kommunikation " + valdID);
        }
    }
    
    private void tabortTeknik(){
        if(validering.valideraTeknikUtrustningsID(valdID)){
            db.taBortTeknik(valdID);
            JOptionPane.showMessageDialog(null, "Tog bort Teknik " + valdID);
        }
    }
    
    //Metod för att ladda in i listan efter ditt ID
    public void setDataITabell(){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        //HashMap<String, String> rader = db.getInneharUtrustningFrånID(ID);
        ArrayList<HashMap<String, String>> listaMedMaps = db.getInneharUtrustningFrånID(anvID);
        for(int index = 0; index < listaMedMaps.size(); index++){
            HashMap<String, String> rader = listaMedMaps.get(index);
            if(rader.containsKey("Agent_ID")){
                rader.remove("Agent_ID");
            }
            Object[] row = new Object[2];
            int i = 0;
            for(String värde : rader.keySet()){
                row[i] = rader.get(värde);
                if(värde.equals("Utrustnings_ID")){
                    row[i] = db.getUtrustningsBenämningFrånID(rader.get(värde));
                }
            i++;
            }
            model.addRow(row);
        }
    } 
    
    public void setKolumnITabell(){
        Object[] row = {"Benämning", "Datum",};
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(row);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JComboBox<String> comboBoxValAvTyp;
    private javax.swing.JLabel lblBenämning;
    private javax.swing.JLabel lblDinUtrustning;
    private javax.swing.JLabel lblKategoriTyp;
    private javax.swing.JLabel lblRegistreraNyUtrustning;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTaBort;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtBenämning;
    private javax.swing.JTextField txtÖvrigInfo;
    // End of variables declaration//GEN-END:variables
}
