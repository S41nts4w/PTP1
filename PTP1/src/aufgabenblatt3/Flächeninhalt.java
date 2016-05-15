package aufgabenblatt3;

import java.util.Scanner;
import java.lang.Math;

public class Flächeninhalt {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		float x;
		int index;
		
		System.out.println("Bitte geben Sie an, welcher Flächeninhalt berechnet werden soll:\n1 = Kreis\n2 = Quadrat\n3 = Sechseck ");
		index = scan.nextInt();
		
		if(index==1){
			System.out.println("Bitte geben Sie den Radius des Kreises in cm an: ");
			x=scan.nextFloat();
			System.out.println("Der Kreis besitzt einen Flächeninhalt von: "+Math.PI*(x*x)+"cm");
		}
		else if(index==2){
			System.out.println("Bitte geben Sie die Seitenlänge des Quadrats in cm an: ");
			x=scan.nextFloat();
			System.out.println("Der Flächeninhalt des Quadrates beträgt: "+x*x+"cm");
		}
		else if(index==3){
			System.out.println("Bitte geben Sie die Seitenlänge des Sechseckes in cm an: ");
			x=scan.nextFloat();
			float quadrat=x*x;
			double ergebnis= 1.5*(quadrat)*(Math.sqrt(3));
			System.out.println("Der Flächeninhalt des Sechseckes beträgt: "+ergebnis+"cm");
		}
		else{
			System.out.println("Ungültige Eingabe -1");
		}
		scan.close();
	}

}
