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

    //Hämtar AlienLösenord från epost
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
    public Integer getOmrådeId(String namn){
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

    //Hämta Agent namn från ID
    public String getAgentNamnFrånID(int id){
        String namn = "";
        String query = "SELECT Namn from Agent where Agent_ID = " + id;
        try{
            namn = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return namn;
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

    //Hämta agentLösen från epost
    public String getAgentLösenordFrånEpost(String epost){
        String lösenord = "";
        String query = "SELECT Losenord FROM Agent where Epost = '" + epost + "'";
        try{
            lösenord = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return lösenord;
    }

    //Byt agentLösen utifrån epost
    public void setAgentLösenordFrånEpost(String epost, String losenord){
        String query = "UPDATE Agent SET Losenord= '"+ losenord + "' where Epost = '" + epost + "'";
        try{
            idb.update(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //Hämta alienlösen från epost
    public String getAlienLösenordFrånEpost(String epost){
        String lösenord = "";
        String query = "SELECT Losenord FROM Alien where Epost = '" + epost +"'";
        try {
            lösenord = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return lösenord;
    }

    //Byt Alien lösen utifrån epost
    public void setAlienLösenordFrånEpost(String epost, String losenord){
        String query = "UPDATE Alien SET Losenord= '"+ losenord + "' where Epost = '" + epost + "'";
        try{
            idb.update(query);
          }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
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
public void taBortAlien(int ID) {
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
public void taBortRas(int id) {
   try{
   idb.delete("DELETE FROM Boglodite WHERE Alien_ID=" + id);
   idb.delete("DELETE FROM Squid WHERE Alien_ID=" + id);
   idb.delete("DELETE FROM Worm WHERE Alien_ID=" + id);
 }
 catch(InfException ex){
     System.out.println(ex.getMessage());
 }
}


    //Hämta platsID från alien id
    public String getPlatsIDFrånAlienID(String alienID){
        String platsID = "";
        String query = "SELECT Plats FROM Alien where Alien_ID = " + alienID;
        try{
            platsID = idb.fetchSingle(query);
        }
          catch(InfException ex){
              System.out.println(ex.getMessage());
          }
        return platsID;
    }

    //Hämta en arraylist med ansvarig agenter på område och utifrån områdesID
    public ArrayList<String> hämtaAgenterSomAnsvararFrånOmrådeID(String områdeID){
        ArrayList<String> agentInstanser = new ArrayList<>();
        String query = "SELECT Ansvarig_Agent FROM Alien where Plats = " + områdeID;
        try{
            agentInstanser = idb.fetchColumn(query);
        }
          catch(InfException ex){
              System.out.println(ex.getMessage());
        }
        return agentInstanser;
    }

    //Hämta områdesID från platsID
    public String getOmrådesIDFrånPlatsID(String platsID){
        String områdesID = "";
        String query = "SELECT Finns_I FROM Plats where Plats_ID = " + platsID;
        try{
            områdesID = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return områdesID;
    }

    //Hämta vem som är chef över ett område
    public String getOmrådesChef(String områdesID){
        String chefID = "";
        String query = "SELECT Agent_ID FROM Omradeschef where Omrade = " + områdesID;
        try{
            chefID = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return chefID;
    }

    //hämta specifik agent Epost
    public String getAgentsEpost(String agentID){
        String epost = "";
        String query = "SELECT Epost FROM Agent where Agent_ID = " + agentID;
        try{
            epost = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return epost;
    }

    //Hämta specifik agent telefonnummer
    public String getAgentsTelefon(String agentID){
        String telefon = "";
        String query = "SELECT Telefon FROM Agent where Agent_ID = " + agentID;
        try{
            telefon = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return telefon;
    }

    //Hämta specifik agent namn
    public String getAgentsNamn(String agentID){
        String namn = "";
        String query = "SELECT Namn FROM Agent where Agent_ID = " + agentID;
        try{
            namn = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return namn;
    }

        //Hämta idn från Ras
        public ArrayList<String> getIdnFrånRas(String ras){
            ArrayList<String> IDn = new ArrayList<>();
            String query = "SELECT Alien_ID FROM " + ras;
            try{
                IDn = idb.fetchColumn(query);
            }
            catch(InfException ex){
                System.out.println(ex.getMessage());
            }
            return IDn;
        }

    //Hämta Alien namn från ID
    public String getAlienNamnFrånID(String ID){
        String query = "SELECT Namn FROM Alien where Alien_ID = " + ID;
        String namn = "";
        try{
            namn = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return namn;
    }

    //Hämta Alien epost från ID
    public String getAlienEpostFrånID(String ID){
        String query = "SELECT Epost FROM Alien where Alien_ID = " + ID;
        String epost = "";
        try{
            epost = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return epost;
    }
    
    //Hämta alien telefonnummer från ID
    public String getAlienTelefonFrånID(String ID){
        String query = "SELECT Telefon FROM Alien where Alien_ID = " + ID;
        String telefon = "";
        try{
            telefon = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return telefon;
    }

    //Hämta plats id från namn
    public String getPlatsIDFrånNamn(String benämning){
        String query = "SELECT Plats_ID FROM Plats where Benamning = '" + benämning + "'";
        String platsID = "";
        try{
            platsID = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return platsID;
    }


    //Hämta Alien id på dom som finns i en plats
    public ArrayList<String> getAlienIDnFrånPlats(String platsID){
        String query = "SELECT Alien_ID FROM Alien where plats = " + platsID;
        ArrayList<String> idLista = new ArrayList<>();
        try{
            idLista = idb.fetchColumn(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(idLista);
        return idLista;
    }

    //Hämta Alien id mellan 2 datum
    public ArrayList<String> getAlienIDMellanDatum(String från, String till){
        String query = "SELECT Alien_ID FROM Alien where DATE(Registreringsdatum) BETWEEN '" + från + "' AND '" + till + "'";
        ArrayList<String> idLista = new ArrayList<>();
        try{
            idLista = idb.fetchColumn(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return idLista;
    }
    //Lägg till ny alien.
    public void registreraNyAlien(int id, String datum, String epost, String lösenord, String namn, String telefon, int plats, int ansvarigAgent){
        try {
            String query = "INSERT INTO Alien (Alien_ID, Registreringsdatum, Epost, Losenord, Namn, Telefon, Plats, Ansvarig_Agent)" +
            "VALUES (" + id + ", '" + datum + "', '" + epost + "', '" + lösenord + "', '" + namn + "', '" + telefon + "', '" + plats + "', '" + ansvarigAgent + "')";
        idb.insert(query);
            System.out.println("Ny alien har registrerats.");

        } catch(InfException ex){
            System.out.println(ex.getMessage());
        }

    }
    //Hämta antal aliens.
    public int antalAliensIDatabas(){
        int antal = 0;
        ArrayList<String> aliens = getAllaAlienEpost();
        for(String epost : aliens){
            antal++;
        }
        return antal;
        }


    public void ändraAlienInfo(int id, String datum, String lösenord, String namn, String telefon, int plats, int ansvarigAgent){
        try {
        String query = "UPDATE Alien SET "
                + "Registreringsdatum = '" + datum + "', "
                + "Losenord = '" + lösenord + "', "
                + "Namn = '" + namn + "', "
                + "Telefon = '" + telefon + "', "
                + "Plats = " + plats + ", "
                + "Ansvarig_Agent = " + ansvarigAgent
                + " WHERE Alien_ID = " + id;
        idb.update(query);
        System.out.println("Informationen har uppdaterats.");
        } catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    //Hämta vilka platser som finns i ett område
    public ArrayList<String> getPlatser(String områdesID){
        ArrayList<String> platser = new ArrayList<>();
        String query = "SELECT Plats_ID FROM Plats where Finns_I = " + områdesID;
        try{
            platser = idb.fetchColumn(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return platser;
    }

}
