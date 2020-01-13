package be.ipam.sgbd.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import be.ipam.sgbd.Model.Book;
import be.ipam.sgbd.Model.Copy;

import java.util.*;

@Repository
public interface BookDAO extends CrudRepository<Book,Long> {

	
}
