import model.Student;
import model.UndergraduateStudent;
import model.GraduateStudent;

public class StudentTest2_1 {
	
	// Subtype polymorphism
	public static void main(String[] args) {
		Student s1 = new UndergraduateStudent("Toey");
		Student s2 = new GraduateStudent("Nat");
		checkStatus(s1);
		checkStatus(s2);
	}

	public static void checkStatus(Student s) {
		if (s instanceof UndergraduateStudent) {
			System.out.println("You are undergraduate student.");
		} else if (s instanceof GraduateStudent) {
			System.out.println("You are graduate student.");
		}
	}
	
}
