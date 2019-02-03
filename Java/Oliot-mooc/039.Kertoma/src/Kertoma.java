import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        int a = 1;
        int kertoma = 1;
        while(a <= luku) {
            kertoma = a*kertoma;
            a++;
        }
        
        System.out.println("Kertoma on " + kertoma);
    }
}
