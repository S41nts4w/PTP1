package aufgabenblatt2;

public class Satellitenzeit {

	public static void main(String[] args){
		int anzahlSekunden=10000;
		int anzahlSekundenErg;
		int anzahlMinuten;
		int anzahlStunden;
		int anzahlTage;
		

			anzahlTage=anzahlSekunden/86400;
			anzahlStunden=(anzahlSekunden%86400)/3600;
			anzahlMinuten=(anzahlSekunden%3600)/60;
			anzahlSekundenErg=(anzahlSekunden%60);

		System.out.println(anzahlTage+" Tage "+anzahlStunden+":"+anzahlMinuten+":"+anzahlSekundenErg);
	}
}

