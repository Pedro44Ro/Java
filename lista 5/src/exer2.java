
public class exer2 {

	public static void main(String[] args) {
		
		int somatoria = 0;
		
		System.out.println("Exibir dos de 1 a 100");
		
		for(int i = 0; i <= 100; i++) {
			
			if(i % 2 == 0) {
			somatoria += i;
			System.out.println(i);
			}
		}
		
		System.out.println("O somatorio é: " + somatoria);
	}

}
