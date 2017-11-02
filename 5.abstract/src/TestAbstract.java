import model.Shape;
import model.Circle;
import model.Square;

public class TestAbstract {
	public static void main(String[] args) {
	
		Shape shape = new Circle(2.5d, "Circle A");
		System.out.println(shape);
		shape = new Square(4.5d, "Square D");
		System.out.println(shape);
		
	}
}