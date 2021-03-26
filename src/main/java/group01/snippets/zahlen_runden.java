/*
Schreiben Sie ein Programm, bei dem der Anweder fünf (5) Schulnoten erfassen kann.
Danach wird der Durchschnitt dieser Noten einmal auf 0.1 und einmal auf 0.5 (Halbe Noten) gerundet ausgegeben.

Erweitern Sie Ihr Programm nun so, dass der Anwender beliebig viele Noten eingeben kann.
 */
package group01.snippets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marcel
 */
public class zahlen_runden {

    public static void main(String[] args) {
        
        // Variablen
        double I, rechnen1 = 0; 
        int E;
        boolean status = true;
        
        // Erstellen einer leeren Liste
        ArrayList<Double> liste = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        // Abfrage 1
        System.out.println("Wieviele Schulnoten sollen eingegeben werden?");
        E = input.nextInt();
        
        // Eingabe der Schulnoten
        for(int i = 0; i <= E - 1; i++) {
            System.out.println("Schulnote " + (i+1) + " eingeben (z.B. 2,5):");
            I = input.nextDouble();
            liste.add(I);
            rechnen1 = rechnen1 + I;
        } 
        
        // Mittelwerte berechnen
        rechnen1 = rechnen1 / E;
        double mittelwert01 = ((int) (10 * (rechnen1 + 0.05))) / 10.0;
        double mittelwert05 = ((int) (2  * (rechnen1 + 0.25))) /  2.0;
        
        // Ausgabe
        System.out.println("Mittelwert: " + rechnen1);
        System.out.println("Mittelwert(0,1): " + mittelwert01);
        System.out.println("Mittelwert(0,5): " + mittelwert05);
    }
    
}
