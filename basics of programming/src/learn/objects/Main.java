package learn.objects;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your fav movie");
		name=sc.nextLine();
		AcssingObject ab=new AcssingObject();
		ab.setFmovie(name);
		System.out.println(ab.getFmovie());
		System.out.println(ab.toString());
		sc.close();
	}

}
