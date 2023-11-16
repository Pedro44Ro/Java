package lista3_2109;
import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite a medida de um dos lados do quadrado em cm");
		 int num = entrada.nextInt();
		 
		 num *= 4;
		 
		System.out.println("O quadrado tem um perimetro de " + num + "cm");

	}

}
