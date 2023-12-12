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
    public boolean valideraAlienEpost(String epost){
        boolean valid = false;
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        boolean existerar = false;
        for(String email : db.hämtaAllaAlienEpost()){
            if(email.equals(epost)){
                existerar = true;
                System.out.println("Epost finns redan");
            }
        }
        if(epost.matches(emailRegex) && !existerar){
            valid = true;
        }
        else{
            System.out.println("typo");
        }
        System.out.println(valid);
        return valid;
    }
    
    //Validerar en AgentEmail
    public boolean valideraAgentEpost(String epost){
        boolean valid = false;
        String emailRegex = "^[a][a-z]{1}+\\@mib.net";
        boolean existerar = false;
        for(String email : db.hämtaAllaAgentEpost()){
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
        System.out.println(valid);
        return valid;
    }
    
    //Validerar ett lösenord
    public boolean valideraLösenord(String lösen){
        boolean valid = false;
        if(lösen.matches("^[a-zA-Z0-9][a-zA-Z0-9]*")){
            valid = true;
        }
        System.out.println(valid);
        return valid;
    }
}
