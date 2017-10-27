import model.GeometricObject;
import model.Rectangle;
import model.Circle;

public class BoundedTypeDemo {
	
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(2, 2);
		Circle circle = new Circle(2);
		
		System.out.println("Same Area? " + equalArea(rectangle, circle));
		
		GeometricObject rectangle2 = new Rectangle(4, Math.PI);
		GeometricObject circle2 = new Circle(2);
		
		System.out.println("Same Area? " + equalArea(rectangle2, circle2));
		
		GeometricObject go1 = new GeometricObject();
		GeometricObject go2 = new GeometricObject();
		
		System.out.println("Same Area? " + equalArea(go1, go2));
	}
	
	public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
		return object1.getArea() == object2.getArea();
	}
	
}
