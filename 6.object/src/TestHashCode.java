import model.Book;

public class TestHashCode {

	public static void main(String[] args) {
		Book book1 = new Book("Algorithm", "47833219", 150.0);
		Book book2 = new Book("Data Structure", "74902751", 150.0);
		Book book3 = new Book("algorithm", "47833219", 300.0);
		
		System.out.println("book1 hashCode : " + book1.hashCode());
		System.out.println("book2 hashCode : " + book2.hashCode());
		if (book1.equals(book3) && book1.hashCode() == book3.hashCode()) {
			System.out.println("book1 == book3 : True");
		}
	}

}
