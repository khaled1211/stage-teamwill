package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Suivi;
import tn.esprit.spring.repository.SuiviRepository;
@Service
public class SuiviServiceImpl implements SuiviService {
	private static final Logger l = LogManager.getLogger(UrlServiceImpl.class);
	@Autowired
	SuiviRepository suivirepository;

	@Override
	public List<Suivi> retrieveAllSuivis() {
		// TODO Auto-generated method stub
		List<Suivi> suivis = ((JpaRepository<Suivi, Long>) suivirepository).findAll() ;
		for (Suivi suivi : suivis) {
	            
			l.info("url +++:" + suivi);
		}
		return suivis;
	
	}

	@Override
	public Suivi addSuivi(Suivi s) {
		
		// TODO Auto-generated method stub
		return ((CrudRepository<Suivi, Long>) suivirepository).save(s);
	}

}
