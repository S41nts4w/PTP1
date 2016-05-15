package aufgabenblatt6;

public class Brief extends Sendung {
	private boolean istEinschreiben;
	private boolean istAusgeliefert;

	public Brief(Person sender, Person empfaenger, int startZeitpunkt, boolean istEinschreiben) {

		super(sender, empfaenger, startZeitpunkt);
		this.istEinschreiben = istEinschreiben;

	}

	public void istEinschreiben(boolean istEinschreiben) {
		if (istEinschreiben) {
			System.out.println("Bitte Unterschreiben!");
		}
	}

	public void aktualisiereZeitpunkt(int zeitpunkt) {
		super.aktualisiereZeitpunkt(zeitpunkt);
	}

	public boolean istAusgeliefert() {
		istAusgeliefert = super.istAusgeliefert();
		return istAusgeliefert;
	}

	public String toString() {
		String ausgabe = super.toString();
		if (istEinschreiben) {
			ausgabe += "\nDer Brief wurde per Einschreiben verschickt.\n";
		}
		return ausgabe;
	}

}
