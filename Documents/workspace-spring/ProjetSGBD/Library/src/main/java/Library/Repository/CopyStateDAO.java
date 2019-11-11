package Library.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Library.Model.*;

@Repository
public interface CopyStateDAO extends CrudRepository<CopyState,Long> {

}