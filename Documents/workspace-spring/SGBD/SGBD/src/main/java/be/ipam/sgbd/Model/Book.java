package be.ipam.sgbd.Model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="Book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BookId")
	private long BookId;

	@Column(name="Title")
	private String Title;

	@Column(name="Description")
	private String Description;
	
	@OneToMany(mappedBy="book",fetch=FetchType.EAGER)
	private List<Edition> editions;
	
	
	public Book() {};
	public Book(String title,String description){
		this.Title = title;
		this.Description = description;
	}
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public long getBookId() {
		return BookId;
	}	
	public void setBookId(long bookId) {
		BookId = bookId;
	}
	
	public List<Edition> getEditions() {
		return editions;
	}
	public void setEditions(List<Edition> editions) {
		this.editions = editions;
	}


}