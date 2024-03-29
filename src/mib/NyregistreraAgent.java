package mib;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class NyregistreraAgent extends javax.swing.JFrame {
    private Databas db;
    private String agentNamn;
    private String datum;
    private String telefonnummer;
    private String lösenord;
    private String typ = "N";
    private Validering validering;
    private String område = "Svealand";
    private String epost = "";
    private String anvID;
    private String anvTyp;

    public NyregistreraAgent(String anvID, String anvTyp) {
        initComponents();
        db = new Databas();
        validering = new Validering();
        this.anvID = anvID;
        this.anvTyp = anvTyp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        txtAgentNamn = new javax.swing.JTextField();
        lblAgentNamn = new javax.swing.JLabel();
        lblTelefonnummer = new javax.swing.JLabel();
        txtTelefonnummer = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        lblDatum = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        pwField = new javax.swing.JPasswordField();
        btnSkapa = new javax.swing.JButton();
        tbtnAdmin = new javax.swing.JToggleButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        comboBox = new javax.swing.JComboBox<>();
        lblOmråde = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setText("Nyregistrera agent");

        txtAgentNamn.setColumns(6);

        lblAgentNamn.setText("Agentnamn");

        lblTelefonnummer.setText("Telefonnummer");

        txtTelefonnummer.setColumns(10);

        txtDatum.setColumns(12);

        lblDatum.setText("Datum");

        lblLösenord.setText("Lösenord");

        pwField.setColumns(12);

        btnSkapa.setText("Skapa");
        btnSkapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaActionPerformed(evt);
            }
        });

        tbtnAdmin.setText("Inte Admin");
        tbtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnAdminActionPerformed(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        lblOmråde.setText("Område");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setText("(ÅÅÅÅ-MM-DD)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDatum)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSkapa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTillbaka))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(lblLösenord)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(tbtnAdmin)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefonnummer)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAgentNamn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOmråde)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblRubrik)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAgentNamn)
                                .addComponent(lblTelefonnummer))
                            .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filler2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDatum)
                                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblLösenord, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOmråde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSkapa)
                            .addComponent(tbtnAdmin)
                            .addComponent(btnTillbaka))))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Skapa konto knappen
    private void btnSkapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaActionPerformed
        agentNamn = txtAgentNamn.getText();
        datum = txtDatum.getText();
        telefonnummer = txtTelefonnummer.getText();  
        lösenord = pwField.getText();      
        //Skapar agenten via databasklassen
        Integer nyttID = (db.getNyttAgentID());
        if(validering.valideraLösenord(pwField.getText()) && validering.valideraAgentTelefonnummer(txtTelefonnummer.getText()) && validering.valideraDatum(txtDatum.getText()) && validering.valideraAgentNamn(agentNamn)){
            epost = skapaEpost(agentNamn);
            db.nyRegistreraAgent(nyttID, agentNamn, telefonnummer, datum, typ, epost, lösenord, område);
            JOptionPane.showMessageDialog(null, "Agenten har registrerats.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Något blev fel. Se till att det inte finns några stavfel och att alla fält är fyllda.");
        }    
    }//GEN-LAST:event_btnSkapaActionPerformed

    //Kod för admin knappen
    private void tbtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnAdminActionPerformed
        String text = tbtnAdmin.getText();
        if(text.equals("Inte Admin")){
            tbtnAdmin.setText("Admin");
            typ = "J";
        }
        else if(text.equals("Admin")){
            tbtnAdmin.setText("Inte Admin");
            typ = "N";
        }
    }//GEN-LAST:event_tbtnAdminActionPerformed

    //Kod för combobox Område
    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        JComboBox comboBox = (JComboBox) evt.getSource();
        Object selected = comboBox.getSelectedItem();
        if(selected.toString().equals("Götaland")){
            område = "Götaland";
            System.out.println(område);
        }
        else if(selected.toString().equals("Norrland")){
            område = "Norrland";
            System.out.println(område);
        }
        else if(selected.toString().equals("Svealand")){
            område = "Svealand";
            System.out.println(område);
        }              
    }//GEN-LAST:event_comboBoxActionPerformed

    //Tillbaka knapp
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AdminHemsida ah = new AdminHemsida(anvID, anvTyp);
        ah.show();
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Skapar en agentEpost
    public String skapaEpost(String agentNamn){
        int counts = 1;
        String[] delar = agentNamn.split(" ");
        String epost = "a" + delar[1].toLowerCase() + "@mib.net";
        for(String id : db.getAgentIDn()){
            String epostIDatabas = db.getAgentsEpost(id);
            if(epostIDatabas.equals(epost)){
                counts++;
                epost = "a" + delar[1].toLowerCase() + counts + "@mib.net";
                JOptionPane.showMessageDialog(null, "Det fanns redan en agent med samma namn. Den nya eposten har därför blivit: " + epost);
            }
        }
        return epost;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkapa;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgentNamn;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefonnummer;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JToggleButton tbtnAdmin;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtTelefonnummer;
    // End of variables declaration//GEN-END:variables
}


//AgentID
//Namn
//Telefon
//AnstallningsDatum
//Admin
//epost
//Lösenord
//Område Foreignkey