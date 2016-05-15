package aufgabenblatt6;

import java.util.ArrayList;

public class Simulator {
	private int zeit;
	private final int SCHRITT = 60;
	ArrayList<Sendung> sendung = new ArrayList<Sendung>();
	
//	Testkonstruktor zum überprüfen der Methoden in der Testklasse
	public Simulator(int Zeit){
		this.zeit = zeit;
	}

	public void schritt() {
		zeit += SCHRITT;
	}
	
//	Eine Zufallsperson erzeugen.
	public Person erzeugePerson() {
		Staedte stadt = Staedte.values()[(int) (Math.random() * Staedte.values().length)];
		int randomHausnummer = (int) ((Math.random() * 100) + 1);
		int randomPlz = (int) ((Math.random() * 20000) + 10001);
		String name = randomName();
		
		Person person = new Person(name, new Adresse(strassenBausetein(), randomHausnummer, randomPlz, stadt));
		System.out.println(person);
		return person;
	}

	private String strassenBausetein() {
		String strassenName;
		String[] baustein1 = { "Hinrichsen", "Falken", "Schulkamp", "Muster", "Holm", "Berg", "Schuster", };
		String[] baustein2 = { "acker", "kraut", "feld", "-Kirchen ", "" };
		String[] baustein3 = { "weg", "allee", "Strasse", "damm", "moor", "steg", "fleed", "dom", "" };
		strassenName = baustein1[(int) (Math.random() * baustein1.length)];
		strassenName += baustein2[(int) (Math.random() * baustein2.length)];
		strassenName += baustein3[(int) (Math.random() * baustein3.length)];
		return strassenName;
	}

	private String randomName() {
		String name;
		String[] vorname = { "Daniel", "Derya", "Damian", "Dennis", "Adem", "Adam", "Bob", "Stefan", "Reinhard", "Max",
				"Muster", "Mann", "Hans", "Kurt", "Carsten", "Dennis", "Carina", "Marie", "Maia", "Christine",
				"Charlotte", "Anita", "Louisa", "Clara", "Hannes", "Hauke", "Peter", "Lars", "Hummel", "Matthias",
				"Günther", "Florian", "Johannes", "Friemke", "Lara", "Laura", "Lorelei", "Lisa", "Maike", "Michael",
				"Ute", "Miriam", "Sabrina", "Swanche", "Max", "John", "Jaine", "Santa", "Peter", "Lois", "Stewie" };
		String[] nachname = { "von Drathen", "Uyargil", "Maffai", "Bopp", "Haus", "Mustermann", "Doe", "Snow", "Reinhard", "Harrington",
				"Cobain", "Lee", "Klaus", "Lackless", "Griffin", "Dexter", "Zorlel", "Jaine", "Otto", "Gargamel",
				"Holle", "Knutz", "Ömer", "Nolte", " van Elst", "Gersting", "Brahm", "Tunnel", "Hummel", "Canterburry",
				"Hopps", "Mops", "Schlund", "Wund", "Hungrig", "Müde", "viel zu spät", "Geh ", "Ins", "Bett",
				"Warum", "Bin", "Ich ", "Noch", "Wach" };
		name = vorname[(int) (Math.random() * vorname.length)] + " ";
		name += nachname[(int) (Math.random() * nachname.length)];
		return name;
	}
}
