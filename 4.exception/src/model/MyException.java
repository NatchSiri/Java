package model;

@SuppressWarnings("serial")
public class MyException extends Exception {
	
	public MyException(String s) {
		System.out.println("MyException = " + s);
	}
	
}
