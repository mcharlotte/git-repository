package fr.uha.miage.projet.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class HomeController {

	@Autowired
	UtilisateurRepository utilisateur;
	
	@RequestMapping(value="/Home", method=RequestMethod.GET)
    public String showForm(HttpSession session) {
    	return "Home";
    }

    
	
}
