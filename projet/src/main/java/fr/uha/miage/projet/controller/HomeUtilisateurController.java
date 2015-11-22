package fr.uha.miage.projet.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.uha.miage.projet.relation.model.Reservation;
import fr.uha.miage.projet.relation.model.Tournoi;
import fr.uha.miage.projet.relation.model.Utilisateur;
import fr.uha.miage.projet.relation.repository.ReservationRepository;
import fr.uha.miage.projet.relation.repository.TournoiRepository;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class HomeUtilisateurController {

	@Autowired
	UtilisateurRepository utilisateur;
	
	@Autowired
	TournoiRepository tournoi;
	
	@Autowired
	ReservationRepository reservation;
	
	@RequestMapping(value="/HomeUtilisateur", method=RequestMethod.GET)
	public String AffichageFormulaire(Utilisateur u, Model model) {
		
		String inOut = "";
		
		u =utilisateur.findOne(HomeController.idUtilisateur);
		model.addAttribute("tournoi", tournoi.findAll());
		model.addAttribute(u);
		
		List<Reservation> resaU = u.getReservations();
		for(Tournoi t : tournoi.findAll())
		{
			for(int i=0;i<resaU.size();i++)
			{
				if(t.getReservations().contains(resaU.get(i)))
				{
					resaU.remove(resaU.get(i));
					inOut="Quitter";				
				}
				else
				{
					inOut="Rejoindre";
				}
				
			}
			model.addAttribute("inout", inOut);	
		}
			
		return "/HomeUtilisateur";

    }
	
	@RequestMapping(value="/HomeUtilisateur", method=RequestMethod.POST)
	public String Deconnexion(Utilisateur u, Model model) {
		return "/Home";
	}
    
	
}
