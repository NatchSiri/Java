package model;

public class Book {
	private String name;
	private String isbn;
	private double price;
	
	public Book(String name, String isbn, double price) {
		setName(name);
		setIsbn(isbn);
		setPrice(price);
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Book) {
			Book temp = (Book) other;
			if (isbn == temp.isbn) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 1123581321;
		for (Character c : isbn.toCharArray()) {
			hash = hash ^ (c.hashCode() << 17);
			hash = hash ^ (hash << 19);
			hash = hash ^ (c.hashCode() >> 7);
			hash = hash ^ (hash >> 13);
		}
		return hash;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
