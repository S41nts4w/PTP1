package aufgabenblatt3;

public class Arrays {

	public static void main(String[] args) {
		int temp[][]= new int [14][2];
		float durch=0;
		int min=100;
		int max=0;
		int diff=0;
		String tage="0";
		
		temp[0][1]=12;
		temp[1][1]=14;
		temp[2][1]=9;
		temp[3][1]=12;
		temp[4][1]=15;
		temp[5][1]=16;
		temp[6][1]=15;
		temp[7][1]=15;
		temp[8][1]=11;
		temp[9][1]=8;
		temp[10][1]=13;												
		temp[11][1]=13;
		temp[12][1]=15;
		temp[13][1]=12;
		
		for(int i=0;i<temp.length;i++){
			durch=durch+temp[i][1];
			temp[i][0]=i+1;
			System.out.println(temp[i][0] +" | " + temp[i][1]+"\n_______");
				if(temp[i][1]>max){
					max=temp[i][1];
				}
				if(temp[i][1]<min){
					min=temp[i][1];
				}
				if(i>=1){																		//Vergleich der Temperatur ab Tag 2
					if(diff<Math.abs(temp[i][1]-temp[i-1][1])){									//If Vergleich der Temperatur von Tag i und dem Tag davor				
						Integer umwandler1=new Integer(temp[i][0]);								//Kann alles übersprungen werden,				
						Integer umwandler2=new Integer(temp[i-1][0]);							//Ich hab nur noch etwas rumgespielt				
						tage=umwandler2.toString()+"ten und dem "+umwandler1.toString()+"ten ";	//nächste Zeile wird wieder interessant				
						diff=temp[i][1]-temp[i-1][1];											
						diff=Math.abs(diff);
					}
					else if(diff==Math.abs(temp[i][1]-temp[i-1][1])){							//Abfangen der Möglichkeit, dass die Temperatur häufiger gleich doll schwankt
						Integer umwandler1=new Integer(temp[i][0]);
						Integer umwandler2=new Integer(temp[i-1][0]);
						tage=tage+"sowie dem "+umwandler2.toString()+"ten und dem "+umwandler1.toString()+"ten ";
					}
				}
		}
		System.out.println("Die Durchschnittstemperatur für diese zwei Wochen beträgt: \n" + durch/temp.length + " Grad Celsius\n"
		+ "Dabei war die niedrigste Temperatur " + min + " Grad Celsius und die höchste " + max + " Grad Ceslius\n"
		+ "Die größte Temperaturschwankung fand dabei zwischen dem " + tage + "Tag statt.");
		
		for(int i=0;i<2;i++){
			for(int y=0;y<temp.length;y++){
				System.out.format("%3d", temp[y][i]);
				System.out.print("|");
			}
			System.out.println("\n--------------------------------------------------------");
		}
	}
}
