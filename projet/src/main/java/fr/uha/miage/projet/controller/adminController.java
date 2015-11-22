package fr.uha.miage.projet.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import fr.uha.miage.projet.relation.model.Tournoi;
import fr.uha.miage.projet.relation.repository.ReservationRepository;
import fr.uha.miage.projet.relation.repository.TournoiRepository;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class adminController {

	@Autowired
	UtilisateurRepository utilisateur;
	
	@Autowired
	TournoiRepository tournoi;
	
	@Autowired
	ReservationRepository reservation;
	
	
	@RequestMapping(value="/adminTournois", method=RequestMethod.GET)
    public String listeTournois(Model model,HttpSession session) {
		
		model.addAttribute("tournoi", tournoi.findAll());
    	return "adminTournois";
    }

	@RequestMapping(value ="/removeTournoi/{id}", method = RequestMethod.GET)
    public String supprimerTournoi(@PathVariable("id") Integer id)
    {
    	tournoi.delete(id);
    	return "redirect:/adminTournois";
    }
	
	@RequestMapping(value = "/modifTournoi", method = RequestMethod.GET)
    public String modifyTournoi(@RequestParam long id, Model model,HttpSession session)
    {
		Tournoi old_t = tournoi.findOne((int) id);
    	model.addAttribute("old_tourn", old_t);
    	
    	return "modifTournoi";
    }
	
	@RequestMapping(value = "/modifTournoi", method = RequestMethod.POST)
    public String saveModifTournoi(@RequestParam long id, Tournoi modified_tourn,HttpSession session, RedirectAttributes redirectAttributes)
    {
    	//récupère le bon favoris et met a jour ces données
    	Tournoi beta = tournoi.findOne((int) id);
    	beta.setLieu(modified_tourn.getLieu());
    	beta.setPrix(modified_tourn.getPrix());
    	beta.setType(modified_tourn.getType());
    	beta.setNbJoueurMax(modified_tourn.getNbJoueurMax());
    	beta.setJour(modified_tourn.getJour());
    	beta.setMois(modified_tourn.getMois());
    	beta.setAnnee(modified_tourn.getAnnee());
    	beta.setMinute(modified_tourn.getMinute());
    	beta.setHeure(modified_tourn.getHeure());
    	//le sauvegarde
    	tournoi.save(beta);
    	
    	return "redirect:/adminTournois";
    }
	
	@RequestMapping(value = "/createTournoi", method = RequestMethod.GET)
	public String createTournoi(Model model) 
	{
		model.addAttribute("tourn_create", new Tournoi());
		return "createTournoi";
	}
	
	@RequestMapping(value = "/createTournoi", method = RequestMethod.POST)
	public String saveNewTournoi(Tournoi t) 
	{
		tournoi.save(t);
		return "redirect:/adminTournois";
	}
	
	
	
	@RequestMapping(value="/adminUser", method=RequestMethod.GET)
    public String listeUser(Model model,HttpSession session) {
		
		model.addAttribute("utilisateur", utilisateur.findAll());
    	return "adminUser";
    }
	
	@RequestMapping(value="/adminReserv", method=RequestMethod.GET)
    public String listeReserv(Model model,HttpSession session) {
		
		model.addAttribute("reservation", reservation.findAll());
    	return "adminReserv";
    }
    
}
