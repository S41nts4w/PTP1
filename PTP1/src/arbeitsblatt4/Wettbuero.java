package arbeitsblatt4;

public class Wettbuero {
	private int anzahlWetten;
	private double faktor;
	private double gewinn;
	Rennen rennen;
	Wette[] wettliste;

	/**
	 * Konstruktor mit zwei Parametern
	 * 
	 * @param rennen
	 * @param faktor
	 */

	public Wettbuero(Rennen rennen, double faktor) {
		this.rennen = rennen;
		this.faktor = faktor;
		wettliste = new Wette[1];
	}

	/**
	 * Methode zur Annahme einer Wette. Zusätzlich wird die Wettliste bei bedarf
	 * vergrößert
	 * 
	 * @param wette
	 */
	public void wetteAnnehmen(Wette wette) {
		wettliste[anzahlWetten] = wette;
		anzahlWetten++;

		if (anzahlWetten == wettliste.length) {
			Wette[] hilfsListewette = new Wette[wettliste.length * 2];
			System.arraycopy(wettliste, 0, hilfsListewette, 0, wettliste.length);
			wettliste = hilfsListewette;
		}

	}

	/**
	 * Die Auswertung der Wettliste mit dem Rennen. Es wird überprüft ob einer
	 * der Spieler auf den richtigen Fahrer gesetzt hat und eine
	 * dementsprechende Ausgabe getätigt.
	 */
	public void auswerten() {
		boolean keinGewinner = true;
		for (int i = 0; i < anzahlWetten; i++) {
			if (rennen.ermittleSieger().getNameFahrerIn() == wettliste[i].getFahrerIn()) {
				gewinn = faktor * wettliste[i].getWettEinsatz();
				System.out.format("%s hat richtig getippt und %.2f Euro gewonnen.\n", wettliste[i].getSpieler(),
						gewinn);
				keinGewinner = false;
			}
		}
		if (keinGewinner) {
			System.out.println("Leider hat niemand richtig getippt.");
		}

	}
}
