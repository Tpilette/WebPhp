package be.ipam.sgbd.Repository;

import org.springframework.data.repository.CrudRepository;
import be.ipam.sgbd.Model.Reader;

public interface ReaderDAO extends CrudRepository<Reader,Long> {

}
