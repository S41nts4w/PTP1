package aufgabenblatt6;

import aufgabenblatt6.Staedte;

public class TestPost {

	public static void main(String[] args) {

		Person Daniel = new Person("Daniel", new Adresse("Hinrichsenstrasse", 28, 20535, Staedte.HAMBURG));
		Person Derya = new Person("Derya", new Adresse("Königsallee", 28, 40212, Staedte.DUESSELDORF));

		Sendung post = new Brief(Daniel, Derya, 3, true);

		post.aktualisiereZeitpunkt(236);

		System.out.println(post.istAusgeliefert());
		System.out.println(post);

		Sendung post2 = new Paket(Daniel, Derya, 3, 40);

		post2.aktualisiereZeitpunkt(236);

		System.out.println(post2.istAusgeliefert());
		System.out.println(post2);

		System.out.println("" + post2.sender.getAdresse().getOrt().ordinal());
		
		Simulator sim = new Simulator(3);
		sim.erzeugePerson();
	}

}
