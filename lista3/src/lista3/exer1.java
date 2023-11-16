package lista3;
import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner(System.in);
		 System.out.println("Digite o nome de um time");
		 String time1 = entrada1.next();
		 
			Scanner entrada2 = new Scanner(System.in);
			 System.out.println("Digite o numero de gols desse time");
			 float num1 = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
		 System.out.println("Digite o nome do outro time");
		 String time2 = entrada3.next();
		 
			Scanner entrada4 = new Scanner(System.in);
			 System.out.println("Digite o nome do outro time");
			 float num2 = entrada4.nextInt();
			 
		if (num1 > num2){
			 System.out.println("O time " + time1 + " é o vencedor");
			 
		} else if (num1 < num2){
			 System.out.println("O time " + time2 + " é o vencedor");
			 
		} else {
			 System.out.println("Aconteceu um empate");
		}

	}

}
