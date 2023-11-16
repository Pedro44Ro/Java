import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		
		float troca;
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o valor da pizza");
		 float Pizza = entrada1.nextFloat();
		 
		 Scanner entrada2 = new Scanner(System.in);
		 System.out.println("Digite o valor da esfiha");
		 float Esfiha = entrada2.nextFloat();
		 
		System.out.println("Fazendo troca de valores");
		
		troca = Pizza;
		Pizza = Esfiha;
		Esfiha = troca;
		
		System.out.println( "Após a troca o valor da Pizza é " + Pizza);
		System.out.println( "Após a troca o valor da Esfiha é " + Esfiha);

	}

}
