package be.ipam.sgbd.Model;

import javax.persistence.*;

@Entity
public class Copy {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CopyId")
	private long CopyId;

	@ManyToOne
	@JoinColumn(name = "CopyStateId")
	private CopyState State;

	@ManyToOne
	@JoinColumn(name = "CopyStatusId")
	private CopyStatus Status;

	@ManyToOne
	@JoinColumn(name = "ISBN")
	private Edition Edition;
	
	@ManyToOne
	@JoinColumn(name = "BibliothequeId")
	private Bibliotheque Bibliotheque;

	public long getCopyId() {
		return CopyId;
	}
	public void setCopyId(long copyId) {
		CopyId = copyId;
	}
	public CopyState getCopyState() {
		return State;
	}
	public void setCopyState(CopyState copyState) {
		State = copyState;
	}
	public CopyStatus getCopyStatus() {
		return Status;
	}
	public void setCopyStatus(CopyStatus copyStatus) {
		Status = copyStatus;
	}
	public Edition getEdition() {
		return Edition;
	}
	public void setEdition(Edition edition) {
		Edition = edition;
	}
	public Bibliotheque getBibliotheque() {
		return Bibliotheque;
	}
	public void setBibliotheque(Bibliotheque bibliotheque) {
		Bibliotheque = bibliotheque;
	}
}