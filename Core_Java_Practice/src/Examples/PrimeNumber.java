package Examples;

public class PrimeNumber {

	public static void main(String args[]) {

		System.out.println(isPrime(5));
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2 || n==3) {
			return true;
		}

		for (int i = 2; i <= n/2; i++) {
			System.out.println("from outside of loop of the value of i  :  " + i + " and n is   : " + n);
			if (n % i == 0) {
				System.out.println("the value of i  :  " + i + " and n is   : " + n);
				return false;
			}

		}
		return true;

	}

	public static boolean IsPrime(int n) {
		if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
			return true;
		}

		return false;
	}

}
