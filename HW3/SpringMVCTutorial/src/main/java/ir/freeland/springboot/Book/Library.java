package ir.freeland.springboot.Book;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Library {
	@JsonProperty("shopname")
    private String name;
    private List<Book> books;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public String findBook(long id) {
		for(Book book1: books)
			if(book1.getId()== id) {
				return book1.toString();
			}
		return"this book id not found";
	}
	
	public String findBookInfo(String title, String publisher) {
		for(Book book1: books) 
			if ((title.equals(book1.getTitle()) ) && (publisher.equals(book1.getPublisher()))) {
				return book1.toString();
			}
			
		return"book with this title & publiher not found";
	}
	
	public void putBook(Book book ) {
		long id = book.getId();
		for(Book book2: books)
			if(book2.getId()== id) {
				books.remove(book2);
			}
		books.add(book);
	}
	
	public void deletBook(long id) {
		for(Book book1: books)
			if(book1.getId()== id)
				books.remove(book1);
		
	}
	
	
	@Override
	public String toString() {
		return "Library [name=" + name + ", books=" + books + "]";
	}


}
