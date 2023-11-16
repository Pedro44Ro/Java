import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		
		int somatorio = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
		System.out.println("Digite a nota " + (i + 1));
		
		int nota = entrada.nextInt();
		
			somatorio += nota;
	
		}
		
		System.out.println("O valor da média dos números é: " + somatorio / 10);
	}

}
