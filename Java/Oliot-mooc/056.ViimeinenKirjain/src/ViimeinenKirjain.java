
import java.util.Scanner;

public class ViimeinenKirjain {


    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        char merkki = viimeinenKirjain(nimi);
        
        System.out.println("Viimeinen kirjain: " + merkki);
    }
    
    public static char viimeinenKirjain(String merkkijono) {
        char merkki = merkkijono.charAt(merkkijono.length() - 1);
        return merkki;
    }
}
