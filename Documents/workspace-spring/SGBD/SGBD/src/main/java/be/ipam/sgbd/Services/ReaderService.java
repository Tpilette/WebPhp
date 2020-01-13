package be.ipam.sgbd.Services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import be.ipam.sgbd.Model.*;
import be.ipam.sgbd.Repository.BorrowingDAO;
import be.ipam.sgbd.Repository.CopyDAO;
import be.ipam.sgbd.Repository.ReaderDAO;

@Service
public class ReaderService {
	
	@Autowired
	BorrowingDAO borrowingDAO;
	
	@Autowired
	CopyDAO copyDAO;
	
	@Autowired
	ReaderDAO readerDAO;
	
	@Autowired
	BookService bs;
	
	
public Iterable<Reader> getReaders(){
		
		return readerDAO.findAll();
		
	}
	
	
	public Borrowing BorrowBook(Date startDate,Book book,Reader reader) {
		
		
		Borrowing b = new Borrowing();
		b.setStartDate(startDate);
	    b.setReader(reader);
	    b.setCopies(bs.getAvailableCopy(book).iterator().next());
	    
	    borrowingDAO.save(b);
 
		return b;
	}

}
