package aufgabenblatt2;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Bitte geben sie ihre Gr��e in Metern an: ");
		double gr��e = scan.nextDouble();
		System.out.print("Bitte geben Sie nun ihr Gewicht in Kg an: ");
		double gewicht = scan.nextDouble();
		
		System.out.format("Ihr BMI betr�gt: "+(int)(gewicht/(gr��e*gr��e)));
		scan.close();
	}
}
