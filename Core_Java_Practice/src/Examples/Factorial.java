package Examples;

public class Factorial {

	public static void main(String[] args) {

		Factorial(5);

	}

	public static void Factorial(int number) {

		int b=1; 

		for(int i=1;i<=number;i++) {
	     
			b=i*b;
		
		}
		System.out.println(b);
		
		
	}
}
