package valtiot;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class ValtioTest {

	private static Valtio valtio;

	@Before
	public void alkutoimet() {
		valtio = new Valtio("Suomi", "Helsinki", 634940);
	}

	@Test
	public void testLuoValtio() {
		assertEquals("Nimi väärin ", "Suomi", valtio.getNimi());
		assertEquals("Pääkaupunki väärin ", "Helsinki", valtio.getPääkaupunki());
		assertEquals("Asukasluku väärin ", 634940, valtio.getAsukasluku());
	}

	@Test
	public void testGetNimi() {
		assertEquals("Nimi väärin ", "Suomi", valtio.getNimi());
	}

	@Test
	public void testSetNimi() {
		valtio.setNimi("Finland");
		assertEquals("Nimi väärin ", "Finland", valtio.getNimi());
	}

	@Test
	public void testGetPääkaupunki() {
		assertEquals("Pääkaupunki väärin ", "Helsinki", valtio.getPääkaupunki());
	}

	@Test
	public void testSetPääkaupunki() {
		valtio.setPääkaupunki("Helsingfors");
		assertEquals("Pääkaupunki väärin ", "Helsingfors", valtio.getPääkaupunki());
	}

	@Test
	public void testGetAsukasluku() {
		assertEquals("Asukasluku väärin ", 634940, valtio.getAsukasluku());
	}

	@Test
	public void testSetAsukasluku() {
		valtio.setAsukasluku(20);
		assertEquals("Asukasluku väärin ", 20, valtio.getAsukasluku());
	}

	@Test
	public void testToString() {
		String str = valtio.toString();
		if (!str.contains(valtio.getNimi()))
			fail("Nimi väärin : pitäisi olla " + valtio.getNimi());
		if (!str.contains(valtio.getPääkaupunki()))
			fail("Pääkaupunki väärin : pitäisi olla " + valtio.getPääkaupunki());
		if (!str.contains(String.valueOf(valtio.getAsukasluku())))
			fail("Asukasluku väärin : pitäisi olla " + valtio.getAsukasluku());
	}

}
