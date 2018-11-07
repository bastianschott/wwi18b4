package programmierung1.blatt11.Aufgabe45;

import Prog1Tools.IOTools;

public class DSpiel {
	
	public static void main(String[] args) {
		
		DameFigur beute = new DameFigur(IOTools.readChar("Beute Position A-H"), IOTools.readInt("Beute Position 1-8"), "weiss");
		Bildschirm.loeschen();
		
		DameFigur jaeger = new DameFigur(IOTools.readChar("Jäger Position A-H"), IOTools.readInt("Jäger Position 1-8"), "weiss");
		if(jaeger.trifft(beute)) {
			System.out.println("Direkt getroffen!");
		} else {
			System.out.println("Die Beute steht woanders!\nSie haben nun 10 Dame-Zuege, um die Beute-Figur zu treffen.");
		}
		char richtung=0;
		int anzahl=0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Bewegen Sie Ihre gelbe Dame auf dem Feld " + jaeger.getXpos() + jaeger.getYpos());
			
			do{
				richtung = IOTools.readChar("Wollen Sie waagrecht (-), senkrecht (|) oder diagonal (/, \\) ziehen? ");
			} while(richtung!='-' && richtung!='|' && richtung!='/' && richtung!='\\');
			
			switch (richtung) {
			case '-': anzahl = IOTools.readInt("Wieviele Felder ziehen? (>0 nach rechts, <0 nach links)"); break;
			case '|': anzahl = IOTools.readInt("Wieviele Felder ziehen? (>0 nach oben, <0 nach unten)"); break;
			case '/': anzahl = IOTools.readInt("Wieviele Felder ziehen? (>0 nach oben rechts, <0 nach unten rechts)"); break;
			case '\\': anzahl = IOTools.readInt("Wieviele Felder ziehen? (>0 nach oben links, <0 nach unten links)"); break;
			default:
				break;
			}
			jaeger.ziehe(richtung, anzahl);
			
			if(jaeger.trifft(beute)) {
				System.out.println("Getroffen. Die Beute war auf " + beute.getXpos() + beute.getYpos()); break;
			} else {
				System.out.println("Nicht getroffen. " + i + ". Versuch:");
				
			}
		}
	}
}
