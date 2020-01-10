package fr.gtm.projet.destination_mock.DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;

public class DestinationMockDao implements DestinationDao {

	
	// code des methodes qui sont des destDAO interface

private List<Destination> destinations = new ArrayList<Destination>();
List<Formule> allFormules = new ArrayList<Formule>();

private static long id = 0;

	public DestinationMockDao() {
	id = 0;
}


	
	
@Override
public void creer(Destination d) {
		d.setId(++id);
		findAllDestinations().add(d);
	
	}

@Override
public void creer(Formule f) {
	f.setId(++id);
	allFormules.add(f);
	
}

@Override
public void supprimer(Formule f) {
	allFormules.remove(f);
	f.setId(null);
}

@Override
public void update(Formule f, double prix, int nbPlace, String description) {
	f.setPrix(prix);
	f.setNbPlace(nbPlace);
	f.setDescription(description);
	
}


@Override
public Formule findFormuleById(Long id) {
		for (Formule f:allFormules) {
		if (f.getId()==id) {
			return f;
		}	
	} return null;
	}

	


@Override
public void supprimer(Destination d) {
	findAllDestinations().remove(findAllDestinations().indexOf(d));
	d.setId(null);
}

@Override
public void update(Destination d, String nom, String description) {
	d.setNom(nom);
	d.setDescription(description);
	
}

@Override
public Destination findDestinationById(Long id) {
	for (Destination d:findAllDestinations()) {
		if (d.getId()==id) {
			return d;
		}	
	} return null;
}


@Override
public List<Destination> findAllDestinations() {
	return destinations;
}
}


//
//public List<Destination> getDestinations() {
//	return destinations;
//}
//
//
//
//
//public void setDestinations(List<Destination> destinations) {
//	this.destinations = destinations;
//}











