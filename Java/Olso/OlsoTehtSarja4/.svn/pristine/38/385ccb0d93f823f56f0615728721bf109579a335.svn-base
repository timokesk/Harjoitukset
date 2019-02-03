/**
* @author Timo Keskiniemi 3.9.2018
*/

import java.io.*;

public class PerusTyypitettyIO {

	public static void kirjoita(int luvut[], String tiedosto) {
		FileOutputStream fileOut = null;
		DataOutputStream dataOut = null;

		// TODO: täydennä
		try {
			fileOut = new FileOutputStream(tiedosto);
			dataOut = new DataOutputStream(fileOut);
			for (int luku : luvut) {
				dataOut.writeInt(luku);
			}
			dataOut.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Tiedostoa ei löytynyt!");
		}
		catch (IOException e) {
			System.err.println(e);
		}

	}

	public static int kerroKoko(String tiedosto) {
		FileInputStream f = null;
		int koko = 0;

		// TODO: täydennä
		try {
			f = new FileInputStream(tiedosto);
			koko = f.available();
		}
		catch (FileNotFoundException e) {
			System.out.println("Tiedostoa ei löytynyt!");
		}
		catch (EOFException e) {
			System.out.println("Tiedoston lukeminen päättyi");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		return koko;
	}

	public static byte[] annaTavuina(String tiedosto) {
		FileInputStream f = null;
		byte[] taulukko = null;

		// TODO: täydennä
		try {
			f = new FileInputStream(tiedosto);
			taulukko = new byte[kerroKoko(tiedosto)];
			f.read(taulukko);
		}
		catch (FileNotFoundException e) {
			System.out.println("Tiedostoa ei löytynyt!");
		}
		catch (IOException e) {
			System.err.println(e);
		}

		return taulukko; // Palauta byte-taulukko
	}

	public static int[] annaKokonaislukuina(String tiedosto) {
		FileInputStream f = null;
		DataInputStream din = null;
		int[] taulukko = new int[kerroKoko(tiedosto)/4];

		// TODO: täydennä
		try {
			f = new FileInputStream(tiedosto);
			din = new DataInputStream(f);
			
			for (int i = 0; i < kerroKoko(tiedosto)/4; i++) {
				taulukko[i] = din.readInt();
			}
			
			din.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Tiedostoa ei löytynyt!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		return taulukko; // Palauta int-taulukko
	}


	public static void main(String args[]) {
		String tiedosto = "Luvut.bin";
		int luvut[] = { 1, 200, 3, 4, 5 };
		byte tavut[];
		int iLuvut[];

		kirjoita(luvut, tiedosto);

		System.out.println("Tiedostossa on " + kerroKoko(tiedosto) + " tavua");

		System.out.println ("Tiedoston sisältö tavuittain:");
		tavut = annaTavuina(tiedosto);
		for (int i = 0; i < tavut.length; i++) {
			System.out.print(tavut[i] + " ");
		}

		System.out.println ("\nTiedoston sisältö kokonaislukuina:");
		iLuvut = annaKokonaislukuina(tiedosto);
		for (int i = 0; i < iLuvut.length; i++) {
			System.out.print(iLuvut[i] + " ");
		}
	}

}
