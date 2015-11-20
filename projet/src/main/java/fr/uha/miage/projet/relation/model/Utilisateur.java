package fr.uha.miage.projet.relation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Utilisateur  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne(mappedBy="utilisateur")
	private Reservation reservation;
	
	private String pseudo;
	private String motDePasse;
	private String motDePasseConfirm;
	//par défaut 0 = utilisateur, 1 = admin
	private int droit;
	private String email;

	
	
	
	public String getMotDePasseConfirm() {
		return motDePasseConfirm;
	}
	public void setMotDePasseConfirm(String motDePasseConfirm) {
		this.motDePasseConfirm = motDePasseConfirm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public int getDroit() {
		return droit;
	}
	public void setDroit(int droit) {
		this.droit = droit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
