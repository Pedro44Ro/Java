package lista;
import java.util.Scanner;
public class exer2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float n1;
		float n2;
		float media;
		System.out.print("Dgite o primeiro n�mero");
		n1 = ler.nextFloat();
		System.out.print("Dgite o segundo n�mero");
		n2 = ler.nextFloat();
		media =	 (n1 +n2)/2;
		System.out.println("O valor da m�dia �: " + media);
		
	}		

}
