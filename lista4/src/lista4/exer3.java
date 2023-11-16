package lista4;
import java.util.Random;
import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		 float  joken = gerador.nextInt(3) + 1;
		 
			Scanner entrada1 = new Scanner(System.in);
			 System.out.println("Digite 1 para Pedra | Digite 2 para Papel | Digite 3 para Tesoursa");
			 float escol = entrada1.nextInt();
			 
			if(joken == escol) {
				 System.out.println("Parabens voce acertou");
			}else{
			 System.out.println("Voce errou tente novamente");
		}

	}

}
