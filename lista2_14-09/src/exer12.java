import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		float num4;

		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o primeiro número:");
		 float num1 = entrada1.nextFloat();
		 
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o segundo número:");
		 float num2 = entrada2.nextFloat();
		 
		 Scanner entrada3 = new Scanner(System.in);
		 System.out.println("Digite o terceiro número:");
		 float num3 = entrada3.nextFloat();
		 
		 
		 if(num1 < num2) {
			 num4 = num1;
			 num1 = num2;
			 num2 = num4;
		 
		 }
		 
		 if( num1 < num3) {
			num4 = num1;
			num1 = num3;
			num3 = num4;
			 
		 }
		 
		 if( num2 < num3) {
			num4 = num2;
			num2 = num3;
			num3 = num4;
			 
		 }
		 
		 
		 System.out.println("O menor número é " + num1 + " " + num2 + " "+ num3);

	}

}
