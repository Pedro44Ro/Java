package lista3_2109;
import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite o nome");
		 String nomeu = entrada.next();
		 
		 if(nomeu.equals("batata")) {
			 System.out.println("O nome está correto");
		 }
		 else{
			 System.out.println("O nome está incorreto");
		 }

	}

}
