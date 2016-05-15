package aufgabenblatt6;

public class Person {
	private Adresse adresse;
	private String name;

	public Person(Adresse adresse) {
		this.adresse = adresse;
	}

	public Person(String name, Adresse adresse) {
		this.adresse = adresse;
		this.name = name;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "\nName: " + getName() + "\n" + getAdresse();
	}
}
