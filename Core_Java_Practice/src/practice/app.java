package practice;

public class app {

	public static void main(String[] args) {
	
		int i,j,row=7;
		 int num=1;
			
		for(i=1;i<=row;i++) {
			
	  for(j=1;j<=row-i;j++) {
		
			System.out.print(" ");
		
	}
	
	  for(j=1;j<=i;j++) {
		 	
		  System.out.print(num+" ");
	     num++;
	  }
	  
	  System.out.println();
		}
	
	}

}
