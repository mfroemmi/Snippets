package group01.snippets;

import java.util.Random;

/**
 *
 * @author Marcel
 */
public class lustiger_satzbau {
    
    public static void main(String[] args){
        
        
        String[] personen = {"Marcel", "Jacky", "Patrick", "Sabrina", "Darius"};
        String[] verben = {"strickt", "säuft", "schläft", "weint", "küsst"};
        String[] orte = {"Berlin", "Hannover", "Norwegen", "Paris", "Polen"};
        
        Random randompersonen = new Random();
        int personenzahl = randompersonen.nextInt(5);
        
        Random randomverben = new Random();
        int verbenzahl = randomverben.nextInt(5);
        
        Random randomorte = new Random();
        int ortezahl = randomorte.nextInt(5);
          
        
        System.out.print(personen[personenzahl] + " " + verben[verbenzahl] + " in " + orte[ortezahl]);

        
        
    }
    
}
