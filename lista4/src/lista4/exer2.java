package lista4;
import java.util.Random;
import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		 int  num = gerador.nextInt(10) + 1;
		 
			Scanner entrada1 = new Scanner(System.in);
			 System.out.println("Digite 1 para Impar | Digite 2 para Par");
			 float escol = entrada1.nextInt();
			 
			 boolean par = (num%2 == 0) ? true : false;
			 
			if(par == true && escol == 2 || par == false && escol == 1) {
				 System.out.println("Parabens voce acertou");
			}else{
			 System.out.println("Voce errou tente novamente");
		}
	}

}
