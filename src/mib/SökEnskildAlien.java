package mib;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class SökEnskildAlien extends javax.swing.JFrame {
    private Databas db;
    private Validering validering;
    private String anvID;
    private String anvTyp;

    public SökEnskildAlien(String anvID, String anvTyp) {
        initComponents();
        db = new Databas();
        validering = new Validering();
        txtNamn.setEditable(false);
        txtTelefon.setEditable(false);
        txtLösenord.setEditable(false);
        txtEpost.setEditable(false);
        txtDatum.setEditable(false);
        txtPlats.setEditable(false);
        txtRas.setEditable(false);
        txtRasInfo.setEditable(false);
        txtAnsvarigAgent.setEditable(false); 
        this.anvID = anvID;
        this.anvTyp = anvTyp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        btnHämta = new javax.swing.JButton();
        lblNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblLösen = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        lblAnsvAgent = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        lblRasInfo = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        txtLösenord = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        txtPlats = new javax.swing.JTextField();
        txtAnsvarigAgent = new javax.swing.JTextField();
        txtRas = new javax.swing.JTextField();
        txtRasInfo = new javax.swing.JTextField();
        lblRubrik = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        lblNamn.setText("Namn");

        txtNamn.setColumns(5);

        lblTelefon.setText("Telefonnummer");

        lblEpost.setText("Epost");

        lblLösen.setText("Lösenord");

        lblDatum.setText("Registreringsdatum");

        lblPlats.setText("Plats");

        lblAnsvAgent.setText("Ansvarig agent");

        lblRas.setText("Ras");

        lblRasInfo.setText("Ras info");

        txtTelefon.setColumns(5);

        txtEpost.setColumns(5);

        txtLösenord.setColumns(5);

        txtDatum.setColumns(5);

        txtPlats.setColumns(5);

        txtAnsvarigAgent.setColumns(5);

        txtRas.setColumns(5);

        txtRasInfo.setColumns(5);

        lblRubrik.setText("Sök information om enskild alien");

        lblID.setText("Alien ID");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefon)
                                    .addComponent(lblEpost)
                                    .addComponent(lblLösen)
                                    .addComponent(lblNamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEpost, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtTelefon)
                                    .addComponent(txtNamn)
                                    .addComponent(txtLösenord)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblDatum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatum)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHämta)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPlats)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAnsvAgent)
                                    .addGap(3, 3, 3)
                                    .addComponent(txtAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblRasInfo)
                                        .addComponent(lblRas))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRasInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(btnTillbaka))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRubrik)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlats)
                    .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(lblAnsvAgent)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRas)
                    .addComponent(txtRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEpost)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRasInfo)
                    .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLösen)
                    .addComponent(txtLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatum)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHämta))
                .addGap(18, 18, 18)
                .addComponent(btnTillbaka)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        if(!txtID.getText().isEmpty()){
            if(validering.valideraAlienId(Integer.parseInt(txtID.getText()))){
                String ID = txtID.getText();
                String epost = db.getAlienEpostFrånID(ID);
                String plats = setPlatsNamn(db.getPlatsIDFrånAlienID(ID));
                txtNamn.setText(db.getAlienNamnFrånID(ID));
                txtEpost.setText(db.getAlienEpostFrånID(ID));
                txtTelefon.setText(db.getAlienTelefonFrånID(ID));
                txtLösenord.setText(db.getAlienLösenordFrånEpost(epost));
                txtDatum.setText(db.getAlienDatumFrånID(ID));
                txtPlats.setText(plats);
                txtAnsvarigAgent.setText(db.getAliensAnsvarigAgent(ID));
                setRasInfo(ID);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i ett ID.");
        }
    }//GEN-LAST:event_btnHämtaActionPerformed

    //Tillbaka
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

    private String setPlatsNamn(String platsID){
        String namn = "";
        switch(platsID){
            case "1":
                namn = "Örebro";
            break;
            case "2":
                namn = "Västerås";
            break;
            case "3":
                namn = "Västerås";
            break;
            case "4":
                namn = "Borås";
            break;
        }
        return namn;
    }
    
    private void setRasInfo(String id){
        HashMap<String, String> rasMap = db.getRasInformationAllaRaser(id);
        for(String kolumn : rasMap.keySet()){
            if(!kolumn.equals("Alien_ID") && rasMap.get(kolumn) != null){
                switch(kolumn){
                    case "Antal_Boogies":
                        txtRas.setText("Boglodite");
                        lblRasInfo.setText("Antal boogies");
                        txtRasInfo.setText(rasMap.get(kolumn));
                        break;
                    case "Langd":
                        txtRas.setText("Worm");
                        lblRasInfo.setText("Längd");
                        txtRasInfo.setText(rasMap.get(kolumn));
                        break;
                    case "Antal_Armar":
                        txtRas.setText("Squid");
                        lblRasInfo.setText("Antal armar");
                        txtRasInfo.setText(rasMap.get(kolumn));
                        break;
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblAnsvAgent;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLösen;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasInfo;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtAnsvarigAgent;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLösenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtRas;
    private javax.swing.JTextField txtRasInfo;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
