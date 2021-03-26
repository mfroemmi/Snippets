package group01.snippets;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Marcel
 */
public class zufallszahlen_sortieren {
    
    public static void main(String[] args){
        // Variablen
        int[] zufallszahlen = new int[10];
        Random random = new Random();
        
        System.out.print("10 Zufallszahlen werden aufsteigend sortiert." + "\n");
        
        // Generierung der Zufallszahlen
        for (int i = 0; i < zufallszahlen.length; i++){
            zufallszahlen[i] = random.nextInt(100);
            System.out.print(zufallszahlen[i] + " ");
        }
        
        System.out.print("\n");
        
        Arrays.sort(zufallszahlen);
        
        for (int i = 0; i < zufallszahlen.length; i++){
            System.out.print(zufallszahlen[i] + " ");
        }
        
        
        
        
        
        
    }
    
}
