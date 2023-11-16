import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
		float total;
		float p;
		float m;
		float g;
		float totalG;
		float totalM;
		float totalP;
		
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite a quantidade de camisetas pequenas desejadas:");
		 float num1 = entrada1.nextInt();
		 
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite a quantidade de camisetas medias desejadas:");
		 float num2 = entrada2.nextInt();
		 
		 Scanner entrada3 = new Scanner(System.in);
		 System.out.println("Digite a quantidade de camisetas grande desejadas:");
		 float num3 = entrada3.nextInt();
		 
		totalP = 8 * num1; 
		totalM = 10 * num2;
		totalG = 15 * num3;
		total = totalP + totalM + totalG;
		
		System.out.println("O valor a pagar é " + total + " reais");

	}

}
