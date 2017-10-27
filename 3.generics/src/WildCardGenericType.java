import model.GenericStack;
public class WildCardGenericType {
	
	public static void main(String[] args ) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1); // 1 is autoboxed into new Integer(1)
		intStack.push(2);
		intStack.push(-2);

		// Error: 
		//System.out.print("The max number is " + max(intStack));
		
		System.out.println(intStack.getSize());
		System.out.println("The max integer is " + maxInt(intStack));
		System.out.println(intStack.getSize());
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);
		System.out.print("The max number is " + maxNum(intStack));
		
  }

	/** Find the maximum in a stack of numbers */
	public static double max(GenericStack<Number> stack) {
		double max = stack.pop().doubleValue(); // initialize max

		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (value > max)
				max = value;
		}

		return max;
	}
	
	// A wildcard generic type has three forms: ?, ? extends T, and ? super T
	public static double maxNum(GenericStack<? extends Number> stack) {
		double max = stack.pop().doubleValue(); // initialize max

		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if (value > max)
				max = value;
		}

		return max;
	}
	
	public static int maxInt(GenericStack<Integer> stack) {
		int max = stack.pop().intValue(); // initialize max

		while (!stack.isEmpty()) {
			int value = stack.pop().intValue();
			if (value > max)
				max = value;
		}

		return max;
	}
	
}
