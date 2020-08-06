package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Url;
import tn.esprit.spring.service.UrlService;

@RestController
public class UrlRestControllerImpl {
	

	@Autowired
	UrlService urlservice;


	@PostMapping("/addurl")
	@ResponseBody
	public Url addUrl(@RequestBody Url u) {
	Url url = urlservice.addUrl(u);
		return url;
	} // //

	 @GetMapping("/urls")
	  
	  @ResponseBody 
	  public List<Url> getUrl() { 
		  List<Url> urls=urlservice.retrieveAllUrls();
	  return urls; }
	
	

	 
}