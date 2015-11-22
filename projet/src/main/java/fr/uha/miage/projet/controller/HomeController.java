package fr.uha.miage.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.uha.miage.projet.relation.model.Utilisateur;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@Controller
public class HomeController {

	@Autowired
	UtilisateurRepository utilisateur;
	
	@RequestMapping(value="/Home", method=RequestMethod.GET)
    public String AffichageFormulaire(Utilisateur u) {
		return "/Home";
	}
	
	@RequestMapping(value="/Home", method=RequestMethod.POST)
    public String VerifConnexion(Utilisateur u) {

		for(Utilisateur user : utilisateur.findAll())
		{
			//Cas où l'utilisateur est dans la base de donnée
			if(user.getPseudo().equals(u.getPseudo()) && user.getMotDePasse().equals(u.getMotDePasse()) )
			{
				//Cas où l'utilisateur est un admin
				if(user.getDroit()==1)
				{
					return "redirect:HomeAdmin";
				}
				else
				{
					return "redirect:HomeUtilisateur";
				}
				
			}
		}
		

			return "Home";
    	
    }

    
	
}