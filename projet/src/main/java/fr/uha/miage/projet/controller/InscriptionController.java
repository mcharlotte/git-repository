package fr.uha.miage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.uha.miage.projet.relation.model.Utilisateur;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class InscriptionController {
	
	@Autowired
	UtilisateurRepository utilisateur;
	
	
	@RequestMapping("/Inscription")
	public String requestCreation(Model model)
	{
		model.addAttribute("utilisateur", new Utilisateur());
		return "Inscription";
	}	
	
	
	@RequestMapping(value="/Inscription", method=RequestMethod.POST)
    public String inscription(Utilisateur u) {
		
		
		for(Utilisateur user : utilisateur.findAll())
		{
			//Cas où l'utilisateur n'est pas dans la base de donnée
			if(!user.getPseudo().equals(u.getPseudo()) )
			{
				if(u.getMotDePasseConfirm().equals(u.getMotDePasse()) )
				{
					utilisateur.save(u);
					return "redirect:/Home";
				}
		        
				else 
				{
					//je sais pas encore
					return "Inscription";
				}
				
			}
		}
		
		//je sais pas encore
		return "Inscription";
        
    }
}
