package be.ipam.sgbd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import be.ipam.sgbd.Controller.BookController;
import be.ipam.sgbd.Model.Book;

@SpringBootTest
public class sgbdBookControllerTests {

	@Autowired
	BookController controller;

	@Test
	public void testGetBooks() {
		assertNotNull(controller.getBooks());
	}

	@Test
	public void addBook() {

		Book b = new Book("Lord of the rings", "Heroic fantasy book");
		controller.addBook(b);

		Iterable<Book> d = controller.getBooks();

		Book toto = new Book();
		for (Book book : d) {

			if (book.getTitle().equals("Lord of the rings")) {
				toto.setTitle(book.getTitle());
				toto.setDescription(book.getDescription());
			}
		}

		assertEquals("Lord of the rings", toto.getTitle());
		assertEquals("Heroic fantasy book", toto.getDescription());

	}

	@Test
	public void deleteBook() {

		Iterable<Book> d = controller.getBooks();

		Book toto = new Book();
		for (Book book : d) {

			if (book.getTitle().equals("Lord of the rings")) {
				toto = book;
			}
		}

		controller.deleteBook(toto.getBookId());
	}
}
