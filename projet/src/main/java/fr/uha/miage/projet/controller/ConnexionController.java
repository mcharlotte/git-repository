package fr.uha.miage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.uha.miage.projet.relation.model.Utilisateur;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class ConnexionController {
	
	

	@RequestMapping("/Connexion")
	public String requestCreation(Model model)
	{
		model.addAttribute("utilisateur", new Utilisateur());
		return "Connexion";
	}	
	

}
