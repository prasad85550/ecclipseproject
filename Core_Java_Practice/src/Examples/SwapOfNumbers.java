package Examples;

public class SwapOfNumbers {

	public static void main(String args[]) {
		
		int a=10;
		int b=33;
		
	SwapOfNumbers(a,b);
	}

	private static void SwapOfNumbers(int a, int b) {
	
		b=a+b;
		a=b-a;
		b=b-a;
	System.out.println("the value of a  :"+a);	
	System.out.println("the value of b  :"+b);
	}



}
