package aufgabenblatt_3;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fiboX=0;//deklaration und Initialisierung der 0ten Fibonacci-Zahl
		int fiboY=1;//deklaration und Initialisierung der 1ten Fibonacci-Zahl
		int fiboZ;//deklaration der 2ten Fibonacci-Zahl(dient als Zwischenspeicher, zur �bergabe an die n�chste Fibonacci-Zahl)
		int i = 0;//deklaration und Initialisierung des Z�hlers f�r die Begrenzung der While-Schleife
		int eingabe=0;

		while(eingabe<2){
			System.out.print("Bitte die gewollte Zahl der Fibonacci-Folge angeben: ");
			eingabe = scan.nextInt();
			if(eingabe<2)
				System.out.println("Die Zahl muss gr��er als 1 sein");
		}
		
		if(eingabe >=2){
			while(i<eingabe){//Er�ffnung der While-Schleife, mit der Bedingung das i kleiner als der vom Nutzer �bergebenen Zahl ist.
				fiboZ=fiboX+fiboY;
				fiboX=fiboY;
				fiboY=fiboZ;
				i++;
			}
		}

		System.out.println("Die "+eingabe+"te Fibonacci-Zahl ist "+fiboX);//Ausgabe des Ergebnisses
		scan.close();

	}

}
