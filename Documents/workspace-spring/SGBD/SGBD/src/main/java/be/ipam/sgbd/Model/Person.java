package be.ipam.sgbd.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {

	
	private String Name;
	private String Lastname;
	private String Phone;
	private String Address;
	private String Email;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String eMail) {
		Name = eMail;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
