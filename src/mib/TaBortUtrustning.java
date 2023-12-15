package mib;

import javax.swing.JOptionPane;


public class TaBortUtrustning extends javax.swing.JFrame {
    private Databas db;
    private Validering validering;
    private String valdID;
    private String valdSträng;


    public TaBortUtrustning() {
        initComponents();
        db = new Databas();
        validering = new Validering();
        fyllCombo();
        if(comboBox.getItemCount() == 0){
            comboBox.addItem("Ingen utrustning finns");
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBox = new javax.swing.JComboBox<>();
        btnTaBort = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaBort)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnTaBort)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Combobox
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
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JComboBox<String> comboBox;
    // End of variables declaration//GEN-END:variables
}
