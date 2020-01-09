package fr.gtm.projetTest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.projet.destination_mock.DAO.DestinationMockDao;
import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;

public class DestinationTest {

	@Test
	public void testAddImage() {
		Destination d = new Destination("Paris");
		d.addImage("toto");
		assertEquals("toto",d.getImages().get(0));
	}

	@Test
	public void testAddFormule() {
		Destination d = new Destination("Paris");
		Formule f = new Formule();
		d.addFormule(f);
		assertEquals(f,d.getFormules().get(0));
	}

	@Test
	public void testGetNom() {
		Destination d = new Destination("Paris");
		assertEquals("Paris",d.getNom());
	}

	@Test
	public void testSetNom() {
		Destination d = new Destination("Paris");
		d.setNom("Lyon");
		assertEquals("Lyon", d.getNom());
	}

		

	@Test
	public void testSetDescription() {
		Destination d = new Destination("Paris");
		d.setDescription("alpha");
		assertEquals("alpha",d.getDescription());
	
	}
	@Test
	public void testgetId() {
		Destination d = new Destination("Paris");
		assertNull(d.getId());
	}
	
	@Test
	public void testSetId() {
		Destination d = new Destination("Paris");
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(d);
		assertNotNull(d.getId());
		Long g=10L;
		d.setId(g);
		assertEquals(g,d.getId());
	}
//
//}
}