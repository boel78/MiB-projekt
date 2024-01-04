package mib;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Validering {
    private Databas db;

    public Validering(){
        db = new Databas();
    }

    //Validerar ett namn
    public boolean valideraNamn(String namn){
        boolean valid = false;
        if(namn.matches("[a-zA-Z ]+")){
            valid = true;
        }
       return valid;
    }

    //Validerar en Alienemail
    public boolean valideraAlienEpostTypo(String epost){
        boolean valid = false;
        String emailRegex = "^[a-zA-ZåäöÅÄÖ0-9._%+-]+@[a-zA-ZåäöÅÄÖ0-9-]+\\.[a-zA-ZåäöÅÄÖ]{2,6}$";
        if(epost.matches(emailRegex)){
            valid = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Stavfel på epost");
        }
        return valid;
    }

    //Validera om Alienepost finns
    public boolean valideraAlienEpostExisterar(String epost, boolean skrivUt){
        boolean finns = false;
        if(valideraAlienEpostTypo(epost)){
            for(String email : db.getAllaAlienEpost()){
                if(email.equals(epost)){
                    finns = true;
                    if(skrivUt){
                        JOptionPane.showMessageDialog(null, "Eposten finns redan.");
                    }
                }
            }
        }
        return finns;
    }

    //Validerar en AgentEmail
    public boolean valideraAgentEpostFinns(String epost){
        boolean valid = false;
        boolean existerar = false;
        if(valideraAgentEpostTypo(epost)){
            for(String email : db.getAllaAgentEpost()){
                if(email.equals(epost)){
                    valid = true;
                    existerar = true;
                }
            }
            if(!existerar){
                JOptionPane.showMessageDialog(null, "Den här eposten verkar inte finnas.");
            }
        }
        return valid;
    }

    //Validera agentEpost typo
    public boolean valideraAgentEpostTypo(String epost){
        boolean valid = false;
        if(!epost.isEmpty()){
            String emailRegex = "^[a][a-zåäö]{1}\\d?\\@mib.net";
            if(epost.matches(emailRegex)){
                valid = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Stavfel på epost");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i en epost.");
        }
        return valid;
    }

    //Validerar ett lösenord
    public boolean valideraLösenord(String lösen){
        boolean valid = false;
        if(!lösen.isEmpty()){
            if(lösen.matches("^[a-zA-ZåäöÅÄÖ0-9][a-zA-ZåäöÅÄÖ0-9]*") && lösen.length() <= 6){
                valid = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Stavfel på lösenord, var vänlig och fyll i ett lösenord som innehåller bokstäver och/eller siffror kontrollera samt att lösenordet inte överstiger 6 st tecken.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i ett lösenord.");
        }
        return valid;
    }

    //validerar utrustning
    public boolean valideraUtrustning(String utrustning){
        boolean valid = false;
        if(utrustning.matches("^[A-ZÅÄÖ]{1}[a-zåäö]*+(\\s[a-zA-ZåäöÅÄÖ]*)?")){
            valid = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i ett acceptabelt namn");
        }
        return valid;
    }

    //validerar alienNamn
    public boolean valideraAlienNamn(String namn, boolean skrivUt){
        boolean valid = false;
        if(namn.matches("^[A-ZÅÄÖ]{1}[a-zåäö]+(\\s[A-ZÅÄÖ]{1}[a-zåäö]*)?")){
            valid = true;
        }
        else{
            if(skrivUt){
                JOptionPane.showMessageDialog(null, "Stavfel på namn, se till att det börjar med stor bokstav.");
            }
        }            
        return valid;
    }

    //validerar AlienTelefon
    public boolean valideraAlienTelefonnummer(String nummer){
        boolean valid = false;
        if(nummer.matches("^555-\\d[0-9]{1,4}")){
            valid = true;
        }
        return valid;
    }

    //validerar ett agentNamn
    public boolean valideraAgentNamn(String namn){
        boolean valid = false;
        if(!namn.isEmpty()){
            if(namn.matches("^Agent\\s[A-Z]{1}")){
                valid = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Stavfel på agentnamnet.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänligt och fyll i ett agentnamn.");
        }
        return valid;
    }

    //validera agentAnställningsDatum
    public boolean valideraAgentAnställningsDatum(String datum){
        boolean valid = false;
        if(!datum.isEmpty()){
            if(datum.matches("\\d{4}-(0?[1-9]|1[012])-(0?[1-9]|1?[0-9]|2?[0-9]|3[01])")){
                valid = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Stavfel på Anställnigsdatum.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i ett datum.");
        }
        return valid;
    }

    //validera agentTelefon
    public boolean valideraAgentTelefonnummer(String nummer){
        boolean valid = false;
        if(!nummer.isEmpty()){
            if(nummer.matches("^555-\\d[0-9]{1,5}")){
                valid = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Stavfel på telefon, se till så att numret börjar på 555-\"dina siffror(max 6)\"");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i ett telefonnummer.");
        }
        return valid;
    }

    //validera om utrustningbenämning finns
    public boolean valideraUtrustningBenämningExisterar(String benämning){
        boolean hittad = false;
            for(String namn : db.getUtrustningBenämning()){
                if(benämning.equals(namn)){
                    hittad = true;
                }
            }
        return hittad;
    }

    //Validera om Vapen finns utifrån ID
    public boolean valideraVapenExisterar(String ID){
        boolean hittad = false;
            for(String id : db.getVapenID()){
                if(ID.equals(id)){
                    hittad = true;
                }
            }
        return hittad;
    }

    //Validera om InneharUtrustning har IDt
    public boolean valideraOmUtrustningInnehas(String ID){
        boolean finns = false;
        for(String id : db.getUtrustningSomInnehas()){
            if(ID.equals(id)){
                finns = true;
            }
        }
        return finns;
    }

    //Validera om Kommunikation har IDt
    public boolean valideraKommunikationUtrustningsID(String ID){
        boolean finns = false;
        for(String id : db.getKommunikationID()){
            if(ID.equals(id)){
                finns = true;
            }
        }
        return finns;
    }

    //Validera om Teknik har IDt
    public boolean valideraTeknikUtrustningsID(String ID){
        boolean finns = false;
        for(String id : db.getTeknikID()){
            if(ID.equals(id)){
                finns = true;
            }
        }
        return finns;
    }



    //validera agentNamnFinns
    public boolean valideraAgentNamnFinns(String namn, boolean skrivUt){
        boolean finns = false;
        if(valideraAgentNamn(namn)){
            for(String agentNamn : db.getAgentNamn()){
                if(agentNamn.equals(namn)){
                    finns = true;
                }
            }
            if(!finns && skrivUt){
                JOptionPane.showMessageDialog(null, "Namnet finns inte.");
            }
        }
        return finns;
    }

    //Validera om AlienID finns.
    public boolean valideraAlienId(Integer id){
        boolean finns=false;
        for(String ID : db.getAllaAlienIDn()){
            if(id.toString().equals(ID)){
                finns = true;
            }
        }
        return finns;
    }
    
    //Validera om agentens lösenord stämmer
    public boolean valideraAgentLösenord(String lösenord, String epost){
        boolean rättLösenord = false;
        if(valideraLösenord(lösenord) && db.getAgentLösenordFrånEpost(epost).equals(lösenord)){
            rättLösenord = true;
        }
        else{
          JOptionPane.showMessageDialog(null, "Fel lösenord.");
        }
        return rättLösenord;
      }
      
    //Validera om aliens lösenord stämmer
    public boolean valideraAlienLösenord(String lösenord, String epost){
        boolean rättLösenord = false;
        if(valideraLösenord(lösenord) && db.getAlienLösenordFrånEpost(epost).equals(lösenord)){
            rättLösenord = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Fel lösenord.");
        }
        return rättLösenord;
    }

    //Validera om agentID är en siffra
    public boolean valideraAgentIDTypo(String id){
        boolean isNumber = false;
        try {
            Integer.parseInt(id);
            isNumber = true;
	}
	catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Det här är ingen siffra.");
	}
        return isNumber;
    }

    //Validera om agentID Existerar
    public boolean valideraAgentIDExisterar(String id){
        boolean existerar = false;
        if(valideraAgentIDTypo(id)){
            for(String idILista : db.getAgentIDn()){
                if(idILista.equals(id)){
                    existerar = true;
                }
            }
            if(!existerar){
                JOptionPane.showMessageDialog(null, "Detta ID existerar inte.");
            }
        }
        return existerar;
    }

    //validera om områdeschef finns utifrån områdesID
    public boolean valideraOmrådesChefExisterarPåOmråde(Integer områdesID){
        boolean finns = false;
        if(db.getOmrådesChef(områdesID.toString()) != null){
            finns = true;
        }
        return finns;
    }

    //Validerar om området finns i databasen
    public boolean valideraOmrådeExisterar(String område, boolean skrivUt){
        boolean finns = false;
        if(!område.isEmpty()){
            for(String området : db.getOmråden()){
                if(området.equals(område)){
                    finns = true;
                }
            }
            if(!finns && skrivUt){
                JOptionPane.showMessageDialog(null, "Området existerar inte");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Var vänlig och fyll i ett område");
        }
        return finns;
    }

    //Valiera om kontorsbeteckning existerar
    public boolean valideraKontorsBeteckningExisterar(String kontorsbeteckning){
        boolean existerar = false;
        for(String beteckning : db.getKontorsbeteckningar()){
            if(beteckning.equals(kontorsbeteckning)){
                existerar = true;
            }
        }
        return existerar;
    }

    //Validera om en områdeschef finns
    public boolean valideraOmrådeschefExisterar(String id){
        boolean existerar = false;
        for(String chefsid : db.getOmrådeschefer()){
            if(chefsid.equals(id)){
                existerar = true;
            }
        }
        return existerar;
    }

    //Validera om en kontorschef finns
    public boolean valideraKontorschefExisterar(String id){
        boolean existerar = false;
        for(String chefsid : db.getKontorschefer()){
            if(chefsid.equals(id)){
                existerar = true;
            }
        }
        return existerar;
    }

    //Validera om kontorschef existerar på enskilt kontor
    public boolean valideraKontorschefPåSpecifik(String id, String kontor){
        boolean stämmer = false;
        for(HashMap<String, String> mapar : db.getAllaRaderKontorschef()){
            if(mapar.get("Agent_ID").equals(id) && mapar.get("Kontorsbeteckning").equals(kontor)){
                stämmer = true;
            }
        }
        return stämmer;
    }

    //Validera om man skrivit ja eller nej..
    public boolean valideraAdminInput(String input){
        input = input.toLowerCase();
        boolean rättstavning = false;
        if(!input.isEmpty()){
            if(input.equals("ja") || input.equals("nej")){
                rättstavning = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Se till att du har skrivit in Ja eller Nej.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Se till att du har skrivit in något i Admin fältet.");
        }
        return rättstavning;
    }

    //Validera om agent är chef på specifikt område
    public boolean valideraOmrådeschefPåSpecifik(String id, String område){
        boolean stämmer = false;
        Integer områdesID = db.getOmrådeId(område);
        for(HashMap<String, String> mapar : db.getAllaRaderOmrådeschef()){
            if(mapar.get("Agent_ID").equals(id) && mapar.get("Omrade").equals(områdesID.toString())){
                stämmer = true;
            }
        }
        return stämmer;
    }
    
    //Validera om aliennamn existerar
    public boolean valideraAlienNamnExisterar(String namn){
        boolean existerar = false;
        if(valideraAlienNamn(namn, true)){
            for(String namnet : db.getAllaAlienNamn()){
                if(namn.equals(namnet)){
                    existerar = true;
                }
            }
        }
        return existerar;
    }   
}
