import model.Book;

public class TestEquals {
	
	public static void main(String args[]) {
		Book book1 = new Book("Algorithm", "001", 150.0);
		Book book2 = new Book("Data Structure", "002", 150.0);
		Book book3 = new Book("Algorithm", "001", 300.0);
		
		System.out.println("book1 == book2 : " + book1.equals(book2));
		System.out.println("book1 == book3 : " + book1.equals(book3));
		System.out.println("book1 == null : " + book1.equals(null));
	}
	
}
