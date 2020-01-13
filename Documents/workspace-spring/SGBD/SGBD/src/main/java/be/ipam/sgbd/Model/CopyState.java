package be.ipam.sgbd.Model;
import javax.persistence.*;

@Entity
public class CopyState {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long CopyStateId;
	
	private String Value;

	@ManyToOne
	@JoinColumn(name="CopyStateId",nullable = false)
	private Copy copy;
	
	
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
}