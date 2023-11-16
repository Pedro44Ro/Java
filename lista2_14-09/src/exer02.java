import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		
		double imp;
		double comi;
		double total;
		
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o valor base do carro");
		 float num = entrada1.nextInt();
		 
		 imp = num * 0.45;
		 comi = num * 0.25;
		 total = num + imp + comi;
		 
		System.out.println("O valor total será de:");
		System.out.println(total);
		
	}

}
