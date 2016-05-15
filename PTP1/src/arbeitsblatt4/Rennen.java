package arbeitsblatt4;

public class Rennen {
	private int anzahlRennautos;
	private double streckenlaenge;
	Rennauto[] autoListe;

	// Konstruktor
	Rennen(double streckenlaenge) {
		this.streckenlaenge = streckenlaenge;
		autoListe = new Rennauto[1];
	}

	//ein Rennauto-Objekt in die Liste der Rennautos schreiben, die an einem Rennen teilnehmen
	public void addRennauto(Rennauto auto) {
		autoListe[anzahlRennautos] = auto;
		anzahlRennautos++;
		if (anzahlRennautos == autoListe.length) {
			Rennauto[] hilfsListe = new Rennauto[autoListe.length * 2];
			System.arraycopy(autoListe, 0, hilfsListe, 0, autoListe.length);
			autoListe = hilfsListe;
		}
	}

	public Rennauto ermittleSieger() {
		for (int i = 0; i < anzahlRennautos; i++) {
			if (autoListe[i].getStreckeBisher() > this.streckenlaenge) {
				return autoListe[i];

			}
		}
		return null;
	}

	private void schritt(int i) {
		autoListe[i].fahren();
	}

	public void durchfuehren() {
		while (ermittleSieger() == null) {
			for (int i = 0; i < anzahlRennautos; i++) {
				schritt(i);
			}
		}
		ermittleSieger().ausgeben();
	}

	public static void main(String args[]) {
		Rennauto auto1, auto2, auto3, auto4, auto5, auto6, auto7, auto8, auto9;

		auto1 = new Rennauto("Peter", "Ferrari", 180);
		auto2 = new Rennauto("Klaus", "Opel", 120);
		auto3 = new Rennauto("Chantalle", "Fiat", 190);
		auto4 = new Rennauto("Leo", "BMW", 160);
		auto5 = new Rennauto("Phil", "Mercedes", 140);
		auto6 = new Rennauto("Manuel", "Jaguar", 190);
		auto7 = new Rennauto("Johannes", "Jeep", 180);
		auto8 = new Rennauto("Alisa", "Landrover", 200);
		auto9 = new Rennauto("Kevin", "Heißluftballon", 140);

		// Alle autos zum array hinzufuegen
		Rennen autorennen = new Rennen(2000);
		autorennen.addRennauto(auto1);
		autorennen.addRennauto(auto2);
		autorennen.addRennauto(auto3);
		autorennen.addRennauto(auto4);
		autorennen.addRennauto(auto5);
		autorennen.addRennauto(auto6);
		autorennen.addRennauto(auto7);
		autorennen.addRennauto(auto8);
		autorennen.addRennauto(auto9);

		// Es wird ein Wettbuero erstellt und zwei Wetten eingetragen

		Wettbuero wettbuero = new Wettbuero(autorennen, 1.963);
		wettbuero.wetteAnnehmen(new Wette("Manuel", 50, "Sabrina"));
		
		wettbuero.wetteAnnehmen(new Wette("Manuel", 75, "Lutz"));

		wettbuero.wetteAnnehmen(new Wette("Peter", 100, "Michel"));

		// Hier wird das Rennen gestartet
		autorennen.durchfuehren();
		wettbuero.auswerten();

	}
}