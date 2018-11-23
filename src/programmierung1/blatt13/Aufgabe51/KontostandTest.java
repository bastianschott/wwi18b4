package programmierung1.blatt13.Aufgabe51;

import Prog1Tools.IOTools;
public class KontostandTest {
    public static void main(String[] args) {
        Zahl z1 = new Kontostand(IOTools.readDouble("Kontostand 1 eingeben: "));
        Zahl z2 = new Kontostand(IOTools.readDouble("Kontostand 2 eingeben: "));
        
        ZahlTest.operationenMenue(z1, z2);
    }
}
