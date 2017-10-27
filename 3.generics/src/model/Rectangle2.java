package model;

public class Rectangle2 extends GeometricObject2 {
	
	private double width, height;
	
	public Rectangle2(double width, double height) {
		setWidth(width);
		setHeight(height);
	}
	
	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	@Override
	public String toString() {
		return "Rectangle2 area = " + this.getArea();
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
