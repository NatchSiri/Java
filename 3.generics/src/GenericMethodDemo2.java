import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodDemo2 {
	
	public static void main(String[] args ) {
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<String> strings = new ArrayList<>(Arrays.asList("London", "Paris", "New York", "Austin"));

		/*GenericMethodDemo.<Integer>print(integers);
		GenericMethodDemo.<String>print(strings);*/
		
		print(integers);
		print(strings);
		
	}
	
	/* <E> usually come after static
	 */
	public static <E> void print(List<E> list) {
		
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
	}
	
}
