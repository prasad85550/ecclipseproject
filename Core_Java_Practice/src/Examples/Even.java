package Examples;

import java.util.ArrayList;
import java.util.List;

public class Even {

	public static void main(String[] args) {

	List<Integer> listobj=new ArrayList();
	listobj.add(8);
	listobj.add(2);
	listobj.add(4);
	listobj.add(15);
	System.out.println(onlyOddNumbers(listobj));
	
	}

	
	public static boolean onlyOddNumbers(List<Integer> list) {
		return list.parallelStream().anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
		                                                        // parallel stream for faster processing
                                                                //it returns true if list contains atleast one odd number
	
	}                                  
}
