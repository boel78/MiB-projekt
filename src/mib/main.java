package mib;

import java.util.Scanner;
import oru.inf.InfException;


public class main {
    
    public static void main(String[] args) throws InfException {
        
        
        //Kod för att testa validering, använder scanner som input.
        Validering validering = new Validering();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv din epost");
        String input = scanner.nextLine();
        validering.valideraAlienEpost(input);
    }
    
    
}
