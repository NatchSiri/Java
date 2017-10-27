
public class GenericMethodDemo {
	
	public static void main(String[] args ) {
		
		Integer[] integers = {1, 2, 3, 4, 5};
		String[] strings = {"London", "Paris", "New York", "Austin"};

		GenericMethodDemo.<Integer>print(integers);
		GenericMethodDemo.<String>print(strings);
		
		print(integers);
		print(strings);
		
	}
	
	/*When you want to make just a single (often static) method 
	 * generic in a class, precede its return type by type parameter(s).
	 */
	public static <E> void print(E[] list) {
		
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
		
	}
	
}
