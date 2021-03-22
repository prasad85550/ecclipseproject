package methodsindifclasses;
import java.util.Scanner;
public class prasad 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		orange orangeobject=new orange();
		System.out.println("please enter your favourite movie");
		String xmovie=sc.nextLine();
		orangeobject.setMovie(xmovie);
		orangeobject.fresult();
		
		
		
	}

}
