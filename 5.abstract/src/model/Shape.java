package model;

public abstract class Shape {
	
	String name;

	abstract double perimeter();

	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.getName() + "\n\tPerimeter = " + perimeter();
	}
	
}
