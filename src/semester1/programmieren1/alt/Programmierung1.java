package semester1.programmieren1.alt;

import Prog1Tools.IOTools;

public class Programmierung1{
	public static void main (String[] args) {
		Aufgabe21();
	}
	
	public static void Aufgabe7(){
		int a=3, b=4, c=5, d=6, e=0;
		if(a>b && a>c && a>d){
			e = a;
		} else
		if(b>a && b>c && d>d){
			e = b;
		} else
		if(c>a && c>b && c>d){
			e = c;
		} else {
			e = d;
		}
		System.out.println("e=" + e);
	}
	
	public static void Aufgabe9(){
		int n = IOTools.readInteger("Bitte n eingeben: ");
		int i = 3;
		while (i < 2*n){
		 	i++;
			System.out.println(3.14/(2*i-1));
		}
		System.out.println("\n");
		for(i=3; i<2*n;){
			i++;
			System.out.println(3.14/(2*i-1));
		}
		System.out.println("\n");
		i=3;
		do{
			i++;
			System.out.println(3.14/(2*i-1));
		} while(i<2*n);
	}
	
	public static void Aufgabe10(){
		int t = IOTools.readInteger("Bitte Tag eingeben: ");
		int m = IOTools.readInteger("Bitte Monat eingeben: ");
		int j = IOTools.readInteger("Bitte Jahr eingeben: ");
		int h=0, c=0, y=0;
		System.out.print("Der " + t + "." + m + "." + j + " ist ein ");
		if (m <= 2){
			m += 10;
			j--;
		} else m -= 2;
		
		c = j/100; y = j%100;
		h = (((26*m - 2)/10) + t + y + y/4 + c/4 - 2*c) % 7;
		if (h < 0) h += 7;
		switch(h){
			case 0: System.out.print("Sonntag"); break;
			case 1: System.out.print("Montag"); break;
			case 2: System.out.print("Dienstag"); break;
			case 3: System.out.print("Mittwoch"); break;
			case 4: System.out.print("Donnerstag"); break;
			case 5: System.out.print("Freitag"); break;
			case 6: System.out.print("Samstag"); break;
			default:System.out.print("Fehler"); break;
		}
	}
		
	public static void Aufgabe11 (){
		int start = IOTools.readInteger("Bitte Zahl eingeben: ");
		int ende = start*10;
		for (int i = start;i <= ende;i+=start){
			System.out.println(i);
		}
	}
	
	public static void Aufgabe12(){
		double geldbetrag = IOTools.readInteger("Anzulegender Geldbetrag in Euro: ");
		double jahreszins = IOTools.readDouble("Jahreszins (z. B. 0.1 fuer 10 Prozent): ");
		int laufzeit = IOTools.readInteger("Laufzeit (in Jahren): ");
		for(int i=1;i<=laufzeit;i++){
			geldbetrag = geldbetrag + jahreszins*geldbetrag ;
			System.out.println("Wert nach "+i+" Jahren: "+geldbetrag);
		}
	}

	public static void Aufgabe13(){
		int zeilen = IOTools.readInteger("Anzahl der Zeilen: ");
		for(int i=1; i<=zeilen;i++){
			for(int o=1; o<=i; o++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void Aufgabe14(){
		int zahl = IOTools.readInteger("Positive ganze Zahl: ");
		for(int i = 10; zahl != 0; zahl/=10){
			switch(zahl%i){
				case 0: System.out.println("null"); break;
				case 1: System.out.println("eins"); break;
				case 2: System.out.println("zwei"); break;
				case 3: System.out.println("drei"); break;
				case 4: System.out.println("vier"); break;
				case 5: System.out.println("fuenf"); break;
				case 6: System.out.println("sechs"); break;
				case 7: System.out.println("sieben"); break;
				case 8: System.out.println("acht"); break;
				case 9: System.out.println("neun"); break;
			}
		}
	}

	public static void Aufgabe15(){
		System.out.println("Willkommen beim Zahlenraten\nIch denke mir eine Zahl zwischen 0 und 100. Rate diese Zahl!");
		int geheimZahl = (int) (99 * Math.random() + 1);
		int gerateneZahl = 0;
		for(int i=1; gerateneZahl != geheimZahl; i++){
			gerateneZahl = IOTools.readInteger(i + ". Versuch: ");
			if(gerateneZahl < geheimZahl){
				System.out.println("Meine Zahl ist größer!\n");
				continue;
			}
			if(gerateneZahl > geheimZahl){
				System.out.println("Meine Zahl ist kleiner!\n");
				continue;
			}
			if(gerateneZahl == geheimZahl){
				System.out.println("Du hast die Zahl beim " +i+". Versuch erraten!");
				break;
			}
		}
	}

	public static void Aufgabe21(){
		int count = IOTools.readInt("Wieviele Zahlen willst du sortieren? ");
		int zahl[] = new int[count];
		//int cache = 0;
		for (int j = 0; j <= count-1;j++){
			zahl[j] = IOTools.readInt(j+1 + ". Zahl: ");
		}
		Sortierer.sortieres(zahl);
		/*
		for(int i=0; i < count-1;i++){
			for (int j = 0; j < count-1;j++){
				if(zahl[j] > zahl[j+1]){
					cache = zahl[j+1];
					zahl[j+1] = zahl[j];
					zahl[j] = cache;
				}
				
			}
			
		}
		*/
		for(int j=0; j < count; j++){
			System.out.print(zahl[j] + "  ");
		}
	}

	public static void Aufgabe22(){
		int zeilen = IOTools.readInt("Anzahl Zeilen: ");
		for(int i=1; i <= zeilen;i++){
			for(int j=0; j < zeilen-i; j++){
				System.out.print(" ");
			}
			for (int j=1; j<=(2*i-1); j++) {
				System.out.print("*");  
			}
			System.out.println();
		}
		for(int i=1; i<=zeilen-1;i++){
			System.out.print(" ");
		}
		System.out.print("I");
	}

	public static void Aufgabe23(){
		int n = 0;

		while(n<2 || n>10 || n%2==0){
			n = IOTools.readInt("Ungerade Zahl zwischen 2 und 10: ");
		}
		
		int feld[][] = new int[n][n];
		int zeile = n/2, spalte = (n/2)+1;
		
		for(int i = 1; i <= n*n; i++){
			feld[zeile][spalte] = i;
			spalte++; zeile--;
			zeile = zeile<0? n-1: zeile;
			spalte = spalte==n? 0: spalte;

			if(feld[zeile][spalte] != 0){
				zeile++; spalte++;
				zeile = zeile==n? 0: zeile;
				spalte = spalte==n? 0: spalte;
			}
		}
		
		for(int i = 0; i < n;i++){
			for(int j = 0; j < n; j++){
				if(feld[i][j] < 10) System.out.print(" ");
				System.out.print(feld[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void BuchTest(){
		/*
		int i = IOTools.readInt("Anzahl Bücher: ");
		Buch[] buecher = new Buch[i];

		for(int o=0; o<i; o++){
			buecher[o] = new Buch();
			System.out.println();
			System.out.println(o+1 + ". Buch:\n========");
			buecher[o].autor = IOTools.readString("Autor:\t");
			buecher[o].titel = IOTools.readString("Titel:\t");
		}
		*/
		Buch[] buecher = new Buch[2];
		buecher[0] = new Buch();
		buecher[0].autor = "Autor1";
		buecher[0].titel = "Titel1";
		buecher[0].isbn = 11111;
		buecher[0].jahr = 2018;
		buecher[0].ort = "Ort1";
		buecher[0].verlag = "Verlag1";
		
		buecher[1] = new Buch();
		buecher[1].autor = "Autor2";
		buecher[1].titel = "Titel2";
		buecher[1].isbn = 22222;
		buecher[1].jahr = 2018;
		buecher[1].ort = "Ort2";
		buecher[1].verlag = "Verlag2";
		
		for(int o=0; o<2; o++){
			System.out.println(o+1 + ". Buch:\n=============\n" + buecher[o].autor + ": " + buecher[o].titel + 
								"\nISBN: " + buecher[o].isbn + "; Veröffentlichungsjahr: " + buecher[o].jahr + " in " + buecher[o].ort + " vom Verlag " + buecher[o].verlag + "\n\n");
		}
	}

	public static void Aufgabe27(){
		int anzahl = IOTools.readInt("Wieviele Personen willst Du sortieren? ");
		Person[] personen = new Person[anzahl];
		for (int i=0; i<anzahl; i++){
			personen[i] = new Person();
			personen[i].lfdNr = i+1;
			System.out.println(i+1 + ". Person:");
			personen[i].name = IOTools.readString("Nachname: ");
			personen[i].vorname = IOTools.readString("Vorname: ");
			personen[i].alter = IOTools.readShort("Alter: ");
			personen[i].geschlecht = IOTools.readBoolean("Maennlich: ");
		}
		Person cache = new Person();
		for(int i=0; i < anzahl-1;i++){
			for (int j = 0; j < anzahl-1;j++){
				if(personen[j].alter > personen[j+1].alter){
					cache = personen[j+1];
					personen[j+1] = personen[j];
					personen[j] = cache;
				}
			}
		}
		for (int i=0; i<anzahl;i++){
			System.out.print("\nPerson ");
			System.out.print(i+1 + ": " + personen[i].vorname + " " + personen[i].name + ", " + personen[i].alter + " Jahre, ");
			if(personen[i].geschlecht) System.out.print("maennlich, ");
			else System.out.print("weiblich, ");
			System.out.println("lfd. Nr. " + personen[i].lfdNr);
		}
		Aufgabe28(personen);
	}

	public static void Aufgabe28(Person[] personen){
		short maximum = 0;
		for (int i=0; i<personen.length; i++){
			if(personen[i].alter > maximum) maximum = personen[i].alter;
		}
		
		short minimum = 9999;
		for (int i=0; i<personen.length; i++){
			if(personen[i].alter < minimum) minimum = personen[i].alter;
		}
		
		double mittelwert = 0;
		for (int i=0; i<personen.length; i++){
			mittelwert += personen[i].alter;
		}
		mittelwert /= personen.length;
		
		double varianz = 0;
		for (int i=0; i<personen.length; i++){
			varianz += (personen[i].alter - mittelwert) * (personen[i].alter - mittelwert);
		}
		varianz = varianz / personen.length;
		
		System.out.println("\n\n\nMittelwert der Altersangaben: " + mittelwert);
		System.out.println("Varianz der Altersangaben: " + varianz);
		System.out.println("Minimum der Altersangaben: " + minimum);
		System.out.println("Maximum der Altersangaben: " + maximum);
		
		String ende = "n";
		while (ende.equals("n")){
			ende = IOTools.readString("Beenden? (j/n) ");
			
		}
		
	}
}