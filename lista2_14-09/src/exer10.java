import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o primeiro número:");
		 float num1 = entrada1.nextFloat();
		 
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o segundo número:");
		 float num2 = entrada2.nextFloat();
		 
		 Scanner entrada3 = new Scanner(System.in);
		 System.out.println("Digite o terceiro número:");
		 float num3 = entrada3.nextFloat();
		 
		 
		 if(num2 < num1) {
			 num1 = num2;
		 
		 }
		 
		 if( num3 < num1) {
			num1 = num3;
			 
		 }
		 
		 System.out.println("O menor número é " + num1);

	}

}
