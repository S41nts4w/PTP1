package aufgabenblatt6;

public class Sendung {
	protected Person sender;
	protected Person empfaenger;
	protected int startZeitpunkt;
	protected int transportDauer;
	protected static int sendungsnummerZaehler = 1;
	protected int sendungsNummer;
	protected int zeitJetzt;
	protected SendungsdauerSchaetzer schaetzung = new GoogleSendungsdauerSchaetzer();

	public Sendung(Person sender, Person empfaenger, int startZeitpunkt) {

		this.sender = sender;
		this.empfaenger = empfaenger;
		this.startZeitpunkt = startZeitpunkt;
		sendungsNummer = sendungsnummerZaehler;
		sendungsnummerZaehler++;
	}

	public int getSendungsnummer() {
		return sendungsNummer;
	}

	public int getTransportDauer() {	

		transportDauer = schaetzung.getSendungsTransportDauer(sender.getAdresse().getOrt(), empfaenger.getAdresse().getOrt());
		return transportDauer;
	}

	public int getStartZeitpunkt() {
		return startZeitpunkt;
	}

	public String toString() {
		String ausgabe;
		ausgabe = "\nAbsender: " + sender;
		ausgabe += "\nEmpfänger: " + empfaenger;
		ausgabe += "\nStart: " + startZeitpunkt;
		ausgabe += "\nDauer: " + transportDauer;
		ausgabe += "\nSendungsnummer: " + sendungsNummer;
		return ausgabe;
	}

	public boolean istAusgeliefert() {
		return zeitJetzt >= getStartZeitpunkt() + getTransportDauer();
	}

	public void aktualisiereZeitpunkt(int zeitpunkt) {
		zeitJetzt = zeitpunkt;
	}
}
