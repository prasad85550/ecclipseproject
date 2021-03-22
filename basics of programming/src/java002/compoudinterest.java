package java002;
import java.math.power;
import java.util.Scanner;
import java.lang.Double;
 public class compoudinterest
 

{
	public static void main(String args[])
	{
		Double amount;                                         //A=P(1+R)
		int rate;
		Double principle;
		int months;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many no of months you give money for interest:");
		months=sc.nextInt();
		Scanner prin=new Scanner(System.in);
		System.out.println("enter the principle amount:");
		principle=prin.nextDouble();
		Scanner rat=new Scanner(System.in);
		System.out.println("enter the rate of interest:");
		rate=rat.nextInt();
		for(int i=1;i<=12;i++)
		{
		amount=(Math.pow(1+rate,months))*principle;
		System.out.println("the total amount with interest is :" +amount);
			
			break;
		}
		
		
		
		
		
		
		
		
	}
}
