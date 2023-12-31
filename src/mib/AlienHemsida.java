package mib;

public class AlienHemsida extends javax.swing.JFrame {

    private String anvID;
    private String anvTyp;
    
    public AlienHemsida(String anvID, String anvTyp) {
        initComponents();
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

        btnBytLösenord = new javax.swing.JButton();
        btnListaAliens = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        btnLoggaUt = new javax.swing.JButton();
        btnVisaOmrådeschef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBytLösenord.setText("Byt lösenord");
        btnBytLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLösenordActionPerformed(evt);
            }
        });

        btnListaAliens.setText("Lista aliens i ditt område");
        btnListaAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAliensActionPerformed(evt);
            }
        });

        lblRubrik.setText("Välkommen Alien");

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        btnVisaOmrådeschef.setText("Visa områdeschef");
        btnVisaOmrådeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaOmrådeschefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnListaAliens))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnVisaOmrådeschef)))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnLoggaUt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBytLösenord)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblRubrik)
                .addGap(51, 51, 51)
                .addComponent(btnListaAliens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnVisaOmrådeschef)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaUt)
                    .addComponent(btnBytLösenord))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        Inloggning inlog = new Inloggning();
        inlog.show();
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnBytLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLösenordActionPerformed
        BytaLösenord bl = new BytaLösenord(anvID, anvTyp);
        bl.show();
        dispose();
    }//GEN-LAST:event_btnBytLösenordActionPerformed

    private void btnVisaOmrådeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaOmrådeschefActionPerformed
        SeOmrådesChef soc = new SeOmrådesChef(anvID, anvTyp);
        soc.show();
        dispose();
    }//GEN-LAST:event_btnVisaOmrådeschefActionPerformed

    private void btnListaAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAliensActionPerformed
        ListaAliensIDittOmråde listaAliens = new ListaAliensIDittOmråde(anvID, anvTyp);
        listaAliens.show();
        dispose();
    }//GEN-LAST:event_btnListaAliensActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBytLösenord;
    private javax.swing.JButton btnListaAliens;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnVisaOmrådeschef;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
