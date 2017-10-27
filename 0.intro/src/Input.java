import java.util.Scanner;

public class Input {
	
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String s = kb.nextLine();
		System.out.println("Hello " + s + "!");
		kb.close();
	}
	
}
