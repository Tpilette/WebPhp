package Library.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Edition")
public class Edition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ISBN")
	private String ISBN;
	private double Price;
	private Date ParutionDate;
	private String PublishingHouse;
	private long BookId;
	
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

}
