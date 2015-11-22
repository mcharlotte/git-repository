package fr.uha.miage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.uha.miage.projet.relation.model.Reservation;
import fr.uha.miage.projet.relation.model.Utilisateur;
import fr.uha.miage.projet.relation.repository.ReservationRepository;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class ReservationController {

	
	@Autowired
	ReservationRepository reservation;

	@RequestMapping(value="/Reservation", method=RequestMethod.GET)
	public String requestCreation(Model model)
	{
		model.addAttribute("reservation", reservation.findAll());
		return "/Reservation";
	}	
	
	
	@RequestMapping(value="/Reservation", method=RequestMethod.POST)
    public String inscription(Utilisateur u) {
		
		
		return "redirect:/HomeUtilisateur";
    	
    }

    
	
}