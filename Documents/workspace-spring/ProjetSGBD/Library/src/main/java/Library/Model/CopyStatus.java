package Library.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CopyStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CopyStatus")
	private long CopyStatusId;
	
	private String Value;

	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
}
