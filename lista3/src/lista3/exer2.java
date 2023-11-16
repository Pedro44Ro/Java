package lista3;
import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
	
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite a idade da primeira mulher");
		 float mul1 = entrada1.nextInt();
		 
			Scanner entrada2 = new Scanner(System.in);
			 System.out.println("Digite a idade da segunda mulher");
			 float mul2 = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
		 System.out.println("Digite a idade do primeiro homem");
		 float hom1 = entrada3.nextInt();
		 
			Scanner entrada4 = new Scanner(System.in);
			 System.out.println("Digite a idade do segundo homem");
			 float hom2 = entrada4.nextInt();
			 
		if (hom1 > hom2 && mul1 > mul2){
			 System.out.println("A soma das idades do homem mais velho com a mulher mais nova é igual a " + (hom1 + mul2));
			 System.out.println("E o produto das idades do homem mais novo com a mulher mais velha, é igual a " + (hom2 * mul1));
			  
		} else	if (hom2 > hom1 && mul1 > mul2){
			 System.out.println("A soma das idades do homem mais velho com a mulher mais nova é igual a " + (hom2 + mul2));
			 System.out.println("E o produto das idades do homem mais novo com a mulher mais velha, é igual a " + (hom1 * mul1));
			  
		} else if (hom1 > hom2 && mul2 > mul1){
			 System.out.println("A soma das idades do homem mais velho com a mulher mais nova é igual a " + (hom1 + mul1));
			 System.out.println("E o produto das idades do homem mais novo com a mulher mais velha, é igual a " + (hom2 * mul2));
			  
		} else {
			 System.out.println("A soma das idades do homem mais velho com a mulher mais nova é igual a " + (hom2 + mul1));
			 System.out.println("E o produto das idades do homem mais novo com a mulher mais velha, é igual a " + (hom1 * mul2));	  

		}

	}
}
