import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int num = entrada.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1; i <= num; i++) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de " + num + " � igual a: " + fatorial);
		
	}

}
