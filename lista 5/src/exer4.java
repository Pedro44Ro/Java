import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		
		 int fib = 0;
		 int atual = 1; 
		 int ant = 0;
		 int aux = 0; 
		 
		 Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o termo Fibonacci: ");
		fib = entrada.nextInt();
		
		 int primeiroFib = fib;
		
		if(fib < 2) {
			System.out.println("1");
		}
		else {
			for(int i = 2; i < primeiroFib; i++) {
				aux = atual;
				atual += ant;
				ant = aux;
				fib = atual + ant;
			}
		}
		System.out.println(fib);
	}

}
