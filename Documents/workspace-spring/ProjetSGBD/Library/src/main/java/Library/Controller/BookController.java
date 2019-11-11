package Library.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Library.Model.*;
import Library.Repository.*;
import Library.Services.*;

@Controller
public class BookController {

@Autowired
private BookDAO bookDao;

@Autowired 
private BookService bookService;



}
