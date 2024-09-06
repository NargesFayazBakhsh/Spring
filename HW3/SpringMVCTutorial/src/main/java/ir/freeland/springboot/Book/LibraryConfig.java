package ir.freeland.springboot.Book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
	
	Book book1() {
		Book bookA = new Book() ;
		bookA.setId(11);
		bookA.setTitle("Ulysses");
		bookA.setPublisher("James Joyce");
		bookA.setAvailable(true);
		bookA.setPrice("100");
		return bookA;
	}
	
	Book book2() {
		Book bookB = new Book() ;
		bookB.setId(22);
		bookB.setTitle("Moby-Dick");
		bookB.setPublisher("Herman Melville");
		bookB.setAvailable(true);
		bookB.setPrice("700");
		return bookB;
	}
	
	@Bean
	Library library() {
		Library library = new Library() ;
		library.setName("Digikala");
		List<Book> books = new ArrayList<> (List.of( book1() , book2() ));
		library.setBooks(books);
		return library;
	}
	
}
