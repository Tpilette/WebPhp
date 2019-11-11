package Library.Model;

import javax.persistence.*;

@Entity
@Table(name="Librarian")
public class Librarian extends Person{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "LibrarianID")
	private long LibrarianId;
	private long RoleId;
	private long ManagedBy;
	private long LibraryId;
	
	public long getRoleId() {
		return RoleId;
	}
	public void setRoleId(long roleId) {
		RoleId = roleId;
	}
	
	public long getManagedBy() {
		return ManagedBy;
	}
	public void setManagedBy(long managedBy) {
		ManagedBy = managedBy;
	}
	
	public long getLibraryId() {
		return LibraryId;
	}
	public void setLibraryId(long libraryId) {
		LibraryId = libraryId;
	}
	

}
