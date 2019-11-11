package Library.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Library.Repository.*;

@Service
public class BookService {

@Autowired
private BookDAO bookDAO;

public Set<Book> getBooks(){
	
}

}
