package fr.uha.miage.projet.relation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reservation{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	/*@Id
	@OneToMany
	@JoinColumn(name="idutilisateur")
	private int id_util;
	
	@Id
	@OneToMany
	@JoinColumn(name="idtournoi")
	private int id_tour;*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
}
