import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite um número");
		 float num1 = entrada1.nextInt();
		 
			Scanner entrada2 = new Scanner(System.in);
			 System.out.println("Digite outro número");
			 float num2 = entrada2.nextInt();
			 
				System.out.println("soma");
				System.out.println(num1 + num2);
				System.out.println("subtração");
				System.out.println(num1 - num2);
				System.out.println("divisão");
				System.out.println(num1 / num2);
				System.out.println("multiplicação");
				System.out.println(num1 * num2);
 

	}

}
