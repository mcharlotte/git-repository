package fr.uha.miage.projet.relation.repository;

import org.springframework.data.repository.CrudRepository;

import fr.uha.miage.projet.relation.model.Reservation;
import fr.uha.miage.projet.relation.model.Tournoi;

public interface ReservationRepository extends CrudRepository<Reservation,Integer>{

}
