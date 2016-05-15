package aufgabenblatt6;

public class Adresse {
	private String strasse;
	private int hausnr;
	private int plz;
	public Staedte ort;
	
	public Adresse(String strasse, int hausnr, int plz, Staedte ort){
		this.strasse = strasse;
		this.hausnr = hausnr;
		this.plz = plz;
		this.ort = ort;
	}

	public String getStrasse(){
		return strasse;
	}
	public int getHausnummer(){
		return hausnr;
	}
	public int getPostleitzahl(){
		return plz;
	}
	public Staedte getOrt(){
		return ort;
	}
	
	public String toString(){
		String ausgabe = "Straße: " + strasse;
		ausgabe += "\nHausnummer: " + hausnr;
		ausgabe += "\nPostleitzahl: " + plz;
		ausgabe += "\nOrt: " + ort;
		return ausgabe + "\n";
		
	}
}
