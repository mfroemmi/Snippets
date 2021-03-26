/*
Eine Mirp-Zahl ist eine Primzahl, die rückwärtsgelesen eine andere Primzahl ergibt. (Mirp = "Prim" rückwärts gelesen.)

Schreiben Sie ein Programm, das alle Mirp-Zahlen bis 1000 ausgibt.
 */
package group01.snippets;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcel
 */
public class mirp_zahlen {

    public static List prim = new ArrayList();
    public static List mirp = new ArrayList();
    public static int umk;

    public static void main(String[] args) {
        new mirp_zahlen().top();
    }

    public void top() {

        prim = primzahlen();

        // Durchläuft jede Zahl in "prim" und kehrt sie in um
        for (int i = 0; i < ((int) prim.size() - 1); i++) {

            umk = umkehr((int) prim.get(i));
            // Vergleicht die umgekehrte zahl aus "prim" mit allen Zahlen aus "prim"
            for (int u = 0; u < ((int) prim.size() - 1); u++) {

                if ((int) prim.get(u) == umk) {
                    mirp.add(umk);
                }

            }

        }

        System.out.println("Prim-Zahlen:");
        System.out.println(prim);
        System.out.println("mirP-Zahlen:");
        System.out.println(mirp);

    }

    public static List primzahlen() {
        // Erstellt eine Liste
        List liste = new ArrayList();

        // Setzt die erforderlichen Variablen
        int zahl = 0;
        boolean istPrim = true;

        // Läuft jeden Wert von 3 bis 2000 durch
        for (int i = 3; i <= 1000; i++) {

            zahl = i;
            istPrim = true;

            // Ergibt die Division, (außer bei eins und durch sich selber), Null, ist es keine Primzahl
            for (int u = 2; u < zahl; u++) {

                if (zahl % u == 0) {
                    istPrim = false;
                }

            }

            // Ist die Zahl eine Primzahl, füge diese Zahl der Liste hinzu
            if (istPrim) {
                liste.add(zahl);
            }

        }

        return liste;
    }

    public static int umkehr(int primzahl) {

        int umkehr = 0;

        while (primzahl > 0) {

            int einer = primzahl % 10;

            umkehr = umkehr * 10 + einer;
            primzahl = primzahl / 10;

        }

        return umkehr;
    }

}
