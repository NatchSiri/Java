import java.util.ArrayList;
import java.util.List;

public class Test4 {
	
	public static void main(String args[]) {
		
		MaxInList<Integer> maxInList = new MaxInList<>();
		maxInList.push(3);
		maxInList.push(1);
		System.out.println("Max = " + maxInList.max());
		maxInList.push(5);
		System.out.println("Max = " + maxInList.max());
		
	}
	
}

final class MaxInList<E extends Comparable<E>> {
	
	List<E> list = new ArrayList<E>();
	
	public void push(E e) {
		list.add(e);
	}
	
	public E max() {
		if (list.size() <= 0) {
			return null;
		}
		E mx = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).compareTo(mx) > 0) {
				mx = list.get(i);
			}
		}
		return mx;
	}
	
}
