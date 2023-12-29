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
    private String agentID;


    public TaBortUtrustning() {
        initComponents();
        db = new Databas();
        validering = new Validering();
        fyllCombo();
        if(comboBox.getItemCount() == 0){
            comboBox.addItem("Ingen utrustning finns");
        }
        setKolumnITabell();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBox = new javax.swing.JComboBox<>();
        btnTaBort = new javax.swing.JButton();
        jTable1 = new javax.swing.JTable();
        txtAgentNamn = new javax.swing.JTextField();
        txtAdmin = new javax.swing.JTextField();
        lblAgent = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblTaBort = new javax.swing.JLabel();
        comboBoxValAvTyp = new javax.swing.JComboBox<>();
        txtBenämning = new javax.swing.JTextField();
        txtÖvrigInfo = new javax.swing.JTextField();
        btnLäggTill = new javax.swing.JButton();
        lblBenämning = new javax.swing.JLabel();
        lblKategoriTyp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnHämta = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Datum", "UtrustningsID", "Benämning"
            }
        ));

        txtAgentNamn.setColumns(6);
        txtAgentNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgentNamnActionPerformed(evt);
            }
        });

        txtAdmin.setColumns(3);
        txtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminActionPerformed(evt);
            }
        });

        lblAgent.setText("Agent");

        lblAdmin.setText("Admin");

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

        lblBenämning.setText("Benämning");

        lblKategoriTyp.setText("Överföringsteknik");

        jLabel1.setText("Dina kvitterade grejer");

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblAgent)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAdmin)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTaBort)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23)
                                .addComponent(btnHämta))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaBort, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
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
                        .addComponent(btnLäggTill)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgent)
                    .addComponent(lblAdmin))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(btnTaBort)
                                .addGap(93, 93, 93))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnHämta)
                                .addGap(18, 18, 18)
                                .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTaBort)
                        .addContainerGap())))
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

    private void txtAgentNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgentNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgentNamnActionPerformed

    private void txtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminActionPerformed

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

    //Hämta knappen
    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        setDataITabell();
                if(txtAdmin.getText().equals("Nej")){
                    lblTaBort.setVisible(false);
                    comboBox.setVisible(false);
                    btnTaBort.setVisible(false);
        }
                else{
                    lblTaBort.setVisible(true);
                    comboBox.setVisible(true);
                    btnTaBort.setVisible(true);
                }
    }//GEN-LAST:event_btnHämtaActionPerformed

    //Tillbaka till hemsidan
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AgentHemsida agentHemsida = new AgentHemsida();
        agentHemsida.show();
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed


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
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaBortUtrustning().setVisible(true);
            }
        });
    }
    
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
            System.out.println("Tog bort vapen " + valdID);
        }
    }
    
    private void tabortInneharUtrustning(){
    if(validering.valideraOmUtrustningInnehas(valdID)){
            db.taBortInneharUtrustning(valdID);
            System.out.println("Tog bort inneharUtrustning " + valdID);
        }
    }
    
    private void tabortKommunikation(){
        if(validering.valideraKommunikationUtrustningsID(valdID)){
            db.taBortKommunikation(valdID);
            System.out.println("Tog bort Kommunikation " + valdID);
        }
    }
    
    private void tabortTeknik(){
        if(validering.valideraTeknikUtrustningsID(valdID)){
            db.taBortTeknik(valdID);
            System.out.println("Tog bort Teknik " + valdID);
        }
    }
    
    //Metod för att ladda in i listan efter ditt ID
    public void setDataITabell(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        String ID = db.getAgentIDFrånNamn(txtAgentNamn.getText());
        //HashMap<String, String> rader = db.getInneharUtrustningFrånID(ID);
        ArrayList<HashMap<String, String>> listaMedMaps = db.getInneharUtrustningFrånID(ID);
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
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(row);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnLäggTill;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JComboBox<String> comboBoxValAvTyp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblBenämning;
    private javax.swing.JLabel lblKategoriTyp;
    private javax.swing.JLabel lblTaBort;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JTextField txtBenämning;
    private javax.swing.JTextField txtÖvrigInfo;
    // End of variables declaration//GEN-END:variables
}
