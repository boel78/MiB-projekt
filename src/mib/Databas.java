package mib;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;

public class Databas {
    private InfDB idb;
    private Validering validering;
    
    
    //Skapa db
    public Databas(){
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        
        catch (InfException ex) {
            Logger.getLogger(Databas.class.getName()).log(Level.SEVERE, null, ex);
        }
        validering = new Validering();
    }
    
    //Test för att se så databas funkar
    public String hämtaAgentTest(){
       String namn = "";
       try {
       namn =  idb.fetchSingle("SELECT Namn FROM agent WHERE agent_id=1");
       } catch(InfException ex){
           System.out.println("Det blev fel");
       }
       return namn;
    }
    
    //Hämtar alla agentEmail
    public ArrayList<String> hämtaAllaAgentEpost(){
        ArrayList<String> agentEpost = new ArrayList<>();
        try { 
            agentEpost = idb.fetchColumn("SELECT Epost FROM AGENT");
        } catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return agentEpost;
    }
    
    //Hämtar alla AlienEmail
    public ArrayList<String> hämtaAllaAlienEpost(){
        ArrayList<String> alienEmail = new ArrayList<>();
        try{
            alienEmail = idb.fetchColumn("SELECT Epost FROM Alien");
        } catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return alienEmail;
    }
    
    //Hämtar AlienLösenord
    public String hämtaAlienLösenordPåEpost(String email, String typ){
        System.out.println(typ);
        if(typ.equals("Admin")){
            typ = "Agent";
        }
        String query = "SELECT Losenord FROM " + typ + " where Epost= '" + email + "'";
        
        String alienLösen = "";
        try {
            alienLösen = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return alienLösen;
    }
    
    //Är Admin
    public boolean hämtaAdminStatus(String email){
        boolean admin = false;
        String query = "SELECT Administrator FROM Agent where Epost= '" + email + "'";
        
        try{
            String status = idb.fetchSingle(query);
            if(status.equals("J")){
                admin = true;
            }
        } catch(InfException ex){
                System.out.println(ex.getMessage());
        }
        return admin;
    }
    
        // hämta all info om en alien utifrån ID.
    public HashMap<String,String> hämtaAlienInfo(int ID) {
        String query = "SELECT * FROM alien WHERE alien_id=" + ID;
        HashMap<String,String> alien = new HashMap<>();
        try {
        alien = idb.fetchRow(query);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
        return alien;
    }
    // ta bort alien utifrån ID.
    public void taBortAlien(int ID) throws InfException {
        String query = "DELETE FROM alien WHERE alien_id=" + ID;
        try {
            idb.delete(query);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
        // hämta en aliens id utifrån namnet.
public int hämtaAlienIdFrånNamn(String namn) {
    String query = "SELECT alien_id FROM Alien WHERE namn= '" + namn + "'";
    int id = 0;
    try {
        String strängId = idb.fetchSingle(query);

        if (strängId != null && !strängId.isEmpty()) {
            id = Integer.parseInt(strängId);
        }
    } catch (InfException ex) {
        System.out.println(ex.getMessage());
    }
    return id;
}
        
    
    //ta bort ras på alien utifrån id.
    public void taBortRas(int id) throws InfException {

        idb.delete("DELETE FROM Boglodite WHERE Alien_ID=" + id);
        idb.delete("DELETE FROM Squid WHERE Alien_ID=" + id);
        idb.delete("DELETE FROM Worm WHERE Alien_ID=" + id);        
}
    public void registreraNyAlien(int id, String datum, String epost, String lösenord, String namn, String telefon, int plats, int ansvarigAgent){
        try {
        if(validering.valideraAlienEpostFinns(epost)){
            String query = "INSERT INTO Alien (Alien_ID, Registreringsdatum, Epost, Losenord, Namn, Telefon, Plats, Ansvarig_Agent)" +
            "VALUES (" + id + ", '" + datum + "', '" + epost + "', '" + lösenord + "', '" + namn + "', '" + telefon + "', '" + plats + "', '" + ansvarigAgent + "')";
        idb.insert(query); 
            System.out.println("Ny alien har registrerats.");
        
        } else {
            System.out.println("Eposten finns redan i systemet.");
        }
        } catch(InfException e){
            System.out.println("Fel vid registrering av ny alien.");
        }
            
    }
}
    
    
