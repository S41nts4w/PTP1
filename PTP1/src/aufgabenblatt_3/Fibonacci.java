package aufgabenblatt_3;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fiboX=0;//deklaration und Initialisierung der 0ten Fibonacci-Zahl
		int fiboY=1;//deklaration und Initialisierung der 1ten Fibonacci-Zahl
		int fiboZ;//deklaration der 2ten Fibonacci-Zahl(dient als Zwischenspeicher, zur Übergabe an die nächste Fibonacci-Zahl)
		int i = 0;//deklaration und Initialisierung des Zählers für die Begrenzung der While-Schleife
		int eingabe=0;

		while(eingabe<2){
			System.out.print("Bitte die gewollte Zahl der Fibonacci-Folge angeben: ");
			eingabe = scan.nextInt();
			if(eingabe<2)
				System.out.println("Die Zahl muss größer als 1 sein");
		}
		
		if(eingabe >=2){
			while(i<eingabe){//Eröffnung der While-Schleife, mit der Bedingung das i kleiner als der vom Nutzer übergebenen Zahl ist.
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
