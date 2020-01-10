package fr.gtm.projet.voyage_mock.entities;


import java.util.ArrayList;
import java.util.List;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
import fr.gtm.projet.voyage_mock.dao.VoyageMockDao;

public class Voyage {
	
	private Long id;
	private Formule f;
	private Destination d;

	private String region;
	private String descriptif;
	private VoyageMockDao voyageMockDao;
	List <Voyageur> voyageurs = new ArrayList<Voyageur>();
	

	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}

	public void setVoyageurs(List<Voyageur> voyageurs) {
		this.voyageurs = voyageurs;
	}

	public void addVoyageur(List<Voyageur> list) {
		
		if (list.size()<=9) {
		for (Voyageur voyageur : list) {
			voyageurs.add(voyageur);
		}
	}
	}		

	public VoyageMockDao getVoyageMockDao() {
		return voyageMockDao;
	}

	public void setVoyageMockDao(VoyageMockDao voyageMockDao) {
		this.voyageMockDao = voyageMockDao;
	}

	public Formule getF() {
		return f;
	}

	public void setF(Formule f) {
		this.f = f;
	}

	public Destination getD() {
		return d;
	}

	public void setD(Destination d) {
		this.d = d;
	}

	public Voyage() {
	
		
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public double getPrix() {
		return f.getPrix();
	}
	
	public void commander(Voyage v,List<Voyageur> voyageurs) {
		if(voyageurs.size()<=f.getNbPlace()) {
			this.setD(this.d);
			this.setF(this.f);
			this.addVoyageur(voyageurs);
			voyageMockDao.creer(v);
			for (Voyageur voyageur : voyageurs) {
				voyageur.addIdVoyage(v.getId());
			}
			f.setNbPlace(f.getNbPlace()-voyageurs.size());
		}
	}

}
