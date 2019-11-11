package Library.Model;

import javax.persistence.*;

@Entity
@Table(name="Copy")
public class Copy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CopyId")
	private long CopyId;
	private long CopyStateId;
	private long CopyStatusId;
	private long EditionISBN;


	public long getCopyStateId() {
		return CopyStateId;
	}
	public void setCopyStateId(long copyStateId) {
		CopyStateId = copyStateId;
	}

	public long getCopyStatusId() {
		return CopyStatusId;
	}
	public void setCopyStatusId(long copyStatusId) {
		CopyStatusId = copyStatusId;
	}

	public long getEditionISBN() {
		return EditionISBN;
	}
	public void setEditionISBN(long editionISBN) {
		EditionISBN = editionISBN;
	}

}
