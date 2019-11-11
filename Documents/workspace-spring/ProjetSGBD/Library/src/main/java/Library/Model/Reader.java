package Library.Model;

import javax.persistence.*;

@Entity
@Table(name="Reader")
public class Reader extends Person{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ReaderId")
	private long ReaderId;
	
	public long getReaderId() {
		return ReaderId;
	}
	public void setReaderId(long readerId) {
		ReaderId = readerId;
	}

}
