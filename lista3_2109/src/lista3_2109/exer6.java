package lista3_2109;
import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		
		int total;
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o primeiro numero");
		 int num1 = entrada1.nextInt();
		
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o segundo numero");
		 int num2 = entrada2.nextInt();
		 
		 total = num1 + num2;
		 
		 if (total > 20) {
			 
			 total += 8;

		 } 
		 else {
			 
			 total -= 5;
			 
		 }
		 
		 System.out.println("O resultado é " + total);	 

	}

}
