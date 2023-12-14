package mib;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class Databas {
    private InfDB idb;
    
    
    //Skapa db
    public Databas(){
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        
        catch (InfException ex) {
            Logger.getLogger(Databas.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    //Hämtar antal agenter
    public int antalAgenterIDatabas(){
        int mängd = 0;
        ArrayList<String> agenter = hämtaAllaAgentEpost();
        for(String epost : agenter){
            mängd++;
        }
        return mängd;
    }
    
    //Hämtar alla agentNamn
    public ArrayList<String> hämtaAgentNamn(){
        ArrayList<String> agentNamn = new ArrayList<>();
        try{ 
            agentNamn = idb.fetchColumn("SELECT Namn FROM Agent");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return agentNamn;
    }
    
    //Skapa en ny Agent
    public void nyRegistreraAgent(int ID, String namn, String telefon, String anställningsdatum, String Admin, String epost, String lösenord, String område){
        int omrID = hämtaOmrådeId(område);
        String query = "INSERT INTO Agent VALUES(" + ID + ",'" + namn + "','" + telefon + "','" + anställningsdatum + "','" + Admin + "','" + epost + "','" + lösenord + "'," + omrID+ ")";
        System.out.println(query);
        try{
            idb.insert(query);
            System.out.println("DET funka");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    //Hämta områdesID från områdenamn
    public int hämtaOmrådeId(String namn){
        int id = 0;
        String query = "SELECT Omrades_ID FROM Omrade WHERE Benamning= '" + namn + "'";
        try{
            id = Integer.parseInt(idb.fetchSingle(query));
            System.out.println(namn + " har id " + id);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return id;
    }
}
