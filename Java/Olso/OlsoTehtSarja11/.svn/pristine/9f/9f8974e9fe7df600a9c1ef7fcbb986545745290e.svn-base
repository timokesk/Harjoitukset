 
import java.util.Scanner;
import model.*;

public class TekstiMain {
	static ValuuttaAccessObject valuuttaDAO = new ValuuttaAccessObject();
	static Scanner scanner = new Scanner(System.in);
	
	public static void listaaValuutat() {
		Valuutta[] valuutat = valuuttaDAO.readValuutat();
		for (int i = 0; i < valuutat.length; i++) {
			System.out.println(valuutat[i].getTunnus() + " " + valuutat[i].getVaihtokurssi() + " " + valuutat[i].getNimi());
		}
	}
	
	public static void lisääValuutta() {
		System.out.print("Anna valuutan tunnus: ");
		String tunnus = scanner.nextLine();
		System.out.print("Anna valuutan vaihtokurssi: ");
		double vaihtokurssi = Double.parseDouble(scanner.nextLine());
		System.out.print("Anna valuutan nimi: ");
		String nimi = scanner.nextLine();
		Valuutta valuutta = new Valuutta(tunnus, vaihtokurssi, nimi);
		valuuttaDAO.createValuutta(valuutta);

	}
	
	public static void päivitäValuutta() {
		System.out.print("Anna päivitettävän valuutan tunnus: ");
		String tunnus = scanner.nextLine();
		System.out.print("Anna valuutan uusi vaihtokurssi: ");
		double vaihtokurssi = Double.parseDouble(scanner.nextLine());
		System.out.print("Anna valuutan uusi nimi: ");
		String nimi = scanner.nextLine();
		Valuutta paivitetty = new Valuutta(tunnus, vaihtokurssi, nimi);
		valuuttaDAO.updateValuutta(paivitetty);
	}
	
	public static void poistaValuutta() {
		System.out.print("Anna poistettavan valuutan tunnus: ");
		String tunnus = scanner.nextLine();
		valuuttaDAO.deleteValuutta(tunnus);
	}

	public static void main(String[] args) {
		char valinta;
		final char CREATE = 'C', READ = 'R', UPDATE = 'U', DELETE = 'D', QUIT = 'Q';

		do {
			System.out.println("C: Lisää uusi valuutta tietokantaan");
			System.out.println("R: Listaa tietokannassa olevien valuuttojen tiedot");
			System.out.println("U: Päivitä valuutan vaihtokurssi tietokantaan");
			System.out.println("D: Poista valuutta tietokannasta");
			System.out.println("Q. Lopetus");
			System.out.print("Valintasi: ");
			
			valinta = (scanner.nextLine().toUpperCase()).charAt(0);
			switch (valinta) {
			case CREATE:
				lisääValuutta();
				break;
			case READ:
				listaaValuutat();
				break;
			case UPDATE:
				päivitäValuutta();
				break;
			case DELETE:
				poistaValuutta();
				break;
			}
		} while (valinta != QUIT);
	}
}
