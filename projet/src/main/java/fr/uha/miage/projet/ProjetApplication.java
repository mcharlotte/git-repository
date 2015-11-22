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
		
		/*******************************************************************************************************************************/
		/****************************************************** TOURNOIS ***************************************************************/
		/*******************************************************************************************************************************/
		//Tournoi de Cartes à Mulhouse le 23/11/2015 à 17h30, 10 joueurs max, 4.5€
		Tournoi t1 = new Tournoi(); t1.setLieu("Mulhouse"); t1.setNbJoueurMax(10); t1.setPrix(4.5); t1.setType("Cartes"); t1.setAnnee(2015); t1.setMois(11); t1.setJour(23); t1.setHeure(17); t1.setMinute(30);
		tournoiRepository.save(t1);

		//Tournoi de Pétanque à Colmar le 28/11/2015 à 13h30, 20 joueurs max, 2€
		Tournoi t2 = new Tournoi(); t2.setLieu("Colmar"); t2.setNbJoueurMax(20); t2.setPrix(2.0); t2.setType("Pétanque"); t2.setAnnee(2015); t2.setMois(11); t2.setJour(28); t2.setHeure(13); t2.setMinute(30);
		tournoiRepository.save(t2);
		
		//Tournoi de Badminton à Strasbourg le 26/11/2015 à 20h, 12 joueurs max, 5€
		Tournoi t3 = new Tournoi(); t3.setLieu("Strasbourg"); t3.setNbJoueurMax(12); t3.setPrix(5.0); t3.setType("Badminton"); t3.setAnnee(2015); t3.setMois(11); t3.setJour(26); t3.setHeure(20); t3.setMinute(0);
		tournoiRepository.save(t3);

		/*******************************************************************************************************************************/
		/****************************************************** UTILISATEURS ***********************************************************/
		/*******************************************************************************************************************************/
		
		Utilisateur u1 = new Utilisateur(); u1.setPseudo("Jan"); u1.setMotDePasse("janmdp"); u1.setEmail("jan@uha.fr"); 
		utilisateurRepository.save(u1);
		
		Utilisateur u2 = new Utilisateur(); u2.setPseudo("Gaël"); u2.setMotDePasse("gaelmdp"); u2.setEmail("gael@uha.fr"); 
		utilisateurRepository.save(u2);		
		
		Utilisateur u3 = new Utilisateur(); u3.setPseudo("Charlotte"); u3.setMotDePasse("charlottemdp"); u3.setEmail("charlotte@uha.fr"); 		utilisateurRepository.save(u3);
		
		Utilisateur u4 = new Utilisateur(); u4.setPseudo("Audrey"); u4.setMotDePasse("audreymdp"); u4.setEmail("audrey@uha.fr");
		utilisateurRepository.save(u4);
		
		Utilisateur u5 = new Utilisateur(); u5.setPseudo("Sophie"); u5.setMotDePasse("sophiemdp"); u5.setEmail("sophie@uha.fr");
		utilisateurRepository.save(u5);
		
		Utilisateur u6 = new Utilisateur(); u6.setPseudo("Ralph"); u6.setMotDePasse("ralphmdp"); u6.setEmail("ralph@uha.fr");
		utilisateurRepository.save(u6);
		
		//droit admin
		Utilisateur u7 = new Utilisateur(); u7.setPseudo("Admin"); u7.setMotDePasse("admin"); u7.setEmail("admin@uha.fr"); u7.setDroit(1);
		utilisateurRepository.save(u7);
		
		/*******************************************************************************************************************************/
		/****************************************************** RÉSERVATIONS ***********************************************************/
		/*******************************************************************************************************************************/
		
		// Jan - Cartes
		Reservation r1 = new Reservation(); r1.setTournoi(t1); r1.setUtilisateur(u1); reservationRepository.save(r1);
		
		// Gael - Cartes
		Reservation r2 = new Reservation(); r2.setTournoi(t1); r2.setUtilisateur(u2); reservationRepository.save(r2);
		
		// Ralph - Cartes
		Reservation r3 = new Reservation(); r3.setTournoi(t1); r3.setUtilisateur(u6); reservationRepository.save(r3);
		
		// Jan - Pétanque
		Reservation r4 = new Reservation(); r4.setTournoi(t2); r4.setUtilisateur(u1); reservationRepository.save(r4);
		
		// Gael - Pétanque
		Reservation r5 = new Reservation(); r5.setTournoi(t2); r5.setUtilisateur(u2); reservationRepository.save(r5);
		
		// Ralph - Pétanque
		Reservation r6 = new Reservation(); r6.setTournoi(t2); r6.setUtilisateur(u6); reservationRepository.save(r6);
		
		// Audrey - Pétanque
		Reservation r7 = new Reservation(); r7.setTournoi(t2); r7.setUtilisateur(u4); reservationRepository.save(r7);
		
		// Sophie - Pétanque
		Reservation r8 = new Reservation(); r8.setTournoi(t2); r8.setUtilisateur(u5); reservationRepository.save(r8);
		
		// Charlotte - Pétanque
		Reservation r9 = new Reservation(); r9.setTournoi(t2); r9.setUtilisateur(u3); reservationRepository.save(r9);
		
		// Audrey - Badminton
		Reservation r10 = new Reservation(); r10.setTournoi(t3); r10.setUtilisateur(u4); reservationRepository.save(r10);
		
		// Sophie - Badminton
		Reservation r11 = new Reservation(); r11.setTournoi(t3); r11.setUtilisateur(u5); reservationRepository.save(r11);
		
		// Charlotte - Badminton
		Reservation r12 = new Reservation(); r12.setTournoi(t3); r12.setUtilisateur(u3); reservationRepository.save(r12);
	
		

	}
}

