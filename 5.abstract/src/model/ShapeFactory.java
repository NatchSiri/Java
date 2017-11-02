package model;

public class ShapeFactory {
	
	public static Shape getShape(String shapeType, double size, String name) {
		Shape shape = new NonShape();
		
		switch (shapeType) {
			case "Circle":
				shape = new Circle(size, name);
				break;
			case "Square":
				shape = new Square(size, name);
				break;
		}
		
		return shape;
	}
	
}
