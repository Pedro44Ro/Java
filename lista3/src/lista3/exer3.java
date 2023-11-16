package lista3;
import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o tipo do combustivel");
		 String tipo = entrada1.next();
		 
			Scanner entrada2 = new Scanner(System.in);
			 System.out.println("Digite quantos litros voce colocou");
			 float lit = entrada2.nextInt();
			 
		if (tipo.equals("gasolina") && lit <= 20){
			
			 System.out.println("O total pagar é R$" + ((lit * 3.3) * 0.97));
			  
		} else	if (tipo.equals("gasolina") && lit > 20){
			
			 System.out.println("O total pagar é R$" + ((lit * 3.3) * 0.95));
			  
		} else if (tipo.equals("etanol") && lit <= 20){
			
			 System.out.println("O total pagar é R$" + ((lit * 2.9) * 0.96));
			  
		} else {
			 System.out.println("O total pagar é R$" + ((lit * 2.9) * 0.94));
		}

	}

}
