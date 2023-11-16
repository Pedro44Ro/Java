import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		
		float total;
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite quantos reias de gasolina vai ser colocado");
		 float num1 = entrada1.nextFloat();
		 
		Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o valor da gasolina");
		float num2 = entrada1.nextFloat();
		 
		total = num1 / num2;
		
		System.out.println("Você abasteceu " + total + " litros");
	}

}
