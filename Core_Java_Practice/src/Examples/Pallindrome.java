package Examples;

public class Pallindrome {

	public static void main(String[] args) {
	String str1 = "1001";

		String str2 = isPallindrome(str1);
		System.out.println("the reverse of the string " + str1 + " is " + str2);

		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("pollindrome");
		}

		else {
			System.out.println("not pollindrome");
		}

    // isPallindrome("1245");
	
	}

	public static String isPallindrome(String string) {

		char[] character = string.toCharArray();
		StringBuilder String1 = new StringBuilder();
		System.out.println("thr length of given array is :" + character.length);

		for (int i = character.length - 1; i >= 0; i--) {
			String1.append(character[i]);
		}
		return String1.toString();
	}

	
	
	public static void isEven(int number) {

	if(number % 2 == 0) {
		System.out.println("the given number "+number+ " is Even number :");
	}	
	else {
		System.out.println("the given number "+number+ " is not Even number :");
	}	
		
	}

	public static int isPallindrome(int number) {
	
		
		int temp,r,sum=0;
		temp=number;
		while(number>0){
		r=number%10;
		sum=(sum*10)+r;
		number=number/10;
		}
	if(temp==sum) {
		return 1;
	}
	
	return 0;
	}
	
	
}
