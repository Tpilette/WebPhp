package be.ipam.sgbd.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import be.ipam.sgbd.Model.*;
import be.ipam.sgbd.Services.ReaderService;

@Controller
public class ReaderController {

	@Autowired
	ReaderService rs; 
	
	public Iterable<Reader> getReaders(){

	       return rs.getReaders();  
	  }
	
	public Borrowing BorrowBook (Date startDate,Book book,Reader reader) {
		
		
		return rs.BorrowBook(startDate, book, reader);
	}
	
	
	
}
