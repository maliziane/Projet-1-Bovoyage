package fr.gtm.projetTest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.projet.voyage_mock.dao.VoyageMockDao;
import fr.gtm.projet.voyage_mock.entities.Client;

public class ClientTest {

	@Test
	public void testGetNom() {
		Client c1 = new Client("toto","0160794141");
		assertEquals("toto",c1.getNom());
	}

	@Test
	public void testSetNom() {
		Client c1 = new Client("toto","0160794141");
		c1.setNom("titi");
		assertEquals("titi",c1.getNom());
	}

	@Test
	public void testGetNumero() {
		Client c1 = new Client("toto","0160794141");
		assertEquals("0160794141",c1.getNumero());
	}

	@Test
	public void testSetNumero() {
		Client c1 = new Client("toto","0160794141");
		c1.setNumero("0124");
		assertEquals("0124",c1.getNumero());
	}

	@Test
	public void testGetId() {
		Client c1 = new Client("toto","0160794141");
		VoyageMockDao dao= new VoyageMockDao();
		
	}

	@Test
	public void testSetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testClient() {
		Client c1 = new Client("toto","0160794141");
		assertNotNull(c1);
	}

}
