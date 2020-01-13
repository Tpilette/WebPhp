package be.ipam.sgbd.Model;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Edition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ISBN")
	private String ISBN;

	@Column(name="Price")
	private double Price;

	@Column(name="ParutionDate")
	private Date ParutionDate;

	
	@Column(name="PublishingHouse")
	private String PublishingHouse;

	@ManyToOne
	@JoinColumn(name="BookId",nullable = false)
	private Book book;
	
	@OneToMany(mappedBy="Edition",fetch=FetchType.EAGER)
	List<Copy> copies;

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public Date getParutionDate() {
		return ParutionDate;
	}

	public void setParutionDate(Date parutionDate) {
		ParutionDate = parutionDate;
	}

	public String getPublishingHouse() {
		return PublishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		PublishingHouse = publishingHouse;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book bookId) {
		book = bookId;
	}

	public List<Copy> getCopies() {
		return copies;
	}

	public void setCopies(List<Copy> copies) {
		this.copies = copies;
	}



}
