package be.ipam.sgbd.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.ipam.sgbd.Model.*;
import be.ipam.sgbd.Repository.BibliothequeDAO;

@Service	
public class BibliothequeService {

@Autowired
private BibliothequeDAO bibliDAO;

public Iterable<Bibliotheque> getLibraries(){
	return (List<Bibliotheque>)bibliDAO.findAll();
}

public Iterable<Copy> getLibrariesCopies(){
	
	List<Copy> copies = new ArrayList<Copy>();
	List<Bibliotheque> listBiblio = (List<Bibliotheque>) bibliDAO.findAll();
	
	for (Bibliotheque bib : listBiblio) {
		
		copies.addAll(bib.copies);
	}
	return copies;
	
}

public Iterable<Copy> getCopies(Bibliotheque bib){
	
	List<Copy> copies = new ArrayList<Copy>();
	List<Bibliotheque> listBiblio = (List<Bibliotheque>) bibliDAO.findAll();
	
	for (Bibliotheque biblio : listBiblio) {
		if(biblio.getLibraryId() == bib.getLibraryId()) 
		{
			copies.addAll(bib.copies);
		}
 
	}
	return copies;
	
}


}