package programmierung1.blatt11.Aufgabe47;

import Prog1Tools.IOTools;
public class FarbFernseherDemo {
  public static void main (String[] args) {
    FarbFernseher ff1, ff2;

    // Einen Farbfernseher erzeugen
    ff1 = new FarbFernseher("Wohnzimmer", 6, 7, 8);
    
    System.out.println("Daten des Farbfernsehers 1 ausgeben:");
    System.out.println(ff1);
    System.out.println();
    
    // Farbfernseher 2 erzeugen
    ff2 = new FarbFernseher("Schlafzimmer", 35, 15, 20);
    
    System.out.println("Daten des Farbfernsehers 2 ausgeben:");
    System.out.println(ff2);
    System.out.println();
//    System.out.println(ff1.istAngenehmerAls(ff2));
//    System.out.println(ff2.istAngenehmerAls(ff1));
    System.out.println("Die beiden Farbfernseher vergleichen:");
    if (ff1.istAngenehmerAls(ff2))
      System.out.println("Farbfernseher 1 ist angenehmer als Farbfernseher 2");
    else if (ff2.istAngenehmerAls(ff1))
      System.out.println("Farbfernseher 2 ist angenehmer als Farbfernseher 1");
    else
      System.out.println("Beide Farbfernseher sind komisch eingestellt");
    System.out.println();
     
    System.out.println("Der Farbfernseher 1 wird nun anders eingestellt:");
    System.out.println("Laustaerke um 5 erniedrigt, Farbe um 15 erhoeht");
    ff1.change ("volume", -5);
    ff1.change ("color", 15);
    System.out.println();

    System.out.println("Daten des neu eingestellten Farbfernsehers 1 ausgeben:");
    System.out.println(ff1);
    System.out.println(ff2);
    System.out.println();
    System.out.println("Die beiden Farbfernseher nochmals vergleichen:");
    if (ff1.istAngenehmerAls(ff2))
      System.out.println("Farbfernseher 1 ist angenehmer als Farbfernseher 2");
    else if (ff2.istAngenehmerAls(ff1))
      System.out.println("Farbfernseher 2 ist angenehmer als Farbfernseher 1");
    else
      System.out.println("Beide Farbfernseher sind komisch eingestellt");
    System.out.println();
  }
}


