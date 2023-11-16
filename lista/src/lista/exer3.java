package lista;

public class exer3 {
	
	public static void main(String[] args) { 
		
		int A = 5;
		int B = 10;
		int troca;
		System.out.println("O valor da variável A é: \n" + A);
		System.out.println("O valor da variável B é: \n" + B);
		troca = A;
		A = B;
		B = troca;
		System.out.println( "Após a troca o valor da variável A é: \n" + A);
		System.out.println( "Após a troca o valor da variável B é: \n" + B);
		}

}
