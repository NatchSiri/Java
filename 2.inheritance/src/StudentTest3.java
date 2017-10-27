import model.Student;
import model.UndergraduateStudent;
import model.GraduateStudent;

public class StudentTest3 {
	
	public static void main(String[] args) {
		// upcasting (automatically)
		Student s1 = new GraduateStudent("Nat");
		s1.printName();

		// downcasting (manually) - may have problem
		Student s = new Student("Luck");
		UndergraduateStudent s2 = (UndergraduateStudent) s;
		
		s2.printName();
		System.out.println(s2.toString());
		
	}
	
}
