package exer01;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite um n�mero");
		 float num1 = entrada1.nextInt();
		 
			Scanner entrada2 = new Scanner(System.in);
			 System.out.println("Digite outro n�mero");
			 float num2 = entrada2.nextInt();
			 
				System.out.println("soma");
				System.out.println(num1 + num2);
				System.out.println("subtra��o");
				System.out.println(num1 - num2);
				System.out.println("divis�o");
				System.out.println(num1 / num2);
				System.out.println("multiplica��o");
				System.out.println(num1 * num2);
  }

}
