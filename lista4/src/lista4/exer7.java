package lista4;
import java.util.Random;
import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //Nesse jogo o usuario � um cavaleiro que dever� lutar contra uma criatura muito poderosa conhecida como boss, o seu objetivo sera rolar os dados para 
        // causar dano ao monstro em quanto ele tambem te ataca
        
        int userHP = 100;
        int bossHP = 100;
        int round = 1;
        
        while(userHP > 0 && bossHP > 0) {
            System.out.println("Rodada " + round);
            int userDamage = random.nextInt(20) + 1; // Dano aleat�rio entre 1 e 20
            int bossDamage = random.nextInt(15) + 1; // Dano aleat�rio entre 1 e 25
            
            System.out.println("Voc� causou " + userDamage + " de dano ao boss.");
            bossHP -= userDamage;
            
            System.out.println("O boss causou " + bossDamage + " de dano a voc�.");
            userHP -= bossDamage;
            
            System.out.println("HP do Usu�rio: " + userHP);
            System.out.println("HP do Boss: " + bossHP);
            
            if (userHP > 0 && bossHP > 0) {
                System.out.print("Deseja ir para a pr�xima rodada? (s/n): ");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("n")) {
                    break;
                }
            } else if(userHP < 0 && bossHP < 0) {          	
            	 	System.out.println("Empate. Ambos morreram"); 
            	 	
            		}
            		else if (userHP <= 0) {           		
            			System.out.println("Voc� foi derrotado. Game Over!");
                
            		} 
            		else if(bossHP <= 0) {       
            			System.out.println("Parab�ns! Voc� derrotou o boss!");
            } 
            
            System.out.println("================================================="); 
            round++;
        }
        
    }
}