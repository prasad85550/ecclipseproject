package Examples;

public class cloning implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	String str = "New Object Created";

	public static void main(String[] args) {
		cloning obj1 = new cloning();
		try {
			cloning obj2 = (cloning) obj1.clone();
			System.out.println(obj2.str);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}