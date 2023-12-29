/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

/**
 *
 * @author joakimfockstedt
 */
public class AgentHemsida extends javax.swing.JFrame {

    private String anvID;
    private String anvTyp;
    
    public AgentHemsida(String anvID, String anvTyp) {
        initComponents();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBytLösen = new javax.swing.JButton();
        btnListaAliens = new javax.swing.JButton();
        btnNyregistreraAliens = new javax.swing.JButton();
        btnVisaOmrådeschef = new javax.swing.JButton();
        btnRegUtrustning = new javax.swing.JButton();
        btnVisaTop3 = new javax.swing.JButton();
        btnÄndraAlienInfo = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        btnLoggaUt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBytLösen.setText("Byt lösenord");
        btnBytLösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLösenActionPerformed(evt);
            }
        });

        btnListaAliens.setText("Lista aliens");
        btnListaAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAliensActionPerformed(evt);
            }
        });

        btnNyregistreraAliens.setText("Nyregistrera Aliens");
        btnNyregistreraAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyregistreraAliensActionPerformed(evt);
            }
        });

        btnVisaOmrådeschef.setText("Visa områdeschef");
        btnVisaOmrådeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaOmrådeschefActionPerformed(evt);
            }
        });

        btnRegUtrustning.setText("Utrustningssidan");
        btnRegUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegUtrustningActionPerformed(evt);
            }
        });

        btnVisaTop3.setText("Visa top 3 agenter per område");
        btnVisaTop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaTop3ActionPerformed(evt);
            }
        });

        btnÄndraAlienInfo.setText("Ändra alieninfo");
        btnÄndraAlienInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraAlienInfoActionPerformed(evt);
            }
        });

        lblRubrik.setText("Välkommen Agent");

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblRubrik)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnÄndraAlienInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegUtrustning))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNyregistreraAliens)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(btnVisaTop3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnListaAliens)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVisaOmrådeschef)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLoggaUt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBytLösen)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaAliens)
                    .addComponent(btnVisaOmrådeschef))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegUtrustning)
                    .addComponent(btnÄndraAlienInfo))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisaTop3)
                    .addComponent(btnNyregistreraAliens))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBytLösen)
                    .addComponent(btnLoggaUt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Byt lösenord
    private void btnBytLösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLösenActionPerformed
       BytaLösenord lösensida = new BytaLösenord(anvID, anvTyp);
       lösensida.show();
       dispose();
    }//GEN-LAST:event_btnBytLösenActionPerformed

    //logga ut knapp
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        Inloggning inlog = new Inloggning();
        inlog.show();
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    //Lista aliens
    private void btnListaAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAliensActionPerformed
        ListaAliens listaAliens = new ListaAliens(anvID, anvTyp);
        listaAliens.show();
        dispose();
    }//GEN-LAST:event_btnListaAliensActionPerformed

    //Ändra aliens
    private void btnÄndraAlienInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraAlienInfoActionPerformed
        ÄndraAlienInfo ändraAlien = new ÄndraAlienInfo(anvID, anvTyp);
        ändraAlien.show();
        dispose();
    }//GEN-LAST:event_btnÄndraAlienInfoActionPerformed

    //Nyregistrera alien
    private void btnNyregistreraAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyregistreraAliensActionPerformed
        NyregistreraAlien na = new NyregistreraAlien(anvID, anvTyp);
        na.show();
        dispose();
    }//GEN-LAST:event_btnNyregistreraAliensActionPerformed

    //Visa områdeschef
    private void btnVisaOmrådeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaOmrådeschefActionPerformed
        SeOmrådesChef soc = new SeOmrådesChef(anvID, anvTyp);
        soc.show();
        dispose();
    }//GEN-LAST:event_btnVisaOmrådeschefActionPerformed

    //Utrustningssida
    private void btnRegUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUtrustningActionPerformed
        TaBortUtrustning utrustningsida = new TaBortUtrustning(anvID, anvTyp);
        utrustningsida.show();
        dispose();
    }//GEN-LAST:event_btnRegUtrustningActionPerformed

    //Visa top 3 agenter
    private void btnVisaTop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaTop3ActionPerformed
        VisaTop3Agenter v3a = new VisaTop3Agenter(anvID, anvTyp);
        v3a.show();
        dispose();
    }//GEN-LAST:event_btnVisaTop3ActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBytLösen;
    private javax.swing.JButton btnListaAliens;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnNyregistreraAliens;
    private javax.swing.JButton btnRegUtrustning;
    private javax.swing.JButton btnVisaOmrådeschef;
    private javax.swing.JButton btnVisaTop3;
    private javax.swing.JButton btnÄndraAlienInfo;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
