package Library.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AuthorId")
	private long AuthorId;
	private String Name;
	private String Lastname;
	private String Pseudo;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	public String getPseudo() {
		return Pseudo;
	}
	public void setPseudo(String pseudo) {
		Pseudo = pseudo;
	}
	

	
	
}
