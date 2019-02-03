
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mihin asti? ");
        int loppu = Integer.parseInt(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int alku = Integer.parseInt(lukija.nextLine());
        
        while (alku <= loppu) {
            System.out.println(alku);
            alku++;
        }
    }
}
