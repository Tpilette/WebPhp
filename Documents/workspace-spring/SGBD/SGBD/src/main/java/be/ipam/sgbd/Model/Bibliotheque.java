package be.ipam.sgbd.Model;


import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="Bibliotheque")
public class Bibliotheque {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BibliothequeId")
	private long LibraryId;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="Phone")
	private String Phone;
	
	@Column(name="Email")
	private String Email;
	
	@OneToMany(mappedBy="Bibliotheque",fetch=FetchType.EAGER)
	public List<Copy> copies;
	
	
	public long getLibraryId() {
		return LibraryId;
	}
	public void setLibraryId(long libraryId) {
		LibraryId = libraryId;
	}
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String eMail) {
		Email = eMail;
	}
	
}
