import java.util.ArrayList;
import java.util.List;

import model.Book;

public class TestGetClass {

	public static void main(String[] args) {
		
		Book book = new Book("Algorithm", "47833219", 150.0);
		Integer n = 1934;
		List<Book> books = new ArrayList<>();
		
		System.out.println(book.getClass());
		System.out.println(n.getClass());
		System.out.println(books.getClass());

	}

}
