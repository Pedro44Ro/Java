package exer01;

public class principal2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = b;
		System.out.println("A � igual a " + a);
		System.out.println("B � igual a " + b);
		
		b=a;
		a=c;
		
		System.out.println("A � igual a " + a);
		System.out.println("B � igual a " + b);

	}

}
