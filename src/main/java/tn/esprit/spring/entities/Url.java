package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Url implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; // Clé primaire
	@Column(name = "url", nullable = false, unique = true)

	private String url;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Url(long id, String url) {
		super();
		this.id = id;
		this.url = url;
	}
	public Url() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Url [id=" + id + ", url=" + url + "]";
	}
	
}
