package be.ipam.sgbd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import be.ipam.sgbd.Model.*;
import be.ipam.sgbd.Services.BibliothequeService;

@Controller
public class BibliothequeController {

	 @Autowired
	 BibliothequeService bs;
	
 public List<Copy> getCopies(Bibliotheque bib){
	 
	return (List<Copy>) bs.getCopies(bib);
	 
 }
 
 public List<Bibliotheque> getBibliotheque(){
	 return (List<Bibliotheque>) bs.getLibraries();
 }
 
 
}
