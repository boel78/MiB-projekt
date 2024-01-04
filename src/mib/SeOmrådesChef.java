package mib;

import javax.swing.table.DefaultTableModel;

public class SeOmrådesChef extends javax.swing.JFrame {
    private Databas databas;
    private DefaultTableModel model;
    private String anvID;
    private String anvTyp;
    private String områdesID;

    public SeOmrådesChef(String anvID, String anvTyp) {
        initComponents();
        databas = new Databas();
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        this.anvID = anvID;
        this.anvTyp = anvTyp;
        setup(anvTyp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblRubrik = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        comboBoxOmråde = new javax.swing.JComboBox<>();
        lblOmråde = new javax.swing.JLabel();
        btnHämta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Namn", "Epost", "Telefon"
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

        lblRubrik.setText("Chef för ditt område");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        comboBoxOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));

        lblOmråde.setText("Område");

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTillbaka)
                        .addGap(78, 78, 78)
                        .addComponent(btnHämta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(lblRubrik)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOmråde)
                            .addComponent(comboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrik)
                    .addComponent(lblOmråde))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(comboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(btnHämta))
                .addGap(126, 126, 126))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Tillbaka till hemsidan
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if(anvTyp.equals("Agent")){
            AgentHemsida agentHemsida = new AgentHemsida(anvID, anvTyp);
            agentHemsida.show();
            dispose();
        }
        else if(anvTyp.equals("Alien")){
            AlienHemsida aliensida = new AlienHemsida(anvID, anvTyp);
            aliensida.show();
            dispose();
        }
        else if(anvTyp.equals("Admin")){
            AdminHemsida adminsida = new AdminHemsida(anvID, anvTyp);
            adminsida.show();
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        fyllListan();
    }//GEN-LAST:event_btnHämtaActionPerformed

    private void fyllListan(){
        model.setRowCount(0);
        if(anvTyp.equals("Alien")){
            String alienID = anvID;
            områdesID = databas.getOmrådesIDFrånPlatsID(databas.getPlatsIDFrånAlienID(alienID));
        }
        else {
            switch(comboBoxOmråde.getSelectedIndex()){
                case 0:
                    områdesID = "1";
                    break;
                case 1:
                    områdesID = "2";
                    break;
                case 2:
                    områdesID = "4";
                    break;
            } 
        }
        String områdesChef = databas.getOmrådesChef(områdesID);
        String agentEpost = databas.getAgentsEpost(områdesChef);
        String agentTelefon = databas.getAgentsTelefon(områdesChef);
        String agentNamn = databas.getAgentsNamn(områdesChef);
        model.addRow(new Object[] {agentNamn, agentEpost, agentTelefon});
    }
    
    private void setup(String anvTyp){
        if(anvTyp.equals("Alien")){
            lblRubrik.setText("Chef för ditt område.");
            btnHämta.setVisible(false);
            lblOmråde.setVisible(false);
            comboBoxOmråde.setVisible(false);
            fyllListan();
        }
        else{
            lblRubrik.setText("Sök områdeschef");
            btnHämta.setVisible(true);
            lblOmråde.setVisible(true);
            comboBoxOmråde.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBoxOmråde;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
