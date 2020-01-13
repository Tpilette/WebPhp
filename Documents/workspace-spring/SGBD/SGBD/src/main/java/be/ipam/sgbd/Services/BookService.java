package be.ipam.sgbd.Services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.ipam.sgbd.Model.Book;
import be.ipam.sgbd.Model.Copy;
import be.ipam.sgbd.Model.Edition;
import be.ipam.sgbd.Repository.BookDAO;
import be.ipam.sgbd.Repository.CopyDAO;


	
@Service
public class BookService {
	
	@Autowired
	private BookDAO bookDAO;
	@Autowired
	private CopyDAO cp;
	
	public Iterable<Book> getBooks(){
		
		return bookDAO.findAll();
		
	}
	
	public Book addBook(Book book){
		return (bookDAO.save(book));
	}
	
	public Optional<Book> getBookById(long id){
	
		return bookDAO.findById(id);
	}
	
	public void deleteBook(long id) {
		
		 bookDAO.deleteById(id);
	}
	
	
	//get all edition for a book => then for all edition get copies => filter by available and return result	
	public List<Copy> getAvailableCopy(Book book){
	
		List<Copy> result = new ArrayList<Copy>();
	
		List<Edition> ed = book.getEditions();
		
		return result;
	
	}
}