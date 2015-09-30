package fr.uha.miage.projet.relation.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur  /*implements Serializable*/{
	

	@Id
	@Column(name="idutilisateur")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String pseudo;
	private String password;
	private int droit;
	private String email;


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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
