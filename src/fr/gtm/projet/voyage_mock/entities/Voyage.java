package fr.gtm.projet.voyage_mock.entities;

import fr.gtm.voyage_mock.entities.Formule;

public class Voyage {
	
	private String region;
	private String descriptif;
	private int id;
	private Formule formule;
	
	public Voyage(String region, String descriptif, int id) {
		this.region = region;
		this.descriptif = descriptif;
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getPrix() {
		return formule.getPrix();
	}

}
