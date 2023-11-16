package lista3;
import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		
		double total = 0;
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite a fruta que foi comprada");
		 String tipo = entrada1.next();
		 
			Scanner entrada2 = new Scanner(System.in);
			 System.out.println("Digite quantos quilos voce comprou");
			 float kg = entrada2.nextInt();
			 
		if (tipo.equals("maчу")){
			
			if (kg <= 5) {
				total = kg * 1.8;
			 System.out.println("O total pagar щ R$" + total);
			}
			else if (kg <= 8){
				total = kg * 1.5;
				System.out.println("O total pagar щ R$" + total);
			}
			else{
				total = kg * 1.5;
			}
		} 
		
		
		if (tipo.equals("morango")){
			
			if (kg <= 5) {
				total = kg * 2.5;
			 System.out.println("O total pagar щ R$" + total);
			 
			} else if (kg <= 8) {
				total = kg * 2.2;
			 System.out.println("O total pagar щ R$" + total);
			}
			else{
				total = kg * 2.2;
			}
		}
		if (kg > 8 || total > 25){
			 System.out.println("O total pagar щ R$" + (total * 0.9));
		}
		
	}
}
