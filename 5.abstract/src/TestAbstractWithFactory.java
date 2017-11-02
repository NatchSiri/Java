import model.Shape;
import model.Circle;
import model.ShapeFactory;

public class TestAbstractWithFactory {  
	
	public static void main(String[] args) {
	
		Shape cir = ShapeFactory.getShape("Circle", 2.5d, "Circle");
		Shape sqr = ShapeFactory.getShape("Square", 4.5d, "Square");
		Shape cube = ShapeFactory.getShape("Cube", 5.5d, "Cube");
		
		System.out.println(cir);	
		System.out.println(sqr);
		System.out.println(cube);

		Circle cir2 = (Circle) ShapeFactory.getShape("Circle", 2.5d, "Circle2");
		System.out.println(cir2.toString());
		System.out.println("Diameter = " + cir2.diameter());
		
	}
	
}
