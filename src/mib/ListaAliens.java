package mib;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

public class ListaAliens extends javax.swing.JFrame {

    private boolean visaPlats;
    private boolean visaRas;
    private boolean visaDatum;
    private String plats;
    private String ras;
    private Databas db;
    private DefaultTableModel model;
    private Validering validering;
    private String kolumnNamn;
    private String frånDatum;
    private String tillDatum;
    private ArrayList<String> idLista;
    private ArrayList<String> rasLista;
    private ArrayList<String> platsLista;
    private ArrayList<String> datumLista;
    private String anvID;
    private String anvTyp;
    
    public ListaAliens(String anvID, String anvTyp) {
        initComponents();
        visaPlats = false;
        visaRas = false;
        visaDatum = false;
        txtFörstaDatum.setVisible(false);
        txtAndraDatum.setVisible(false);
        lblFrån.setVisible(false);
        lblTill.setVisible(false);
        db = new Databas();
        model = (DefaultTableModel) tblInfo.getModel();
        model.setRowCount(0);
        validering = new Validering();
        idLista = new ArrayList<String>();
        rasLista = new ArrayList<String>();
        platsLista = new ArrayList<String>();
        datumLista = new ArrayList<String>();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxPlats = new javax.swing.JComboBox<>();
        txtFörstaDatum = new javax.swing.JTextField();
        txtAndraDatum = new javax.swing.JTextField();
        btnHämta = new javax.swing.JButton();
        comboBoxRas = new javax.swing.JComboBox<>();
        lblPlats = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        btnDatum = new javax.swing.JToggleButton();
        lblRubrik = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        lblFrån = new javax.swing.JLabel();
        lblTill = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboBoxPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Örebro", "Västerås", "Vilhelmina", "Borås", "---" }));
        comboBoxPlats.setSelectedIndex(4);

        txtFörstaDatum.setColumns(10);

        txtAndraDatum.setColumns(10);

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        comboBoxRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Worm", "Boglodite", "Squid", "---" }));
        comboBoxRas.setSelectedIndex(3);
        comboBoxRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRasActionPerformed(evt);
            }
        });

        lblPlats.setText("Plats");

        lblRas.setText("Ras");

        btnDatum.setBackground(java.awt.Color.red);
        btnDatum.setText("Datum");
        btnDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatumActionPerformed(evt);
            }
        });

        lblRubrik.setText("Lista alien info");

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Alien ID", "Namn", "Epost", "Info"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInfo);

        lblFrån.setText("Frånochmed");

        lblTill.setText("Tillochmed");

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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addGap(68, 68, 68)
                        .addComponent(btnHämta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDatum)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFörstaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFrån))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTill)
                                    .addComponent(txtAndraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRubrik))))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlats))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRas))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnDatum)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrån)
                    .addComponent(lblTill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFörstaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAndraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHämta)
                    .addComponent(btnTillbaka))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Datum knappen
    private void btnDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatumActionPerformed
        if(btnDatum.isSelected()){
            btnDatum.setBackground(Color.green);
            txtFörstaDatum.setVisible(true);
            txtAndraDatum.setVisible(true);
            lblFrån.setVisible(true);
            lblTill.setVisible(true);
            visaDatum = true;
        }
        else if(!btnDatum.isSelected()){
            btnDatum.setBackground(Color.red);
            txtFörstaDatum.setVisible(false);
            txtAndraDatum.setVisible(false);
            lblFrån.setVisible(false);
            lblTill.setVisible(false);
            txtFörstaDatum.setText("");
            txtAndraDatum.setText("");
            visaDatum = false;
        }
    }//GEN-LAST:event_btnDatumActionPerformed

    //Hämta knappen
    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        //Tar bort raderna när man klickar hämta
        model.setRowCount(0);
        comboBoxRas();
        comboBoxPlats();     
        if(visaDatum){
        frånDatum = txtFörstaDatum.getText();
        tillDatum = txtAndraDatum.getText();
            if(validering.valideraDatum(tillDatum) && validering.valideraDatum(frånDatum)){
                datumLista = db.getAlienIDMellanDatum(frånDatum, tillDatum);
            }
            else{
               System.out.println("Något är fel med input");
            }
        }
        kombineraListor();
        //Skapar kolumn specifikt för ras och fyller jtable
        for(String id: idLista){
            String rasInfo = "";
            HashMap<String, String> rasInfoLista = db.getRasInformationAllaRaser(id);
            for(String kolumn : rasInfoLista.keySet()){
                //Har man valt att se aliens på datum och/eller område
                if(!kolumn.equals("Alien_ID") && rasInfoLista.get(kolumn) != null){
                    rasInfo = rasInfoLista.get(kolumn);
                    kolumnNamn = kolumn;
                    switch(kolumn){
                        case "Antal_Boogies":
                            ras = "Boglodite";
                            break;
                        case "Antal_Armar":
                            ras = "Squid";
                            break;
                        case "Langd":
                            ras = "Worm";
                            break;
                    }
                } 
                //Ras specifik information
                else if(comboBoxRas.getSelectedIndex() == 3 && !kolumn.equals("Alien_ID")){
                    rasInfo = rasInfoLista.get(kolumn);
                    kolumnNamn = kolumn;
                }
            }
            System.out.println(rasInfo);
            String namn = db.getAlienNamnFrånID(id);
            String epost = db.getAlienEpostFrånID(id);
            if(comboBoxRas.getSelectedIndex() != 3){
                tblInfo.getColumnModel().getColumn(3).setHeaderValue(kolumnNamn);
                model.addRow(new Object[]{id, namn, epost, rasInfo});
            }
            else{
                tblInfo.getColumnModel().getColumn(3).setHeaderValue("Ras");
                model.addRow(new Object[]{id, namn, epost, ras});  
            }
        }
        tblInfo.getTableHeader().resizeAndRepaint();
        rensaUrListorna();
    }//GEN-LAST:event_btnHämtaActionPerformed

    //Gå tillbaka till hemsidan
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
        comboBoxRas();
    }//GEN-LAST:event_comboBoxRasActionPerformed
   
    //Kombinera listor
    private void kombineraListor(){
        if(visaRas && visaPlats && !visaDatum){
            idLista.addAll(rasLista);
            idLista.retainAll(platsLista);
        }
        else if(visaRas && visaDatum && !visaPlats){
            idLista.addAll(rasLista);
            idLista.retainAll(datumLista);
        }
        
        else if(visaDatum && visaPlats && !visaRas){
            idLista.addAll(datumLista);
            idLista.retainAll(platsLista);
        
        }
        else if(visaRas && visaPlats && visaDatum){
            idLista.addAll(rasLista);
            idLista.retainAll(platsLista);
            idLista.retainAll(datumLista);
        }
        
        //När bara en utav rutorna är true
        else if(visaRas && !visaPlats && !visaDatum){
            idLista.addAll(rasLista);
        }
        else if(visaPlats && !visaRas && !visaDatum){
            idLista.addAll(platsLista);
        }
        else if(visaDatum && !visaRas && !visaPlats){
            idLista.addAll(datumLista);
        }
    }
    
    //Tömmer listorna
    private void rensaUrListorna(){
        if(!rasLista.isEmpty() && comboBoxRas.getSelectedItem().toString().equals(ras)){
            rasLista.clear();
        }
        if(!datumLista.isEmpty()){
            datumLista.clear();
        }
        if(!platsLista.isEmpty() && comboBoxPlats.getSelectedItem().toString().equals(plats)){
            platsLista.clear();
        }
        if(!idLista.isEmpty()){
            idLista.clear();
        }
    }
    
    //Ras comboBox
    public void comboBoxRas(){
        ras = comboBoxRas.getSelectedItem().toString(); 
        if(ras.equals("---")){
            visaRas = false;
            rasLista.clear();
        }
        else{
            visaRas = true;
            rasLista = db.getIdnFrånRas(ras);
            model.setColumnCount(4);
            tblInfo.getColumnModel().getColumn(3).setHeaderValue("Info");
        }
    }
    
    //Plats comboBox
    public void comboBoxPlats(){
        plats = comboBoxPlats.getSelectedItem().toString();
        if(plats.equals("---")){
            visaPlats = false;
            platsLista.clear();
        }
        else{
            visaPlats = true;
            String platsID = db.getPlatsIDFrånNamn(plats);
            platsLista = db.getAlienIDnFrånPlats(platsID);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDatum;
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBoxPlats;
    private javax.swing.JComboBox<String> comboBoxRas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFrån;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTill;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtAndraDatum;
    private javax.swing.JTextField txtFörstaDatum;
    // End of variables declaration//GEN-END:variables
}
