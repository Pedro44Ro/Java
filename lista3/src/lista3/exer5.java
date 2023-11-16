package lista3;
import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		double porcent = 0;
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o nome do produto");
		 String nome = entrada1.next();
		 
			Scanner entrada2 = new Scanner(System.in);
			 System.out.println("Digite a quantidade de produtos");
			 int quant = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
		 System.out.println("Digite o valor do produto");
		 double valor = entrada3.nextInt();
		 
			double total = quant*valor;
		 
			if (quant <= 5 ){
				 porcent = 0.02; 
				
			} else if (quant <= 10){
				 porcent = 0.03;
				 
			} else {
				 porcent = 0.05;
			}
			
			System.out.println("Nome do produto: " + nome);
			 System.out.println("Valor total: " + total);
			 System.out.println("Valor do desconto: " + total*porcent);
			 System.out.println("Valor final: " + (total - (total*porcent)));

	}

}
