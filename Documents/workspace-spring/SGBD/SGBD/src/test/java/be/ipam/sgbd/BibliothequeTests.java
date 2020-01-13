package be.ipam.sgbd;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import be.ipam.sgbd.Controller.BibliothequeController;
import be.ipam.sgbd.Model.*;

@SpringBootTest
public class BibliothequeTests {

	@Autowired
	BibliothequeController controller;
	@Autowired
	

	@Test
	public void testGetCopies() {


		Bibliotheque bib = controller.getBibliotheque().stream().iterator().next();		
		List<Copy> copies = controller.getCopies(bib);
		
		

	}

}
