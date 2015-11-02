package fr.uha.miage.projet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.uha.miage.projet.relation.model.Reservation;
import fr.uha.miage.projet.relation.model.Tournoi;
import fr.uha.miage.projet.relation.model.Utilisateur;
import fr.uha.miage.projet.relation.repository.ReservationRepository;
import fr.uha.miage.projet.relation.repository.TournoiRepository;
import fr.uha.miage.projet.relation.repository.UtilisateurRepository;

@SpringBootApplication
public class ProjetApplication implements CommandLineRunner{

	@Autowired
	private TournoiRepository tournoiRepository;
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	
	
    public static void main(String[] args) {
       SpringApplication.run(ProjetApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		
		Tournoi t1 = new Tournoi();
		t1.setLieu("ici");
		t1.setNb_joueur_max(5);
		t1.setPrice(12.5);
		t1.setType("Tennis");
		tournoiRepository.save(t1);
		
	
		Utilisateur u1 = new Utilisateur();
		u1.setPseudo("test");
		u1.setPassword("cc");
		utilisateurRepository.save(u1);
		
		
		Reservation r1 = new Reservation();
		r1.setTournoi(t1);
		r1.setUtilisateur(u1);
		reservationRepository.save(r1);
		
		System.out.println("Réservation id : "+r1.getId());
		System.out.println("Réservation tournoi : "+r1.getTournoi().getType());
		System.out.println("Réservation utilisateur : "+r1.getUtilisateur().getPseudo());
		
	}
}

