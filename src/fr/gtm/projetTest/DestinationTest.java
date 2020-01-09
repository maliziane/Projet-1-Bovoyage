package fr.gtm.projetTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.projet.destination_mock.entities.Destination;

public class DestinationTest {

	@Test
	public void testAddImage(String image) {
		Destination d = new Destination("Paris");
		assertNotNull(d.getNom());
		
	}}

//	@Test
//	public void testAddFormule() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDestination() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetNom() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetNom() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetDescription() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetDescription() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetId() {
//		fail("Not yet implemented");
//	}
//
//}
