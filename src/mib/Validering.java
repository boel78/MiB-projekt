package mib;

public class Validering {
    private Databas db;

    public Validering(){
        db = new Databas();
    }

    //Validerar ett namn
    public boolean valideraNamn(String namn){
        boolean valid = false;
        if(namn.matches("[a-zA-Z]+")){
            valid = true;
        }
       return valid;
    }

    //Validerar en Alienemail
    public boolean valideraAlienEpostTypo(String epost){
        boolean valid = false;
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        
        if(epost.matches(emailRegex)){
            valid = true;
        }
        else{
            System.out.println("typo");
        }
        System.out.println("Alien epost: " + valid);
        return valid;
    }
    
    //Validera om Alienepost finns
    public boolean valideraAlienEpostExisterar(String epost){
        boolean finns = false;
        if(valideraAlienEpostTypo(epost)){
            for(String email : db.getAllaAlienEpost()){
                if(email.equals(epost)){
                  finns = true;
                    System.out.println("Epost finns redan");
                }
            }
        }
        return finns;
    }

    //Validerar en AgentEmail
    public boolean valideraAgentEpost(String epost){
        boolean valid = false;
        String emailRegex = "^[a][a-z]{1}+\\@mib.net";
        boolean existerar = false;
        for(String email : db.getAllaAgentEpost()){
            if(email.equals(epost)){
                System.out.println("Email finns redan.");
                existerar = true;
            }
        }
        if(epost.matches(emailRegex) && !existerar){
            valid = true;
        }
        else{
            System.out.println("Typo");
        }
        System.out.println("Agent Epost: " + valid);
        return valid;
    }

    //Validerar ett lösenord
    public boolean valideraLösenord(String lösen){
        boolean valid = false;
        if(lösen.matches("^[a-zA-Z0-9][a-zA-Z0-9]*") && lösen.length() <= 6){
            valid = true;
        }
        System.out.println("Lösenord: " + valid);
        return valid;
    }

    //Validerar ett område
    public boolean valideraOmråde(String område){
        boolean valid = false;
        if(område.matches("^[A-Z]{1}[a-z]*")){
            valid = true;
        }
        System.out.println(valid);
        return valid;
    }

    //validerar en plats
    public boolean valideraPlats(String plats){
        boolean valid = false;
        if(plats.matches("[A-Z]{1}[a-z]*")){
            valid = true;
        }
        System.out.println(valid);
        return valid;
    }

    //validerar utrustning
    public boolean valideraUtrustning(String utrustning){
        boolean valid = false;
        if(utrustning.matches("^[A-Z]{1}[a-z]*+(\\s[A-Z]{1}[a-z]*)?")){
            valid = true;
        }
        System.out.println(valid);
        return valid;
    }

    //validerar alienNamn
    public boolean valideraAlienNamn(String namn){
        boolean valid = false;
        if(namn.matches("^[A-Z]{1}[a-z]+(\\s[A-Z]{1}[a-z]*)?")){
            valid = true;
        }
        System.out.println(valid);
        return valid;
    }

    //validerar AlienTelefon
    public boolean valideraAlienTelefonnummer(String nummer){
        boolean valid = false;
        if(nummer.matches("^555-\\d[0-9]{1,4}")){
            valid = true;
        }
        System.out.println(valid);
        return valid;
    }

    //validerar ett agentNamn
    public boolean valideraAgentNamn(String namn){
        boolean valid = false;
        if(namn.matches("^Agent\\s[A-Z]{1}")){
            valid = true;
        }
        System.out.println(valid);
        return valid;
    }

    //validera agentAnställningsDatum
    public boolean valideraAgentAnställningsDatum(String datum){
        boolean valid = false;
        if(datum.matches("\\d{4}-(0?[1-9]|1[012])-(0?[1-9]|1?[0-9]|2?[0-9]|3[01])")){
            valid = true;
        }
        System.out.println(valid);
        return valid;
    }

    //validera agentTelefon
    public boolean valideraAgentTelefonnummer(String nummer){
        boolean valid = false;
        if(nummer.matches("^555-\\d[0-9]{1,5}")){
            valid = true;
        }
        System.out.println(valid);
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
         System.out.println(finns);
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

      //validera agentEpostFinns
      public boolean valideraAgentEpostFinns(String epost){
          boolean finns = false;
          for(String email : db.getAllaAgentEpost()){
              if(epost.equals(email)){
                  finns = true;
              }
          }
          return finns;
      }

      //validera agentNamnFinns
      public boolean valideraAgentNamnFinns(String namn){
          boolean finns = false;
          for(String agentNamn : db.getAgentNamn()){
              if(agentNamn.equals(namn)){
                  finns = true;
              }
          }
        return finns;
    }

      //Är Agent Epost
      public boolean getÄrEpostAgent(String epost){
          boolean ärAgent = false;
          String[] epostArray = epost.split("@");
          if(epostArray[1].equals("mib.net")){
              ärAgent = true;
          }
          return ärAgent;
      }
      
      //Validera om agentens lösenord stämmer
      public boolean valideraAgentLösenord(String lösenord, String epost){
          boolean rättLösenord = false;
            if(valideraLösenord(lösenord) && db.getAgentLösenordFrånEpost(epost).equals(lösenord)){
                rättLösenord = true;
            }
            return rättLösenord;
        }
}
