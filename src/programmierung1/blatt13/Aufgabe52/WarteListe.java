package programmierung1.blatt13.Aufgabe52;

public interface WarteListe {
  // Methode zur Aufnahme des Patienten p in die Warteliste
  public void rein(Patient p);

  // Methode zum löschen des Patienten aus der Warteliste
  public Patient raus();
}
