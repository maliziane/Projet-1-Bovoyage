package fr.gtm.projet.voyage_mock.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String nom;
	private String numero;
	private Long id;
	List<Voyage> voyages=new ArrayList<Voyage>();
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Voyage> getVoyages() {
		return voyages;
	}

	public void setVoyages(List<Voyage> voyages) {
		this.voyages = voyages;
	}
	
	public void addVoyage(Voyage v) {
		voyages.add(v);
	}
	
	public Client(String nom, String numero) {
		this.nom = nom;
		this.numero = numero;
	}

}
