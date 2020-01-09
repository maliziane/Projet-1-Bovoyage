package fr.gtmprojet.destination_mock.DAO;

import java.util.ArrayList;
import java.util.List;

import fr.gtmprojet.destination_mock.entities.Destination;
import fr.gtmprojet.destination_mock.entities.Formule;

public class DestinationMockDao implements DestinationDao {

	
	// code des methodes qui sont des destDAO interface

List<Destination> destinations = new ArrayList<Destination>();
List<Formule> allFormules = new ArrayList<Formule>();

	private static long id = 0;
	
@Override
public void creer(Destination d) {
		d.setId(++id);
		destinations.add(d);
	
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
public void update(Formule f) {
	// TODO Auto-generated method stub
	
}

@Override
public Formule findFormuleById(Long id) {
	return null;
}
@Override
public void supprimer(Destination d) {
	destinations.remove(destinations.indexOf(d));
	d.setId(null);
}

@Override
public void update(Destination d) {
	
}

@Override
public Destination findDestinationById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Destination> findAllDestinations() {
	return null;
}










}
