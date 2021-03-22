package java002;
import java.util.Scanner;
public class simpleinterest {
	public static void main(String args[]) 
	{
	double   total=0;
	double   principle;
	double   interest;
	double   rate;
	double   months;
	double calc;
	Scanner prin=new Scanner(System.in);
		System.out.println("enter the principle amount :");
		principle=prin.nextDouble();
		Scanner ra=new Scanner(System.in);

		System.out.println("enter rate of interest :");
		rate=ra.nextDouble();
		Scanner mon=new Scanner(System.in);
		System.out.println("enter how many months for interest:");
		months=mon.nextDouble();
	while(principle>0)
		{
			interest=principle*rate*months/100;
			
			
			total=principle+interest;
			System.out.println("the interest for "+months+" months is:" +interest);
			System.out.println("the total for "+months+" months is:" +total);
			
			break;
		}
		
				
	}

}
