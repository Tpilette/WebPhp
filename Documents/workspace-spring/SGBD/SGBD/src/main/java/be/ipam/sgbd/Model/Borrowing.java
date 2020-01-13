package be.ipam.sgbd.Model;

import java.util.Date;


import javax.persistence.*;

@Entity
public class Borrowing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Borrowingid")
	private long BorrowingId;

	@Column(name = "Startdate")
	private Date StartDate;

	@ManyToOne
	@JoinTable(name = "Reader", joinColumns = { @JoinColumn(name = "Readerid") })
	private Reader Reader;

	@OneToOne()
	private Copy Copy;


	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public long getBorrowingId() {
		return BorrowingId;
	}

	public void setBorrowingId(long borrowingId) {
		BorrowingId = borrowingId;
	}

	public Reader getReader() {
		return Reader;
	}

	public void setReader(Reader reader) {
		Reader = reader;
	}

	public Copy getCopies() {
		return Copy;
	}

	public void setCopies(Copy copy) {
		Copy = copy;
	}

}
