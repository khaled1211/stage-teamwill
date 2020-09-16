package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Suivi;
import tn.esprit.spring.service.SuiviService;

@RestController
public class SuiviRestControllerImpl {
	@Autowired
	SuiviService suiviservice;

	@CrossOrigin(origins="*")
	@PostMapping("/addsuivi")
	@ResponseBody

	public Suivi addSuivi(@RequestBody Suivi s) {
	Suivi se=suiviservice.addSuivi(s);
		return se;
		
       
            
      
	} 
	

	 @GetMapping("/suivis")
	  
	  @ResponseBody 
	  public List<Suivi> getSuivi() { 
		  List<Suivi> suivis=suiviservice.retrieveAllSuivis();
	  return suivis; }
	
	

	 
}


