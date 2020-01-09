package fr.gtm.projetTest;
import java.time.LocalDate;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.projet.destination_mock.DAO.DestinationMockDao;
import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;

public class DestinationMockDaoTest {

	@Test
	public void testCreerDestination() {
		Destination d1 = new Destination("Paris");
		Destination d2 = new Destination("Lyon");
		Destination d3 = new Destination("Marseille");
		assertNull(d1.getId());
		assertNull(d2.getId());
		assertNull(d3.getId());
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(d1);
		dao.creer(d3);
		dao.creer(d2);
		Long a = 1L , b=2L , c=3L;
		assertEquals(a,d1.getId());
		assertEquals(b,d3.getId());
		assertEquals(c,d2.getId());
	}

	@Test
	public void testCreerFormule() {
		Destination d1 = new Destination("Paris");
		Formule f1 = new Formule();
		Destination d2 = new Destination("Lyon");
		assertNull(f1.getId());
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(d1);
		dao.creer(f1);
		dao.creer(d2);
		Long a = 1L , b=2L , c=3L;
		assertEquals(a,d1.getId());
		assertEquals(b,f1.getId());
		assertEquals(c,d2.getId());
}

	@Test
	public void testSupprimerFormule() {
		Destination d3 = new Destination("Paris");
		Formule f3 = new Formule();
		Formule f4 = new Formule();
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(f3);
		dao.creer(f4);
		Long a = 1L, b=2L;
		assertEquals(a,f3.getId());
		assertEquals(b,f4.getId());
		dao.supprimer(f3);
		assertNull(f3.getId());
		assertEquals(b,f4.getId());
	}

	@Test
	public void testUpdateFormuleDoubleIntString() {
		Formule f1 = new Formule();
		f1.setPrix(120.0);
		f1.setNbPlace(20);
		f1.setDescription("peu importe");
		DestinationMockDao dao = new DestinationMockDao();
		dao.update(f1, 290.0, 20, "peu importe");
		
		
	}

	@Test
	public void testFindFormuleById() {
		Formule f1 = new Formule();
		Formule f2 = new Formule();
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(f1);
		dao.creer(f2);
	    Long a = 2L, b=3L;
		assertEquals(f2,dao.findFormuleById(a));
		assertNull(dao.findFormuleById(b));
	}

	@Test
	public void testSupprimerDestination() {
		Destination d3 = new Destination("Paris");
		Formule f3 = new Formule();
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(d3);
		dao.creer(f3);
		Long a = 1L, b=2L;
		assertEquals(a,d3.getId());
		assertEquals(b,f3.getId());
		dao.supprimer(d3);
		assertNull(d3.getId());
		assertEquals(b,f3.getId());
	}

	@Test
	public void testUpdateDestinationStringString() {
		Destination d1 = new Destination("Paris");
		d1.setDescription("peu importe");
		DestinationMockDao dao = new DestinationMockDao();
		dao.update(d1, "Lyon","peu importe");
		
	}

	@Test
	public void testFindDestinationById() {
		Destination d1 = new Destination("Paris");
		Destination d2 = new Destination("Lyon");
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(d1);
		dao.creer(d2);
	    Long a = 1L, b=2L;
		assertEquals(d2,dao.findDestinationById(b));
		assertNull(dao.findFormuleById(a));
	}

	@Test
	public void testFindAllDestinations() {
		Destination d1 = new Destination("Paris");
		Destination d2 = new Destination("Lyon");
		Destination d3 = new Destination ("Marseille");
		Formule f1 = new Formule();
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(d1);
		dao.creer(d2);
		dao.creer(d3);
		dao.creer(f1);
		assertEquals(3,dao.findAllDestinations().size());
	}

}
