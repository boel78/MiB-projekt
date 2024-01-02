package mib;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListaAliensIDittOmråde extends javax.swing.JFrame {
    private Databas db;
    private DefaultTableModel model;
    private String anvID;
    private String anvTyp;

    public ListaAliensIDittOmråde(String anvID, String anvTyp) {
        initComponents();
        db = new Databas();
        model = (DefaultTableModel) table.getModel();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
        fyllLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblRubrik = new javax.swing.JLabel();
        lblTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Namn", "Epost", "Telefonnummer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        lblRubrik.setText("Alla aliens i ditt område");

        lblTillbaka.setText("Tillbaka");
        lblTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTillbaka)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(lblRubrik)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fyllLista(){
        String dinPlats = db.getPlatsIDFrånAlienID(anvID);
        String områdesID = db.getOmrådesIDFrånPlatsID(dinPlats);
        ArrayList<String> platser = db.getPlatser(områdesID);
        for(String platsID : platser){
            ArrayList<String> alienIDn = db.getAlienIDnFrånPlats(platsID);
            for(String alienID : alienIDn){
                String namn = db.getAlienNamnFrånID(alienID);
                String epost = db.getAlienEpostFrånID(alienID);
                String telefon = db.getAlienTelefonFrånID(alienID);
                model.addRow(new Object[]{namn, epost, telefon});
            }
        }
    }
    
    private void lblTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTillbakaActionPerformed
        AlienHemsida aliensida = new AlienHemsida(anvID, anvTyp);
        aliensida.show();
        dispose();
    }//GEN-LAST:event_lblTillbakaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JButton lblTillbaka;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
