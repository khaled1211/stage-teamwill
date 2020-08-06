package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Url;
import tn.esprit.spring.repository.UrlRepository;

@Service
public class UrlServiceImpl implements UrlService {
	private static final Logger l = LogManager.getLogger(UrlServiceImpl.class);
	@Autowired
	UrlRepository urlrepository;

	@Override
	public List<Url> retrieveAllUrls() {
		// TODO Auto-generated method stub
		List<Url> urls = (List<Url>) urlrepository.findAll();
		for (Url url : urls) {
	            
			l.info("url +++:" + url);
		}
		return urls;
	
	}

	@Override
	public Url addUrl(Url u) {
		// TODO Auto-generated method stub
		return urlrepository.save(u);
	}
	

	



	
	



	
	
	}


