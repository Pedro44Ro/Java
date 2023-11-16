package lista3_2109;
import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o primeiro numero");
		 int num1 = entrada1.nextInt();
		
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o segundo numero");
		 int num2 = entrada2.nextInt();
		 
		 if ((num1 + num2) > 10) {
			 System.out.println("A soma do numero é " + (num1 + num2));	 
		 } 
		 else {
			 System.out.println("A soma do numero é menor que 10, por isso o resultado nao sera exibido");
		 }
	}

}
