package lista4;

import java.util.Random;
import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		 float  joken = gerador.nextInt(3) + 1;
		 
			Scanner entrada1 = new Scanner(System.in);
			 System.out.println("Digite 1 para Papel | Digite 2 para Pedra | Digite 3 para Tesoura");
			 float escol = entrada1.nextInt();
			 
			if(joken == escol) {
				 System.out.println("empate, os dois jogaram a mesma coisa");
		} else if (joken==1 && escol==2) {
			 System.out.println("você perdeu, o computador jogou papel");
		}else if (joken==1 && escol==3) {
			 System.out.println("você venceu, o computador jogou papel");
		}else if (joken==2 && escol==1) {
			 System.out.println("você venceu, o computador jougo pedra");
		}else if (joken==2 && escol==3) {
			 System.out.println("você perdeu, o computador jogou pedra");
		}else if (joken==1 && escol==2) {
			 System.out.println("você perdeu, o computador jogou papel");
		}else if (joken==3 && escol==1) {
			 System.out.println("você perdeu, o computador jogou tesoura");
		}else if (joken==3 && escol==2) {
			 System.out.println("você venceu, o computador jogou tesoura");
		}

	}

}
