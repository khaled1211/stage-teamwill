package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Suivi;



public interface SuiviService {
	List<Suivi> retrieveAllSuivis();
	Suivi addSuivi(Suivi s);


}
