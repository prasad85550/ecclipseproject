package Examples;

public class StringContainsVowels {

	public static void main(String args[]) {

		String str = "pqpa";
		System.out.println(StringContainsVowels(str));
	}

	public static boolean StringContainsVowels(String string) {

		return string.toLowerCase().matches(".*[aeiou].*");
	//return string.matches(".*[a-zA-Z]{9}.*");
	}
}
