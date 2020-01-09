package fr.gtmprojet.destination_mock.DAO;

import java.time.LocalDate;
import java.util.List;

import fr.gtmprojet.destination_mock.entities.Destination;
import fr.gtmprojet.destination_mock.entities.Formule;

public interface DestinationDao {
//les fonction qui vont etre definie dans mock dao
	
	void creer(Destination d);
	void supprimer(Destination d);
	void update(Destination d);
	Destination findDestinationById(Long id);
	List<Destination> findAllDestinations();
	void creer(Formule f);
	void supprimer(Formule f);
	void update(Formule f, LocalDate aller, LocalDate retour, double prix, int nbPlace, String description);
	Formule findFormuleById(Long id);
	
	
}
	

	
	
	