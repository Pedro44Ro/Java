import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		
		float total;
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o peso do prato em Kg:");
		 float num = entrada1.nextFloat();
		 
		total = 54 * num;
		
		System.out.println("O valor a pagar é " + total + " reais");

	}

}
