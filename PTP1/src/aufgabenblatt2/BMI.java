package aufgabenblatt2;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Bitte geben sie ihre Größe in Metern an: ");
		double größe = scan.nextDouble();
		System.out.print("Bitte geben Sie nun ihr Gewicht in Kg an: ");
		double gewicht = scan.nextDouble();
		
		System.out.format("Ihr BMI beträgt: "+(int)(gewicht/(größe*größe)));
		scan.close();
	}
}
