package fr.uha.miage.projet.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.uha.miage.projet.relation.model.Reservation;
import fr.uha.miage.projet.relation.model.Tournoi;
import fr.uha.miage.projet.relation.model.Utilisateur;
import fr.uha.miage.projet.relation.repository.ReservationRepository;
import fr.uha.miage.projet.relation.repository.TournoiRepository;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class HomeController {

	@Autowired
	UtilisateurRepository utilisateur;
	
	@Autowired
	TournoiRepository tournoi;
	
	@Autowired
	ReservationRepository reservation;
	
	
	@RequestMapping(value="/Home", method=RequestMethod.GET)
    public String listeTournoisAvantCo(Model model,HttpSession session) {
		
		model.addAttribute("tournoi", tournoi.findAll());
    	return "Home";
    }
	
	@RequestMapping(value="/Home", method=RequestMethod.POST)
    public String listeTournoisApresCo(Model model,HttpSession session) {
		
		model.addAttribute("tournoi", tournoi.findAll());
    	return "Home";
    }

    
	
}
