package StarPatterns;

public class pattern1 {

	public static void main(String[] args) {

	/*	//pattern 1
		for (int i = 0; i < 6; i++) {                  // *
                                                       // **
			for (int j = 0; j <= i; j++) {             // ***

				System.out.print("* ");
			}
			System.out.println();
		}  */
	
  
		//pattern 2
	/*       int i, j, row = 6;       
		for (i=0; i<row; i++)   {                   //       *
		                                            //      ** 
			for (j=2*(row-i); j>=0; j--){           //     ***
				                                    //    ****
	         	System.out.print(" ");   
		}   
	    for (j=0; j<=i; j++ ){
	    	
		System.out.print("* ");   
		
	    }   
		System.out.println();   
		}   */
		


	//pattern3(piramid)
/*	int i, j, row = 6;       
	for (i=0; i<row; i++)   {                   //       *
	                                            //      *** 
		for (j=(row-i); j>=0; j--){             //     *****
			                                    //    *******
         	System.out.print(" ");      //just remove 2 from above
	}   
    for (j=0; j<=i; j++ ){
    	
	System.out.print("* ");   
	
    }   
	System.out.println();   
	}   */
	
	
	
	  


/*		//Diamond pattern
	int row=5, i, j, space = 1;            //      *
                                           //     ***
	space = row - 1;                       //    *****
	for (j = 1; j<= row; j++)  {           //     ***
 	  for (i = 1; i<= space; i++) {        //      *
	    System.out.print(" ");  
	    }  
	   space--;  
	    for (i = 1; i <= 2 * j - 1; i++) {  
	       System.out.print("D");  
	       }  
	System.out.println("");  
	}  
	space = 1;  
	for (j = 1; j<= row - 1; j++) {  
	    for (i = 1; i<= space; i++) {  
	     System.out.print(" ");  
	    }  
	     space++;  
	       for (i = 1; i<= 2 * (row - j) - 1; i++)  {  
	        System.out.print("D");  
	         }  
	  System.out.println("");  
	}  */
		
		
		
	/*	//Downward triangle
		int rows=7;      
		for (int i= rows-1; i>=0 ; i--){             // *****                       
	     	for (int j=0; j<=i; j++) {               // ****
		        System.out.print("*" + " ");         // ***
		        }                                    // **
		System.out.println();                        // *
		}  */

		
		//Reverse piramid
		int rows=8;                                    // *******
		for (int i= 0; i<= rows-1; i++) {              //  *****
		    for (int j=0; j<=i; j++){                  //   ***
		       System.out.print(" ");                  //    *
		      }                                        
	        	for (int k=0; k<=rows-1-i; k++){  
		           System.out.print("*" + " ");  
		            }  
		System.out.println();  
		}  
	
		
		
//sandglass pattern		
//combine reverse piramid and piramid and change the 2nd for loop as for (j=(row-i)-1; j>=0; j--)
	
	}
}
