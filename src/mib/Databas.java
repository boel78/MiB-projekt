package mib;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;

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
    public String getAgentTest(){
       String namn = "";
       try {
       namn =  idb.fetchSingle("SELECT Namn FROM agent WHERE agent_id=1");
       } catch(InfException ex){
           System.out.println("Det blev fel");
       }
       return namn;
    }

    //Hämtar alla agentEmail
    public ArrayList<String> getAllaAgentEpost(){
        ArrayList<String> agentEpost = new ArrayList<>();
        try {
            agentEpost = idb.fetchColumn("SELECT Epost FROM AGENT");
        } catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return agentEpost;
    }

    //Hämtar alla AlienEmail
    public ArrayList<String> getAllaAlienEpost(){
        ArrayList<String> alienEmail = new ArrayList<>();
        try{
            alienEmail = idb.fetchColumn("SELECT Epost FROM Alien");
        } catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return alienEmail;
    }

    //Hämtar AlienLösenord
    public String getAlienLösenordPåEpost(String email, String typ){
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
    public boolean getAdminStatus(String email){
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

//Hämtar alla utrustningsbenämningar
    public ArrayList<String> getUtrustningBenämning(){
        ArrayList<String> utrustning = new ArrayList<>();
          try{
              utrustning = idb.fetchColumn("SELECT Benamning FROM Utrustning");
              }
                catch(InfException ex){
                    System.out.println(ex.getMessage());
                }
        return utrustning;
    }

    //Hämtar antal agenter
    public int antalAgenterIDatabas(){
        int mängd = 0;
        ArrayList<String> agenter = getAllaAgentEpost();
        for(String epost : agenter){
            mängd++;
        }
        return mängd;
    }

    //Hämta utrustnings ID utifrån benämning
    public String getUtrustningID(String benämning){
        String ID = "";
        String query = "SELECT Utrustnings_ID FROM Utrustning WHERE Benamning='" + benämning + "'";
        try{
            ID = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return ID;
    }

    //Ta bort utrustning
    public void taBortUtrustning(String ID){
        String query = "DELETE FROM Utrustning where Utrustnings_ID =" + ID;
        try{
            idb.delete(query);
            System.out.println("Borttaget");
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
      }

      //Ta bort vapen
      public void taBortVapen(String ID){
          String query = "DELETE FROM Vapen where Utrustnings_ID = " + ID;
          try{
              idb.delete(query);
              System.out.println("Borttaget");
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
      }

      //Hämta vapen från ID
      public String getVapenBenämning(String ID){
          String namn = "";
          String query = "SELECT Benamning FROM Vapen where Utrustnings_ID = " + ID;
          try{
              namn = idb.fetchSingle(query);
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
          return namn;
      }

      //Hämta Alla Vapen från ID
      public ArrayList<String> getVapenID(){
          ArrayList<String> vapen = new ArrayList<>();
          try{
              vapen = idb.fetchColumn("SELECT Utrustnings_ID FROM Vapen");
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
          return vapen;
      }

      //Ta bort rad innehar utrustning från utrustningsID
      public void taBortInneharUtrustning(String utrustningsID){
          String query= "DELETE FROM Innehar_Utrustning where Utrustnings_ID = " + utrustningsID;
          try{
              idb.delete(query);
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
      }

      //Hämta UtrustningsID från innehar_Utrustning
      public ArrayList<String> getUtrustningSomInnehas(){
          ArrayList<String> utrustningsID = new ArrayList<>();
          try{
              utrustningsID = idb.fetchColumn("SELECT Utrustnings_ID FROM Innehar_Utrustning");
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
          return utrustningsID;
      }

      //Hämta UtrustningsID från Teknik
      public ArrayList<String> getTeknikID(){
          ArrayList<String> teknik = new ArrayList<>();
          try{
              teknik = idb.fetchColumn("SELECT Utrustnings_ID FROM Teknik");
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
          return teknik;
      }

      //Hämta UtrustningsID från Kommunikation
      public ArrayList<String> getKommunikationID(){
          ArrayList<String> kommunikation = new ArrayList<>();
          try{
              kommunikation = idb.fetchColumn("SELECT Utrustnings_ID FROM Kommunikation");
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
          return kommunikation;
      }

      //Ta bort Teknik utifrån ID
      public void taBortTeknik(String utrustningsID){
          String query= "DELETE FROM Teknik where Utrustnings_ID = " + utrustningsID;
          try{
              idb.delete(query);
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
      }

      //Ta bort Kommunikation utifrån ID
      public void taBortKommunikation(String utrustningsID){
          String query= "DELETE FROM Kommunikation where Utrustnings_ID =" + utrustningsID;
          try{
              idb.delete(query);
              System.out.println("Tog bort kommunikation");
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
      }



    //Hämtar alla agentNamn
    public ArrayList<String> getAgentNamn(){
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
        int omrID = getOmrådeId(område);
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
    public int getOmrådeId(String namn){
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
    
    //Hämta Innehar utrustning utifrån ID
    public ArrayList<HashMap<String, String>> getInneharUtrustningFrånID(String ID){
        ArrayList<HashMap<String, String>> inneharUtrustning = new ArrayList<>();
        String query = "SELECT * FROM Innehar_utrustning where Agent_ID = " + ID;
        try{
            inneharUtrustning = idb.fetchRows(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return inneharUtrustning;   
    }
    
    //Hämta Agent ID från namn
    public String getAgentIDFrånNamn(String namn){
        String id = "";
        String query = "SELECT Agent_ID from Agent where Namn = '" + namn +"'";
        try{
            id = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return id;
    }
    
    //Hämta utrustnings Benämning från ID
    public String getUtrustningsBenämningFrånID(String ID){
        String benämning = "";
        String query= "SELECT Benamning FROM Utrustning where Utrustnings_ID = " + ID;
        try{
           benämning = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return benämning;
    }
    
    public String getNamnFrånEpost(String epost){
        String namn = "";
        String query = "Select namn from agent where Epost = '" + epost + "';";
        try{
            namn = idb.fetchSingle(query);
            }
        catch(InfException ex) {
            System.out.println(ex.getMessage());
        }
        return namn;
    }
}

