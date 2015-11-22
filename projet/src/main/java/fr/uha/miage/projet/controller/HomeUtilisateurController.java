package fr.uha.miage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.uha.miage.projet.relation.model.Utilisateur;
import fr.uha.miage.projet.relation.repository.TournoiRepository;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class HomeUtilisateurController {

	@Autowired
	UtilisateurRepository utilisateur;
	
	@Autowired
	TournoiRepository tournoi;
	
	@RequestMapping(value="/HomeUtilisateur", method=RequestMethod.GET)
	public String AffichageFormulaire(Utilisateur u, Model model) {
		
		u =utilisateur.findOne(HomeController.idUtilisateur);
		model.addAttribute("tournoi", tournoi.findAll());
		model.addAttribute(u);
		return "/HomeUtilisateur";

    }
	
	@RequestMapping(value="/HomeUtilisateur", method=RequestMethod.POST)
	public String Deconnexion(Utilisateur u, Model model) {
		return "/Home";
	}
    
	
}
