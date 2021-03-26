/**
Ein Primzahlzwilling ist ein Paar aus Primzahlen, deren Abstand 2 ist.
Beispiele:
(3, 5), (5, 7), (11, 13), …, (569, 571), …
Schreibe eine Funktion/Methode, welche alle Primzahlpaare kleiner 2000 ausgibt.
 */

package group01.snippets;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcel
 */
public class primzahlzwillinge {
    
    public static void main (String[] args) {
        
        // Erstellt eine Liste
        List liste = new ArrayList();
        List liste_paare = new ArrayList();
        
        // Setzt die erforderlichen Variablen
        int zahl = 0;
        boolean istPrim = true;
        
        // Läuft jeden Wert von 3 bis 2000 durch
        for(int i = 3; i <= 2000; i++){
            
            zahl = i;
            istPrim = true;
            
            // Ergibt die Division, (außer bei eins und durch sich selber), Null, ist es keine Primzahl
            for(int u = 2; u < zahl; u++){
                
                if (zahl % u == 0){
                    istPrim = false;
                }
                
            }
            
            // Ist die Zahl eine Primzahl, füge diese Zahl der Liste hinzu
            if(istPrim){
                liste.add(zahl);
            }
            
        }
       
        System.out.println(liste);
        
        // Gibt die Anzahl der Primzahlen aus
        int laenge_liste = liste.size();
        System.out.println("Primzahlen: " + laenge_liste);
        
        // Bestimmt die Primzahlenzwillinge
        for(int i = 0; i < (laenge_liste - 1); i++) {
            int zahl_eins = (Integer)liste.get(i);
            int zahl_zwei = (Integer)liste.get(i + 1);
            
            if((zahl_eins + 2) == zahl_zwei) {
                liste_paare.add("(" + zahl_eins + "," + zahl_zwei + ")");
            }
        }
        
        System.out.println(liste_paare);
        
        // Gibt die Anzahl der Primzahlenzwillinge aus
        int laenge_paare = liste_paare.size();
        System.out.println("Primzahlzwillinge: " + laenge_paare);
        
    }
    
}
