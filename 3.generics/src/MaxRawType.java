
public class MaxRawType {
	
	public static void main(String args[]) {
		
		// Unsafe when use raw type
		max("Welcome", 23);
		
	}
	
	/** Return the maximum between two objects */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Comparable max(Comparable o1, Comparable o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
	
}
