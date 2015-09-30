package fr.uha.miage.projet.relation.model;

import java.io.Serializable;
//import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Tournoi /*implements Serializable*/{

	@Id
	@Column(name="idtournoi")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	

	
	private String lieu;
	//private BigDecimal price;
	private double price;
	private String type;
	private int nb_joueur_max;
	/*private SimpleDateFormat date_tournoi = new SimpleDateFormat("MM/yyyy");;
	private SimpleDateFormat heure_debut = new SimpleDateFormat("hh:mm");
	private SimpleDateFormat heure_fin = new SimpleDateFormat("hh:mm");*/



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLieu() {
		return lieu;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNb_joueur_max() {
		return nb_joueur_max;
	}

	public void setNb_joueur_max(int nb_joueur_max) {
		this.nb_joueur_max = nb_joueur_max;
	}


	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
}
