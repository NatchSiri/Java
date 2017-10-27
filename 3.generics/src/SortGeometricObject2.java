import model.GeometricObject2;
import model.Circle2;
import model.Rectangle2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortGeometricObject2 {
	
	public static void main(String args[]) {
		
		List<GeometricObject2> go2 = new ArrayList<>();
		go2.add(new Circle2(2));
		go2.add(new Circle2(1));
		go2.add(new Rectangle2(2, 2));
		go2.add(new Rectangle2(1, 1));
		
		System.out.println("Before sort:");
		for (GeometricObject2 e : go2) {
			System.out.println(e);
		}
		
		Collections.sort(go2);
		
		System.out.println("After sort:");
		for (GeometricObject2 e : go2) {
			System.out.println(e);
		}
		
	}
	
}
