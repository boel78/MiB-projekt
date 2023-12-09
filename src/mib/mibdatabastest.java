/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joakimfockstedt
 */
public class mibdatabastest {
    
    private static InfDB idb;
    private static String name;
    
    public static void main(String[] args) throws InfException {
    
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        
        catch (InfException ex) {
            Logger.getLogger(mibdatabastest.class.getName()).log(Level.SEVERE, null, ex);
        }
        hämtaAgentTest();
        System.out.println(name);
    }
    
    public static void hämtaAgentTest(){
        
       try {
       name =  idb.fetchSingle("SELECT Namn FROM agent WHERE agent_id=1");
       } catch(InfException ex){
           System.out.println("Det blev fel");
       }
    }
}
