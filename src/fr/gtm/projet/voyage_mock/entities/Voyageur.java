package fr.gtm.projet.voyage_mock.entities;

import java.util.Date;

public class Voyageur {
	
	private String civilite;
	private String nom;
	private String prenom;
	private Date dateNaisance;
	private String numero;
	private Long id;
	

	public Voyageur(String civilite, String nom, String prenom, Date dateNaisance, String numero, Long id) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaisance = dateNaisance;
		this.numero = numero;
		this.id = id;
	}
	
}

