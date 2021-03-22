package Examples;

public class ReverseOfString {

	public static void main(String args[]) {

		String str = "vinay";
		System.out.println(reverseMethod(str));

	}

	public static String reverseMethod(String string) {
		StringBuilder reversestring = new StringBuilder();

		char[] characters = string.toCharArray();
		System.out.println( characters.length );
		for (int i = characters.length -1; i >= 0; i--)
			reversestring.append(characters[i]);
		return reversestring.toString();
	}

}
