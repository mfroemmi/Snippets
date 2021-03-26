/*
Schreiben Sie eine Subroutine (Unterprogramm), das ein Wort entgegen nimmt, und dieses rückwärts wieder ausgibt.

Prototyp:
«function» backTrackWord(ac: string): string;

Zusatzaufgabe: Versuchen Sie einen rekursiven Algorithmus dazu zu finden.
 */
package group01.snippets;

import java.util.Scanner;

/**
 *
 * @author Marcel
 */
public class backtracking {
    
    public static void main(String[] args){
        
        Scanner string = new Scanner(System.in);
        String input;
        
        System.out.println("Bitte ein Wort eingeben:");
        input = string.nextLine();
        
        System.out.println(wordbacktracking(input));
       
        
    }
    
    public static Object wordbacktracking(String input) {
        
        StringBuilder output = new StringBuilder();
        String word = input;
        
        output.append(word);
        output = output.reverse();
        
        return output;
        
    }
    
}
