import model.Student;
import model.UndergraduateStudent;
import model.GraduateStudent;

public class StudentTest4 {
	
	public static void main(String[] args) {
		// can not declare Object s because not printName method in Object class
		Student s;
		GraduateStudent g = new GraduateStudent("Nat");
		UndergraduateStudent u = new UndergraduateStudent("Toey");		
		s = g;
		s.printName();		
		s = (Student) u;
		s.printName();
	}
	
}
