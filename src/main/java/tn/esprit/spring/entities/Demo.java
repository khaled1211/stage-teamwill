package tn.esprit.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Demo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idex;
	private String tache;
	private String contenu;
	public long getIdex() {
		return idex;
	}
	public void setIdex(long idex) {
		this.idex = idex;
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
	public Demo(long idex, String tache, String contenu) {
		super();
		this.idex = idex;
		this.tache = tache;
		this.contenu = contenu;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
