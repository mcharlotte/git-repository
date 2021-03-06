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
import fr.uha.miage.projet.relation.model.Reservation;
import fr.uha.miage.projet.relation.model.Tournoi;
import fr.uha.miage.projet.relation.model.Utilisateur;
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
	
	@RequestMapping(value ="/removeUser/{id}", method = RequestMethod.GET)
    public String supprimerUser(@PathVariable("id") Integer id)
    {
    	utilisateur.delete(id);
    	return "redirect:/adminUser";
    }
	
	@RequestMapping(value = "/modifUser", method = RequestMethod.GET)
    public String modifyUser(@RequestParam long id, Model model,HttpSession session)
    {
		Utilisateur old_u = utilisateur.findOne((int) id);
    	model.addAttribute("old_user", old_u);
    	
    	return "modifUser";
    }
	
	@RequestMapping(value = "/modifUser", method = RequestMethod.POST)
    public String saveModifUser(@RequestParam long id, Utilisateur modified_user,HttpSession session, RedirectAttributes redirectAttributes)
    {
    	
    	Utilisateur beta = utilisateur.findOne((int) id);
    	beta.setPseudo(modified_user.getPseudo());
    	beta.setMotDePasse(modified_user.getMotDePasse());
    	beta.setDroit(modified_user.getDroit());
    	beta.setEmail(modified_user.getEmail());
    	
    	utilisateur.save(beta);
    	
    	return "redirect:/adminUser";
    }
	
	
	@RequestMapping(value="/adminReserv", method=RequestMethod.GET)
    public String listeReserv(Model model,HttpSession session) {
		
		model.addAttribute("reservation", reservation.findAll());
		model.addAttribute("utilisareur", utilisateur.findAll());
		model.addAttribute("tournoi", tournoi.findAll());
    	return "adminReserv";
    }
	
	
	
	@RequestMapping("/removeReserv/{id}")
    public String supprimerReserv(@PathVariable("id") Integer idReserv,HttpSession session)
    {
    	reservation.delete(idReserv);
    	return "redirect:/adminReserv";
    }
    
}

/*
 * 
 *  ///--Methodes obsolètes--\\\
 *  
 *  
 * @RequestMapping(value = "/modifReserv", method = RequestMethod.GET)
 *  public String modifyReserv(@RequestParam long id, Model model,HttpSession session)
 *   {
 *		Reservation old_res = reservation.findOne((int) id);
 *    	model.addAttribute("old_res", old_res);
 *    	
 *   	return "modifReserv";
 *   }
*	
*	@RequestMapping(value = "/modifReserv", method = RequestMethod.POST)
*    public String saveModifReserv(@RequestParam long id, Reservation modified_reserv,HttpSession session, RedirectAttributes redirectAttributes)
*    {
*    	
*    	Reservation beta = reservation.findOne((int) id);
*    	beta.setUtilisateur(modified_reserv.getUtilisateur());
*    	beta.setTournoi(modified_reserv.getTournoi());
*    	
*    	reservation.save(beta);
*    	
*    	return "redirect:/adminReserv";
*    }
*	
*	@RequestMapping(value = "/createReserv", method = RequestMethod.GET)
*	public String createReserv(HttpSession session,RedirectAttributes redirectAttributes,Model model) 
*	{
*		model.addAttribute("reserv_create", new Reservation());
*		return "createReserv";
*	}
*	
*	@RequestMapping(value = "/createReserv", method = RequestMethod.POST)
*	public String saveNewReserv(Reservation reserv_create,HttpSession session, RedirectAttributes redirectAttributes) 
*	{
*		reserv_create.setTournoi((Tournoi)reserv_create.getTournoi());
*		reserv_create.setUtilisateur((Utilisateur)reserv_create.getUtilisateur());
*		reservation.save(reserv_create);
*		return "redirect:/adminTournois";
*	}
* 
* 	
*	@RequestMapping(value = "/createUser", method = RequestMethod.GET)
*	public String createUtilisateur(Model model) 
*	{
*		model.addAttribute("create_user", new Utilisateur());
*		return "createUser";
*	}
*	
*	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
*	public String saveNewUser(Utilisateur u) 
*	{
*		utilisateur.save(u);
*		return "redirect:/adminUser";
*	}
*/
