package fr.uha.miage.projet.relation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Tournoi {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String lieu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
}
