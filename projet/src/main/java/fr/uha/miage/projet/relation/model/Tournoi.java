package fr.uha.miage.projet.relation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tournoi implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy="tournoi")
	private Reservation reservation;

	
	private String lieu;
	private double prix;
	private String type;
	private int nbJoueurMax;
	private int jour;
	private int mois;
	private int annee;
	private int minute;
	private int heure;
	

	public int getId() {
		return id;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
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
