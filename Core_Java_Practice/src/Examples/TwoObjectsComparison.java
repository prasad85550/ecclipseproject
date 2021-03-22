package Examples;

public class TwoObjectsComparison {

	public static void main(String[] args) {


		Double obj1=new Double("12354678952");
		Double obj2=new Double("12354678952");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
			
		if(obj1.equals(obj2)) {
		System.out.println("equal");
		}
	
		else {
			System.out.println("not equal");
		}
	
	
	
	
	
	
	
	
	
	
	}

}
