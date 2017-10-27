package model;

public class Rectangle extends GeometricObject {
	
	private double width, height;
	
	public Rectangle(double width, double height) {
		setWidth(width);
		setHeight(height);
	}
	
	@Override
	public double getArea() {
		return getWidth() * getHeight();
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
