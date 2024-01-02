package mib;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class VisaTop3Agenter extends javax.swing.JFrame {

    private Databas db;
    private String områdeID;
    private DefaultListModel mod;
    private String anvID;
    private String anvTyp;

    public VisaTop3Agenter(String anvID, String anvTyp) {
        initComponents();
        db = new Databas();
        mod = new DefaultListModel();
        listAgenter.setModel(mod);
        this.anvID = anvID;
        this.anvTyp = anvTyp;      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOmråde = new javax.swing.JLabel();
        btnHämta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAgenter = new javax.swing.JList<>();
        comboBox = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOmråde.setText("Område");

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listAgenter);

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));

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
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblOmråde)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHämta)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblOmråde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnHämta)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Hämta knapp
    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        if(!mod.isEmpty()){
            mod.clear();
        }
        String område = comboBox.getSelectedItem().toString();
        områdeID = db.getOmrådeId(område).toString();
        String agentID = "";
        ArrayList<Integer> listan = räknaUtTopTre();
        for(Integer id : listan){
           mod.addElement(db.getAgentNamnFrånID(id));
        }      
    }//GEN-LAST:event_btnHämtaActionPerformed

    //Tillbaka till hemsidan
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        AgentHemsida agentHemsida = new AgentHemsida(anvID, anvTyp);
        agentHemsida.show();
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed
    
    private ArrayList<Integer> omvandlaStringTillInt(ArrayList<String> stringLista){
        ArrayList<Integer> nummerLista = new ArrayList<>();
        for(String sträng : stringLista){
            nummerLista.add(Integer.parseInt(sträng));
        }
        return nummerLista;
    }

    //Metoden listar alla agenter och räknar ut hur många gånger dom kommer upp.
    private ArrayList<int[]> listaAllaAgentersAntal(){
        ArrayList<int[]> agenterAntal = new ArrayList<>();
        ArrayList<String> agenterInstanserSträngar = db.hämtaAgenterSomAnsvararFrånOmrådeID(områdeID);
        ArrayList<Integer> agenterna = omvandlaStringTillInt(agenterInstanserSträngar);      
        for(Integer agentID : agenterna){
            //Om listan är tom
            if(agenterAntal.size() == 0){
                int[] nyttAgentIndex = {agentID, 1};
                agenterAntal.add(nyttAgentIndex);
            }
            
            //Om listan inte är tom
            else{
                boolean hittad = false;
                for(int[] agentRegister : agenterAntal){
                    if(agentRegister[0] == agentID){
                        agentRegister[1] = agentRegister[1] + 1;
                        hittad = true;
                    }
                }
                if(!hittad){
                    int[] nyttAgentIndex = {agentID, 1};
                    agenterAntal.add(nyttAgentIndex);
                }
            }      
        }       
        return agenterAntal;
    }
    
    //Metoden räknar ut top tre utifrån alla agenterna som skickas in med deras antal. Returnerar top 3 agenternas IDn
    private ArrayList<Integer> räknaUtTopTre(){
        ArrayList<int[]> agenter = listaAllaAgentersAntal();
        ArrayList<Integer> topTre = new ArrayList<>();
        int maxAgent = 0;
        int maxAntal = 0;
        int tvåAgent = 0;
        int tvåAntal = 0;
        int treAgent = 0;
        int treAntal = 0;
        for(int[] agent : agenter){
            if(agent[1] >= maxAntal){
                maxAgent = agent[0];
                topTre.add(0, maxAgent);
                maxAntal = agent[1];
            }
            else if(agent[1] > tvåAntal && agent[1] < maxAntal){
                tvåAgent = agent[0];
                topTre.add(1, tvåAgent);
                tvåAntal = agent[1];
            }
            else if(agent[1] > treAntal && agent[1] < tvåAntal){
                treAgent = agent[0];
                topTre.add(3, treAgent);
                treAntal = agent[1];
            }
        }
        return topTre;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JList<String> listAgenter;
    // End of variables declaration//GEN-END:variables
}
