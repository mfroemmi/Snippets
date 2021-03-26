package group01.snippets;

/**
 *
 * @author Marcel
 */
public class ziffernkuerzbare_zahlenpaare {
    
    public static void main(String[] args){
        
        // Erstellen der Array für Zähler und Nenner
        double[] zaehler = new double[100];
        double[] nenner = new double[100];
        
        // Generierung der Zahlen von 10 - 99 für Zähler und Nenner
        for(int i = 0; i <= 89; i++){
            zaehler[i] = i + 10;
            nenner[i] = i + 10;
        }
        
        // Umwandeln der int-Werte in String-Werte
        // Durchlaufen der Zähler-Werte
        for(int i = 0; i <= 89; i++){
            String s_zaehler = String.valueOf(zaehler[i]);
            
            //Durchlaufen der Nenner-Werte
            for(int l = 0; l <= 89; l++){
                String s_nenner = String.valueOf(nenner[l]);
            
                // Vergleich der 1. Stelle 
                char c_zaehler = s_zaehler.charAt(0);
                char c_nenner = s_nenner.charAt(1);
           
                
                if(c_zaehler == c_nenner){
                    // Ist die 1. Stelle indentisch differenziere die 2. Stelle
                    
                    char c2_zaehler = s_zaehler.charAt(1);
                    char c2_nenner = s_nenner.charAt(0);
                    
                    double ergebnis1 = zaehler[i] / nenner[l];
                    double ergebnis2 = c2_zaehler / c2_nenner;
                  
                    // Ist ergebnis 1 == ergebnis 2 zeige die entsprechenden Werte an
                    if(ergebnis1 == ergebnis2){
                        System.out.print(zaehler[i] + "\n" + nenner[l] + "\n" + "\n");
                    }
                
                }
                
            
            }
            
            
        }
        
        
    }
    
}
