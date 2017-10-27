package model;

public class GeometricObject2 implements Comparable<GeometricObject2> {
	
	public double getArea() {
		return 0;
	}
	
	@Override
	public int compareTo(GeometricObject2 other) {
		
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;
		
		if (this.getArea() > other.getArea()) {
			return AFTER;
		} else if (this.getArea() < other.getArea()) {
			return BEFORE;
		} else {
			return EQUAL;
		}
		
	}
	
}
