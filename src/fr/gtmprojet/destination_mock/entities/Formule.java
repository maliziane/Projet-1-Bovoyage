package fr.gtmprojet.destination_mock.entities;

import java.time.LocalDate;

public class Formule {

	private LocalDate aller;
	private LocalDate retour;
	private double prix;
	private int nbPlace;
	private String description;
	private Long id;
	
	public LocalDate getAller() {
		return aller;
	}

	public void setAller(LocalDate aller) {
		this.aller = aller;
	}

	public LocalDate getRetour() {
		return retour;
	}

	public void setRetour(LocalDate retour) {
		this.retour = retour;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Formule(LocalDate aller, LocalDate retour, double prix, int nbPlace, String description, Long id) {
		this.aller = aller;
		this.retour = retour;
		this.prix = prix;
		this.nbPlace = nbPlace;
		this.description = description;
		this.id = id;
	}




}
