import model.Student;
import model.UndergraduateStudent;
import model.GraduateStudent;

public class StudentArray {
	
	final static int SIZE = 3;
	
	public static void main(String args[]) {
		
		Student[] students = new Student[SIZE];
		students[0] = new UndergraduateStudent("Toey");
		students[1] = new GraduateStudent("Nat");
		students[2] = new Student("Jump");
		
		// This is called Dynamic binding, as the compiler will never know 
		// which version of printName() is going to called at runtime.
		for (int i = 0; i < SIZE; i++) {
			checkStatus(students[i]);
			System.out.println(students[i]);
		}
		
	}
	
	public static void checkStatus(Student s) {
		if (s instanceof UndergraduateStudent) {
			System.out.println("You are undergraduate student.");
		} else if (s instanceof GraduateStudent) {
			System.out.println("You are graduate student.");
		}
	}
	
}
