package lista4;

import java.util.Random;
import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		 float  jogador1 = gerador.nextInt(2) + 1;
		 float  jogador2 = gerador.nextInt(2) + 1;
		 
			Scanner entrada1 = new Scanner(System.in);
			 System.out.println("Digite 2 ou 1 ");
			 float escol = entrada1.nextInt();
			 
			if(jogador1 == escol && jogador2 == escol) {
				 System.out.println("empate, os dois jogaram a mesma coisa");
		} else if (jogador1 != escol && jogador2 == escol) {
			 System.out.println("você perdeu, jogue novamente");
		}else if (jogador1 == escol && jogador2 != escol) {
			 System.out.println("você perdeu, jogue novamente");
		}else if (jogador1 != escol && jogador2 != escol) {
			 System.out.println("você venceu, parabens");
		}
	}

}
