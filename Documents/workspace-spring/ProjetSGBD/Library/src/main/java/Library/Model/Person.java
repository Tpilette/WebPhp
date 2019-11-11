package Library.Model;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
	
	private String Name;
	private String Lastname;
	private String Address;
	private String Phone;
	

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
