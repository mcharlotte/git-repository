package fr.uha.miage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class HomeUtilisateurController {

	@Autowired
	UtilisateurRepository utilisateur;
	
	
	
	@RequestMapping(value="/HomeUtilisateur", method=RequestMethod.GET)
	public String AffichageFormulaire() {
		
		return "/HomeUtilisateur";
    	
    
    	
    }

    
	
}
