package NumberPatterns;

public class pyramid {

	public static void main(String[] args) {
		int j,k,n = 8;    //n is the number of rows you want to print  
		for (int i = 0; i < n; i++)   
		{  
		int number = 1;  
	
		for(j=0;j<=(n-i);j++) {
			
			System.out.print("");
		}
		
		//	System.out.printf("%" + (n - i) * 2 + "s", "");  
		for ( j = 0; j <= i; j++)   
		{  
		System.out.printf("%4d", number);  
		number = number * (i - j) / (j + 1);  
		}  
		System.out.println();  
		}  

	}

}
