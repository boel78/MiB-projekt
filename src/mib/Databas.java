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
    
    
}
