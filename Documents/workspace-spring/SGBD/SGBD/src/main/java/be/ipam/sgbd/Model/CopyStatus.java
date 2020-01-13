package be.ipam.sgbd.Model;
import javax.persistence.*;

@Entity
public class CopyStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long CopyStatusId;
	
	@Column(name="Value")
	private String Value;
	
	@ManyToOne
	@JoinColumn(name="CopyStatusId",nullable = false)
	private Copy copy;
	
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public long getCopyStatusId() {
		return CopyStatusId;
	}
	public void setCopyStatusId(long copyStatusId) {
		CopyStatusId = copyStatusId;
	}
	
}
