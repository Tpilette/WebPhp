package Library.Model;

import javax.persistence.*;

@Entity
@Table(name="Library")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="LibraryId")
	private long LibraryId;
	private String Address;
	private String Phone;
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
}
