import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o primeiro número:");
		 float num1 = entrada1.nextFloat();
		 
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o segundo número:");
		 float num2 = entrada2.nextFloat();
		 
		 
		 if(num1 == num2) {
			 System.out.println("Os números são iguais");	
		 
		 } else {
			 System.out.println("Os números são diferentes");
			 
		 }

	}

}
