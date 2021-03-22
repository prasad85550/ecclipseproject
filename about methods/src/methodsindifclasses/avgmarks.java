package methodsindifclasses;

import java.util.Scanner;

public class avgmarks
{

	public static void main(String args[])
	{
		
	int	bigtotal=600;
		double  total,percentage,telugu,hindi,english,maths,science,social,min,max;
		System.out.println("enter the maximum  marks :");
		Scanner maxi=new Scanner(System.in);
		max=maxi.nextDouble();
		System.out.println("enter the min marks:");
		Scanner mini=new Scanner(System.in);
		min=mini.nextDouble();
		
		System.out.println("enter the marks in telugu :");
		Scanner tel=new Scanner(System.in);
		telugu=tel.nextDouble();
		System.out.println("enter the marks in hindi :");
		Scanner hin=new Scanner(System.in);
		hindi=hin.nextDouble();
		System.out.println("enter the marks in english :");
		Scanner eng=new Scanner(System.in);
		english=eng.nextDouble();
		System.out.println("enter the marks in maths :");
		Scanner mat=new Scanner(System.in);
		maths=mat.nextDouble();
		System.out.println("enter the marks in science :");
		Scanner sci=new Scanner(System.in);
		science=sci.nextDouble();
		System.out.println("enter the marks in social :");
		Scanner soc=new Scanner(System.in);
		social=soc.nextDouble();
		if(social<min || telugu<min || hindi<min || english<min || maths<min || science<min)
		{
			
			System.out.println("you have sucessfully failed in exams all the best :");
		
		}
		else 
		{
			
			total=telugu+hindi+english+maths+science+social;
			System.out.println("the total marks is :" +total);
			percentage=total*100/bigtotal;
			System.out.println("the percentage of marks is :" +percentage);
			
		}
		
		
	}


}
