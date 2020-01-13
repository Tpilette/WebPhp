package be.ipam.sgbd.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Reader extends Person {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Readerid")
	private long ReaderId;

	@OneToMany(mappedBy="BorrowingId")
	public List<Borrowing> borrowing = new ArrayList<Borrowing>();
	
	public long getReaderId() {
		return ReaderId;
	}

	public void setReaderId(long readerId) {
		ReaderId = readerId;
	}
	

	
}