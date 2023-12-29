/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;

/**
 *
 * @author lukasdenfete
 */
public class TaBortAlien extends javax.swing.JFrame {
    private Databas db;
    private Validering validering;
    private String anvID;
    private String anvTyp;

    /**
     * Creates new form TaBortAlien
     */
    public TaBortAlien(String anvID, String anvTyp) {
        initComponents();
        db = new Databas();
        validering = new Validering();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTaBort = new javax.swing.JButton();
        txtNamnAttTaBort = new javax.swing.JTextField();
        lblRubrik = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTaBort.setText("Ta bort");
        btnTaBort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaBortMouseClicked(evt);
            }
        });

        txtNamnAttTaBort.setColumns(8);

        lblRubrik.setText("Ange namn på alien att ta bort");

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
                        .addGap(101, 101, 101)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamnAttTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnTaBort))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtNamnAttTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnTaBort)
                .addGap(30, 30, 30)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Ta bort alien
    private void btnTaBortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaBortMouseClicked
        String namnAttTaBort = txtNamnAttTaBort.getText();
        Integer id = db.hämtaAlienIdFrånNamn(namnAttTaBort);
        if(!namnAttTaBort.isEmpty()){
            if (validering.valideraAlienId(id)) {
                db.taBortRas(id);
                db.taBortAlien(id);
                JOptionPane.showMessageDialog(null, "Tog bort " + namnAttTaBort + " från systemet");
            } else {
                JOptionPane.showMessageDialog(null, namnAttTaBort + " finns inte i systemet eller ogiltigt Alien-ID.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i ett namn");
        }
    }//GEN-LAST:event_btnTaBortMouseClicked

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AdminHemsida ah = new AdminHemsida(anvID, anvTyp);
        ah.show();
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextField txtNamnAttTaBort;
    // End of variables declaration//GEN-END:variables
}
