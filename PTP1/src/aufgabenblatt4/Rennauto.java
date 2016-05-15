/**
 * Praktikum TIPTP1, SS 2016
 * Gruppe: Daniel von Drathen,
 * Derya Uyargil
 * Aufgabe: Aufgabenblatt 4, Aufgabe 1
 */

/**
 * Aufgabe 4.1: Rennauto
 * Schwerpunkte: Klasse mit Zustand
 * Aufgabe: Schreiben Sie eine Klasse Rennauto. Jedes Rennauto hat folgende Eigenschaften:
 * •  Name der Fahrerin
 * •  Fahrzeugtyp
 * •  Maximalgeschwindigkeit (Veraenderung der gefahrenen Strecke pro Zeitschritt)
 * •  bisher gefahrene Strecke ab dem Start
 * Schreiben Sie einen Konstruktor, der die Objektvariablen initialisiert (Name, Typ und
 * Maximalgeschwindigkeit sind Parameter). Das  Rennauto  hat außerdem eine Methode  fahren() . Beim
 * Aufruf der Methode bewegt sich das  Rennauto zunaechst einen Schritt (Zeitschritt = 1) mit
 * Maximalgeschwindigkeit weiter. Eine Fahrerin schafft es aber nicht immer, die Maximalgeschwindigkeit
 * auszureizen. Daher wird die tatsaechlich gefahrene Distanz in einem Zeitschritt mit einem Zufallsfaktor
 * skaliert ( Math.random() liefert eine Zufallszahl aus [0,1]). Die Klasse benoetigt außerdem eine Methode
 * ausgeben() , die den aktuellen Zustand der Klasse auf der Konsole ausgibt. Testen Sie Ihre
 * Implementierung, z.B. indem Sie eine Instanz von  Rennauto erstellen, einige Schritte fahren und jeweils den
 * Zustand des Objektes ausgeben.
 */

package aufgabenblatt4;

public class Rennauto {
	private String nameFahrerIn;
	private String fahrzeugtyp;

	// Veränderung der gefahrenen Strecke pro Zeitschritt
	private double maxSpeed;
	private double streckeBisher = 0;

	/**
	 * Konstruktoren mit 3 Parametern
	 * 
	 * @param nameFahrerIn
	 * @param fahrzeugtyp
	 * @param maxSpeed
	 */
	Rennauto(String nameFahrerIn, String fahrzeugtyp, int maxSpeed) {
		this.nameFahrerIn = nameFahrerIn;
		this.fahrzeugtyp = fahrzeugtyp;
		this.maxSpeed = maxSpeed;
	}

	/**
	 * Methode zur Berechnung der gefahrenen Strecke mit einem Zufallsfaktor
	 */

	public void fahren() {
		streckeBisher += maxSpeed * Math.random();
	}

	/**
	 * Ausgabe eines Rennautos mit dessen FahrerIn über die Methode toString
	 */
	public void ausgeben() {
		/*
		 * System.out.format("Name der FahrerIn: " + this.nameFahrerIn +
		 * "\nFahrzeugtyp: " + fahrzeugtyp + "\nMaximalgeschwindigkeit : " +
		 * maxSpeed + " km/h" + "\nBisher zurückgelegte Strecke: %.2f Kilometer"
		 * , streckeBisher);
		 */ System.out.println(toString());
	}

	/**
	 * Methode die einen String mit einem Auto, der FahrerIn und der maximalen
	 * Geschwindigkeit zurück gibt
	 */
	public String toString() {
		return String.format("Name der FahrerIn: " + nameFahrerIn + "\nFahrzeugtyp: " + fahrzeugtyp
				+ "\nMaximalgeschwindigkeit : " + maxSpeed + " km/h" + "\nZurückgelegte Strecke: %.2f Kilometer",
				streckeBisher);
	}

	public static void main(String args[]) {
		/*
		 * Rennauto porsche = new Rennauto("Sam","Cabrio", 220 ); 
		 * for(int schritte=4; schritte!=0; schritte--){ 
		 * porsche.fahren();
		 * porsche.ausgeben(); 
		 * }
		 */
	}

	// Getter
	public double getStreckeBisher() {
		return streckeBisher;
	}

	public String getNameFahrerIn() {
		return nameFahrerIn;
	}
}
