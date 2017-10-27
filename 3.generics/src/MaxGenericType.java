
public class MaxGenericType {
	
	public static void main(String args[]) {
		
		// error when compile
		//max("Welcome", 23);
		
	}
	/** Return the maximum between two objects */
	public static <E extends Comparable<E>> E max(E o1, E o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
	
}
