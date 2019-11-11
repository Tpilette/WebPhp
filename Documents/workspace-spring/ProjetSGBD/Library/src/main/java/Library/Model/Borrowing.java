package Library.Model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Borrowing")
public class Borrowing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BorrowingId")
	private long BorrowingId;
	private Date StartDate;
	private Date EndDate;
	private long ReaderId;
	private long CopyId;
	
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	public long getReaderId() {
		return ReaderId;
	}
	public void setReaderId(long readerId) {
		ReaderId = readerId;
	}
	
	public long getCopyId() {
		return CopyId;
	}
	public void setCopyId(long copyId) {
		CopyId = copyId;
	}
	

}
