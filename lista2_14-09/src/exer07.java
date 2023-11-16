import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o primeiro número:");
		 float num1 = entrada1.nextFloat();
		 
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o segundo número:");
		 float num2 = entrada2.nextFloat();
		 
		 
		 if(num1 % num2 == 0) {
			 System.out.println("O primeiro é divisível pelo segundo");	
		 
		 } else {
			 System.out.println("O primeiro não é divisível pelo segundo");
			 
		 }

	}

}
