package lista3_2109;

import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite um numero");
		 int num = entrada.nextInt();
		
		 
		 if (num > 0) {
			 
			 System.out.println("O numero é positivo");	 

		 } else if (num == 0) {
			 
			 System.out.println("O numero é a zero ");	 
			 
		 }
		 else {
			 System.out.println("O numero é negativo");	 
		 }
	}

}
