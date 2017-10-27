package model;

public class SimpleDice {
	
	public final static int MAX = 6;
	private int faceValue;
	
	public SimpleDice(int faceValue) {
		this.faceValue = faceValue; 
	}
	
	public SimpleDice() { 
		setFaceValue(this.roll());
	}
	
	public int roll() {
		faceValue = (int) (Math.random() % MAX) + 1;
		return faceValue;
	}
	
	@Override
	public String toString() {
		return "SimpleDice [faceValue=" + faceValue + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof SimpleDice) {
			SimpleDice otherDice = (SimpleDice) o;
			return this.getFaceValue() == otherDice.getFaceValue();
		}
		return false;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
}
