package mib;


import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;

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
        } 
        catch (InfException ex) {
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

    //Hämta Agent ID från epost
    public String getAgentIDFrånEpost(String epost){
        String namn = "";
        String query = "SELECT Agent_ID FROM Agent where Epost = '" + epost + "'";
        try{
            namn = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return namn;
    }

    //Hämta agent anställningsdatum
    public String getAgentAnställningsdatum(String id){
        String datum = "";
        String query = "SELECT Anstallningsdatum FROM Agent where Agent_ID = " + id;
        try{
            datum = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return datum;
    }

    //Hämta agents område från id
    public String getAgentOmråde(String id){
        String områdesID = "";
        String query = "SELECT Omrade FROM Agent where Agent_ID = " + id;
        try{
            områdesID = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return områdesID;
    }

    //Hämta områdesBenämning från id
    public String getOmrådeBenämningFrånID(String id){
        String benämning = "";
        String query = "SELECT Benamning FROM Omrade where Omrades_ID = " + id;
        try{
            benämning = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return benämning;
    }

    //Hämta alla agentIdn
    public ArrayList<String> getAgentIDn(){
        ArrayList<String> idn = new ArrayList<>();
        try{
            idn = idb.fetchColumn("SELECT Agent_ID FROM Agent");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return idn;
    }


    //Uppdaterar agent namn
    public void uppdateraAgentNamn(String id, String namn){
        String query = "UPDATE Agent SET Namn = '" + namn + "' where Agent_ID = " + id;
        try{
            idb.update(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //Uppdaterar agent epost
    public void uppdateraAgentEpost(String id, String epost){
        String query = "UPDATE Agent SET Epost = '" + epost + "' where Agent_ID = " + id;
        try{
            idb.update(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //uppdaterar agent lösenord
    public void uppdateraAgentLösenord(String id, String lösenord){
        String query = "UPDATE Agent SET Losenord = '" + lösenord + "' where Agent_ID = " + id;
        try{
            idb.update(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //uppdaterar agent anställningsdatum
    public void uppdateraAgentAnställningsdatum(String id, String anställningsdatum){
        String query = "UPDATE Agent SET Anstallningsdatum = '" + anställningsdatum + "' where Agent_ID = " + id;
        try{
            idb.update(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //uppdaterar agent område
    public void uppdateraAgentOmråde(String id, String område){
        String query = "UPDATE Agent SET Omrade = " + område + " where Agent_ID = " + id;
        try{
            idb.update(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }


    //Tar bort en agent utifrån agent id
    public void taBortAgent(String id){
        String query = "DELETE FROM Agent where Agent_ID = " + id;
        try{
            idb.delete(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //Ta bort innehar utrustning där det finns agent id
    public void taBortInneharUtrustningVidAgentID(String id){
        String query = "DELETE FROM Innehar_utrustning where Agent_ID = " + id;
        try{
            idb.delete(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //ta bort fältagent agent id
    public void taBortFältAgentVidAgentID(String id){
        String query = "DELETE FROM Faltagent where Agent_ID = " + id;
        try{
            idb.delete(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //uppdaterar agent_ID från alien till områdeschefen, returnerar chefen
    public void bytUtAgentFrånAlienTillChef(String agentID, String områdesChef){
        boolean ändrad = false;
        String chefNamn = "";
            String query = "UPDATE Alien SET Ansvarig_Agent = " + områdesChef + " where Ansvarig_Agent = " + agentID;
            try{
                idb.update(query);
                ändrad = true;
            }
            catch(InfException ex){
                System.out.println(ex.getMessage());
            }
    }

    //hämta alien id från agent id
    public String getAlienIDFrånAgentID(String agentID){
        String alienID = "";
        String query = "SELECT Alien_ID FROM Alien where Ansvarig_Agent = " + agentID;
        try{
            alienID = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return alienID;
    }

    //Hämta lista med aliens en agent bär ansvar över
    public ArrayList<String> getAlienListaFrånAgentID(String agentID){
        ArrayList<String> listan = new ArrayList<>();
        String query = "SELECT Alien_ID FROM Alien where Ansvarig_Agent = " + agentID;
        try{
            listan = idb.fetchColumn(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return listan;
    }

    //Ta bort områdeschef
    public void taBortOmrådesChef(String agentID){
        String query = "DELETE FROM Omradeschef where Agent_ID = " + agentID;
        try{
            idb.delete(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //Ta bort kontorschef
    public void taBortKontorsChef(String agentID){
        String query = "DELETE FROM Kontorschef where Agent_ID = " + agentID;
        try{
            idb.delete(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //uppdatera agent telefonnummer från id
    public void uppdateraAgentTelefonnummer(String id, String telefon){
        String query = "UPDATE Agent SET Telefon = '" + telefon + "' where Agent_ID = " + id;
        try{
            idb.update(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //lägg till områdeschef
    public void läggTillOmrådeschef(String agent_ID, String områdesID){
        String query = "INSERT INTO Omradeschef VALUES(" + agent_ID + ", " + områdesID + ")";
        try{
            idb.insert(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //kontrollerar om man är områdeschef, isf skickas området tbx
    public String kontrolleraOmrådeschef(String id){
        String område = "";
        String query = "SELECT Omrade FROM Omradeschef where Agent_ID = " + id;
        try{
            område = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        if(område == null){
            område = "---";
        }
        return område;
    }

    //kontrollerar om man är kontorschef, isf skickas kontoret tbx.
    public String kontrolleraKontorschef(String id){
        String kontor = "";
        String query = "SELECT Kontorsbeteckning FROM Kontorschef where Agent_ID = " + id;
        try{
            kontor = idb.fetchSingle(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        if(kontor == null){
            kontor = "---";
        }
        return kontor;
    }

    //hämta områden
    public ArrayList<String> getOmråden(){
        ArrayList<String> områden = new ArrayList<>();
        try{
            områden = idb.fetchColumn("SELECT Benamning FROM Omrade");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return områden;
    }

    //Hämta kontorsbeteckningar
    public ArrayList<String> getKontorsbeteckningar(){
        ArrayList<String> kontorsbeteckningar = new ArrayList<>();
        try{
            kontorsbeteckningar = idb.fetchColumn("SELECT Kontorsbeteckning FROM Kontorschef");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return kontorsbeteckningar;
    }

    //Lägg till kontorschef
    public void läggTillKontorschef(String agentID, String beteckning){
        String query = "INSERT INTO Kontorschef VALUES(" + agentID + ", '" + beteckning + "')";
        try{
            idb.insert(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //Hämta kontorschefer
    public ArrayList<String> getKontorschefer(){
        ArrayList<String> chefer = new ArrayList<>();
        try{
            chefer = idb.fetchColumn("SELECT Agent_ID FROM Kontorschef");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return chefer;
    }

    //Hämta områdeschefer
    public ArrayList<String> getOmrådeschefer(){
        ArrayList<String> chefer = new ArrayList<>();
        try{
            chefer = idb.fetchColumn("SELECT Agent_ID FROM Omradeschef");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return chefer;
    }

    //Uppdatera admin status
    public void uppdateraAdminStatus(String id, String status){
        String query = "UPDATE Agent SET Administrator = '" + status + "' where Agent_ID = " + id;
        try{
            idb.update(query);
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
    }

    //hämta alla rader i kontorschef
    public ArrayList<HashMap<String, String>> getAllaRaderKontorschef(){
        ArrayList<HashMap<String, String>> rader = new ArrayList<>();
        try{
            rader = idb.fetchRows("SELECT * FROM Kontorschef");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return rader;
    }

    //Hämta alla rader i områdeschef
    public ArrayList<HashMap<String, String>> getAllaRaderOmrådeschef(){
        ArrayList<HashMap<String, String>> rader = new ArrayList<>();
        try{
            rader = idb.fetchRows("SELECT * FROM Omradeschef");
        }
        catch(InfException ex){
            System.out.println(ex.getMessage());
        }
        return rader;
    }
}
