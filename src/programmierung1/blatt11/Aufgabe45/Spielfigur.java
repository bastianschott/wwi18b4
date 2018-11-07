package programmierung1.blatt11.Aufgabe45;

public class Spielfigur {
	  private char xPos;
	  private int yPos;
	  private String farbe;
	  public Spielfigur (char x, int y, String f) {
	    xPos = x;
	    yPos = y;
	    farbe= f;
	    korrigierePosition();
	  }
	  private void korrigierePosition () {
	    if (xPos < 'A')
	      xPos = 'A';
	    else if (xPos > 'H')  
	      xPos = 'H';
	    if (yPos < 1)
	      yPos = 1;
	    else if (yPos > 8)  
	      yPos = 8;
	  }
	  public char getXpos () {
	    return xPos;
	  }
	  public int getYpos () {
	    return yPos;
	  }
	  public String getFarbe () {
	    return farbe;
	  }
	  public void ziehe (int xFelder, int yFelder) {
	    xPos = (char) (xPos + xFelder);
	    yPos = yPos + yFelder;
	    korrigierePosition();
	  }
	  public String toString() {
	    return farbe + "e Figur auf Feld " + xPos + yPos;
	  }
	}
