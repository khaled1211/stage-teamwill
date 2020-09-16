package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Suivi;


@Repository
public interface SuiviRepository extends JpaRepository<Suivi,Long> {
	

}