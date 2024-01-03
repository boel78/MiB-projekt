package mib;

public class AdminHemsida extends javax.swing.JFrame {
    
    private String anvID;
    private String anvTyp;
    
    public AdminHemsida(String anvID, String anvTyp) {
        initComponents();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
        System.out.println(anvID);
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
        btnÄndraTabort = new javax.swing.JButton();
        btnNyRegAgent = new javax.swing.JButton();
        btnTaBortAlien = new javax.swing.JButton();
        btnEnskildAlien = new javax.swing.JButton();

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

        lblRubrik.setText("Välkommen Administratör");

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        btnÄndraTabort.setText("Ändra/Ta bort agent");
        btnÄndraTabort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraTabortActionPerformed(evt);
            }
        });

        btnNyRegAgent.setText("Nyregistrera agent");
        btnNyRegAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyRegAgentActionPerformed(evt);
            }
        });

        btnTaBortAlien.setText("Ta bort alien");
        btnTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAlienActionPerformed(evt);
            }
        });

        btnEnskildAlien.setText("Sök enskild alien");
        btnEnskildAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnskildAlienActionPerformed(evt);
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
                        .addComponent(btnListaAliens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnÄndraTabort)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnÄndraAlienInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(btnVisaTop3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNyregistreraAliens)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegUtrustning))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLoggaUt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBytLösen)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTaBortAlien)
                            .addComponent(btnEnskildAlien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVisaOmrådeschef)
                            .addComponent(btnNyRegAgent))
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblRubrik)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnListaAliens)
                        .addGap(40, 40, 40)
                        .addComponent(btnTaBortAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnEnskildAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnÄndraTabort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNyRegAgent)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisaOmrådeschef)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnÄndraAlienInfo)
                    .addComponent(btnVisaTop3))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNyregistreraAliens)
                    .addComponent(btnRegUtrustning))
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

    private void btnÄndraTabortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraTabortActionPerformed
        EnskildAgentInfo agentInfo = new EnskildAgentInfo(anvID, anvTyp);
        agentInfo.show();
        dispose();
    }//GEN-LAST:event_btnÄndraTabortActionPerformed

    private void btnNyRegAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyRegAgentActionPerformed
        NyregistreraAgent na = new NyregistreraAgent(anvID, anvTyp);
        na.show();
        dispose();
    }//GEN-LAST:event_btnNyRegAgentActionPerformed

    private void btnTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAlienActionPerformed
        TaBortAlien ta = new TaBortAlien(anvID, anvTyp);
        ta.show();
        dispose();
    }//GEN-LAST:event_btnTaBortAlienActionPerformed

    private void btnEnskildAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnskildAlienActionPerformed
        SökEnskildAlien sea = new SökEnskildAlien(anvID, anvTyp);
        sea.show();
        dispose();
    }//GEN-LAST:event_btnEnskildAlienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBytLösen;
    private javax.swing.JButton btnEnskildAlien;
    private javax.swing.JButton btnListaAliens;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnNyRegAgent;
    private javax.swing.JButton btnNyregistreraAliens;
    private javax.swing.JButton btnRegUtrustning;
    private javax.swing.JButton btnTaBortAlien;
    private javax.swing.JButton btnVisaOmrådeschef;
    private javax.swing.JButton btnVisaTop3;
    private javax.swing.JButton btnÄndraAlienInfo;
    private javax.swing.JButton btnÄndraTabort;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
