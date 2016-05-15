package aufgabenblatt6;

public class Paket extends Sendung {

	public boolean istAusgeliefert;
	public int gewicht;

	public Paket(Person sender, Person empfaenger, int startZeitpunkt, int gewicht) {
		super(sender, empfaenger, startZeitpunkt);
		this.gewicht = gewicht;
	}

	public boolean istAusgeliefert() {
		istAusgeliefert = super.istAusgeliefert();
		return istAusgeliefert;
	}

	public void aktualisiereZeitpunkt(int zeitpunkt) {
		super.aktualisiereZeitpunkt(zeitpunkt);
	}

	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "\nDas Gewicht des Paketes ist: " + gewicht + " Kg";
		return ausgabe;
	}

}
