package lista4;

import java.util.Random;
import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		 float  dado1 = gerador.nextInt(6) + 1;
		 float  dado2 = gerador.nextInt(6) + 1;
			 
			if((dado1 + dado2) == 7 || (dado1 + dado2) == 11) {
				 System.out.println("voce venceu");
		} else {
			 System.out.println("voce perdeu, jogue novamente");
			 
		}

	}

}
