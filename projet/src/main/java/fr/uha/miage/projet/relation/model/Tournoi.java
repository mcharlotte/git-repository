package fr.uha.miage.projet.relation.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Tournoi implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy="tournoi", cascade=CascadeType.REMOVE)
	private List<Reservation> reservations = new ArrayList<Reservation>();

	
	private String lieu;
	private double prix;
	private String type;
	private String nom;
	private int nbJoueurMax;
	private int jour;
	private int mois;
	private int annee;
	private int minute;
	private int heure;
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getLieu() {
		return lieu;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNbJoueurMax() {
		return nbJoueurMax;
	}

	public void setNbJoueurMax(int nbJoueurMax) {
		this.nbJoueurMax = nbJoueurMax;
	}


	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
