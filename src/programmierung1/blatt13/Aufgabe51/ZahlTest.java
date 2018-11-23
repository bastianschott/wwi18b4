package programmierung1.blatt13.Aufgabe51;

import Prog1Tools.IOTools;
public class ZahlTest {
    public static void operationenMenue(Zahl z1, Zahl z2) {
        System.out.println("=============================");
        System.out.println("Das Test-Menue:");
        System.out.println("=============================");
        System.out.println("Operand z1: " + z1);
        System.out.println("Operand z2: " + z2);
        System.out.println("-----------------------------");
        System.out.println("Moegliche Operationen:");
        System.out.println("  (a)ddieren");
        System.out.println("  (s)ubtrahieren");
        System.out.println("  (n)egieren von z1");
        System.out.println("  (v)ergleichen von z1 und z2");
        System.out.println("-----------------------------");
        System.out.println("  e(x)it");
        System.out.println("=============================");

        boolean fertig = false;
        do {
            int operation = IOTools.readChar("Ihre Wahl: ");
            switch (operation) {
                case 'a':
                case 'A':
                    System.out.println("z1 + z2 = " + z1.add(z2));
                    break;
                case 's':
                case 'S':
                    System.out.println("z1 - z2 = " + z1.sub(z2));
                    break;
                case 'n':
                case 'N':
                    System.out.println("-z1 = " + z1.neg());
                    break;
                case 'v':
                case 'V':
                    if (z1.equals(z2))
                      System.out.println(z1 + " ist gleich " + z2);
                    else
                      System.out.println(z1 + " ist ungleich " + z2);
                    break;
                case 'x':
                case 'X':
                    fertig = true;
           }
        } while (!fertig);
    }
}
