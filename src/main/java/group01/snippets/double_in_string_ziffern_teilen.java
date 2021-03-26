package group01.snippets;

/**
 *
 * @author Marcel
 */
public class double_in_string_ziffern_teilen {
    
     public static void main(String[] args){
        
        // Erstellen des Zähler und Nenner
        double zaehler = 65;
        double nenner = 26;
        
        // Umwandeln der Double-Werte in String-Werte
        String s_zaehler = String.valueOf(zaehler);    
        String s_nenner = String.valueOf(nenner);
            
        // 1. Stelle im Zähler und 2. Stelle im Nenner 
        char c_zaehler = s_zaehler.charAt(0);
        char c_nenner = s_nenner.charAt(1);
           
        System.out.print(c_zaehler + "\n");
        System.out.print(c_nenner + "\n" + "\n");
        
        // Speichern der jeweils anderen Werte in Variablen
        char c2_zaehler = s_zaehler.charAt(1);
        char c2_nenner = s_nenner.charAt(0);
        
        System.out.print(c2_zaehler + "\n");
        System.out.print(c2_nenner + "\n" + "\n");
        
        double d2_zaehler = Double.valueOf(c2_zaehler);
        double d2_nenner = Double.valueOf(c2_nenner);
        
        System.out.print(d2_zaehler + "\n");
        System.out.print(d2_nenner + "\n" + "\n");
        
        // Rechnung von 65/26 und 5/2
        double ergebnis1 = zaehler / nenner;
        double ergebnis2 = d2_zaehler / d2_nenner;
        
        System.out.print(ergebnis1 + "\n");
        System.out.print(ergebnis2 + "\n" + "\n");
                
            
        
     }
}
