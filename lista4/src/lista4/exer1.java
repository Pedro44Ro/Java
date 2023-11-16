package lista4;
import java.util.Random;
import java.util.Scanner;
public class exer1 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		 float  face = gerador.nextInt(2) + 1;
		 
			Scanner entrada1 = new Scanner(System.in);
			 System.out.println("Digite 1 para Cara | Digite 2 para Coroa");
			 float escol = entrada1.nextInt();
			 
			if(face == escol) {
				 System.out.println("Parabens voce acertou");
			}else{
			 System.out.println("Voce errou tente novamente");
			}
	}

}
