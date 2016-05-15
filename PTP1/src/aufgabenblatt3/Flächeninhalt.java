package aufgabenblatt3;

import java.util.Scanner;
import java.lang.Math;

public class Fl�cheninhalt {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		float x;
		int index;
		
		System.out.println("Bitte geben Sie an, welcher Fl�cheninhalt berechnet werden soll:\n1 = Kreis\n2 = Quadrat\n3 = Sechseck ");
		index = scan.nextInt();
		
		if(index==1){
			System.out.println("Bitte geben Sie den Radius des Kreises in cm an: ");
			x=scan.nextFloat();
			System.out.println("Der Kreis besitzt einen Fl�cheninhalt von: "+Math.PI*(x*x)+"cm");
		}
		else if(index==2){
			System.out.println("Bitte geben Sie die Seitenl�nge des Quadrats in cm an: ");
			x=scan.nextFloat();
			System.out.println("Der Fl�cheninhalt des Quadrates betr�gt: "+x*x+"cm");
		}
		else if(index==3){
			System.out.println("Bitte geben Sie die Seitenl�nge des Sechseckes in cm an: ");
			x=scan.nextFloat();
			float quadrat=x*x;
			double ergebnis= 1.5*(quadrat)*(Math.sqrt(3));
			System.out.println("Der Fl�cheninhalt des Sechseckes betr�gt: "+ergebnis+"cm");
		}
		else{
			System.out.println("Ung�ltige Eingabe -1");
		}
		scan.close();
	}

}
