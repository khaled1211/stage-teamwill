package tn.esprit.spring.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Suivi {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String tache;
	private int note;
	private String contenu;
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Date date;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

	
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public Suivi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Suivi(long id, String tache, String contenu, Date date) {
		super();
		this.id = id;
		this.tache = tache;
		this.contenu = contenu;
		this.date = date;
	}
	public Suivi(String tache, int note, Date date, String contenu) {
		super();
		this.tache = tache;
		this.note = note;
		this.date = date;
		this.contenu = contenu;
	}

	
	
	

}
