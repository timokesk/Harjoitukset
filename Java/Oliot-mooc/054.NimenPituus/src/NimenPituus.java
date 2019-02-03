
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        
        int maara = laskeKirjaimet(nimi);
        System.out.println("Kirjainmäärä: " + maara);
    }
    
    // tee tänne metodi 
    public static int laskeKirjaimet(String merkkijono) {
        int maara = merkkijono.length();
        return maara;
    }
    
}
