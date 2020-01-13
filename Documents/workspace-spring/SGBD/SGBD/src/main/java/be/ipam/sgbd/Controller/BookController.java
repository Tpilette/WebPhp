package be.ipam.sgbd.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import be.ipam.sgbd.Services.BookService;
import be.ipam.sgbd.Model.*;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/books")
    public Iterable<Book> getBooks(){

       return bookService.getBooks();
    }

    public Book addBook(Book book){
        return (bookService.addBook(book));
    }
    
    public Optional<Book> getBook(long id){
                
        return bookService.getBookById(id);
    }
    
    public void deleteBook(long id) {
    	
     bookService.deleteBook(id);
    }
    
    public List<Copy> getAvailableCopy(Book book) {
    	
    	return bookService.getAvailableCopy(book);
	
	}

}