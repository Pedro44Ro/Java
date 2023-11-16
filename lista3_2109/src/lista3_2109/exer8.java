package lista3_2109;

import java.util.Scanner;

public class exer8 {

	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o primeiro numero");
		 float lado1 = entrada1.nextInt();
		 
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o segundo numero");
		 float lado2 = entrada2.nextInt();
		 
		 Scanner entrada3 = new Scanner(System.in);
		 System.out.println("Digite o terceiro numero");
		 float lado3 = entrada3.nextInt();

		 if(lado1 == lado2 & lado2 == lado3) {
			 
			 System.out.println("O triângulo é equiltero");
			 
		 } else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			 System.out.println("O triângulo é equiltero isósceles");
		 	}
		 else{
			 System.out.println("O triângulo é escaleno");
		 }
	}

}
