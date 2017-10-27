import model.GraduateStudent;
import model.Student;
import model.UndergraduateStudent;

public class StudentTest2_2 {
	
	// Subtype polymorphism
	public static void main(String[] args) {
		Student s1 = new UndergraduateStudent("Toey");
		Student s2 = new GraduateStudent("Nat");
		Object s3 = new UndergraduateStudent("Natch");
		checkStatus(s1);
		checkStatus(s2);
		checkStatus(s3);
	}

	public static void checkStatus(Object s) {
		if (s instanceof Student) {
			System.out.println("You are Student");
			if (s instanceof UndergraduateStudent) {
				System.out.println("You are undergraduate student.");
			} else if (s instanceof GraduateStudent) {
				System.out.println("You are graduate student.");
			}
		} else {
			System.out.println("You are not student");
		}
	}
	
}
