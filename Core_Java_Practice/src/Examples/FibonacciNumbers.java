package Examples;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int n = 10;
		// System.out.println(fibonacci(n));

		printFibonacciSeries(10);
		
	}


	public static void printFibonacciSeries(int n) {

		int a = 0;
		int b = 0;
		int c = 1;
		for (int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a  + ",");
		}
	}

}
 