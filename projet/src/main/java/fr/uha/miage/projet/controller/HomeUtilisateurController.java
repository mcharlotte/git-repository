package fr.uha.miage.projet.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		
		u =utilisateur.findOne(HomeController.idUtilisateur);
		model.addAttribute("tournoi", tournoi.findAll());
		model.addAttribute(u);
		String inOut="";
		List<Reservation> resaU = u.getReservations();
		ArrayList<Integer> tournoiRejoins = new ArrayList<Integer>();
		for(Tournoi t : tournoi.findAll())
		{
			for(int i=0;i<resaU.size() ;i++)
			{
				for(int j=0;j<t.getReservations().size();j++)
				{
					if(resaU.get(i)==t.getReservations().get(j))
					{
						tournoiRejoins.add(t.getId());
						inOut="Quitter";
						
					}
				}
			}
			if(inOut!="Quitter")
			{
				model.addAttribute("inout", "Quitter");
				inOut="";
				System.out.print("OUT\n");
			}
			else
			{
				model.addAttribute("inout", "Rejoindre");
				inOut="";
				System.out.print("IN\n");
			}			
			
		}
		
		System.out.print(tournoiRejoins);
			//model.addAttribute("inout", "Rejoindre");	
		
		//System.out.print(inOut+"\n");	
		return "/HomeUtilisateur";

}
	
	@RequestMapping(value="/HomeUtilisateur", method=RequestMethod.POST)
	public String Deconnexion(Utilisateur u, Model model) {
		return "redirect:/Home";
	}
    
	@RequestMapping(value = "/ModificationUtilisateur", method = RequestMethod.GET)
    public String modifyUser(Model model)
    {
		Utilisateur old_u = utilisateur.findOne(HomeController.idUtilisateur);
    	model.addAttribute("utilisateur", old_u);
    	
    	return "ModificationUtilisateur";
    }
	
	@RequestMapping(value = "/ModificationUtilisateur", method = RequestMethod.POST) 
	public String saveModifUser(Utilisateur u) { 
		Utilisateur beta = utilisateur.findOne(HomeController.idUtilisateur); 
		beta.setPseudo(u.getPseudo()); beta.setMotDePasse(u.getMotDePasse()); 
		beta.setDroit(u.getDroit()); beta.setEmail(u.getEmail()); 
		
		utilisateur.save(beta); 
		
		return "redirect:/HomeUtilisateur"; 
		}
	
}
