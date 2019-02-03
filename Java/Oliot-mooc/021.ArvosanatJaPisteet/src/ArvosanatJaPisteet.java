
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna pisteet [0-100]: ");
        int arvosana = Integer.parseInt(lukija.nextLine());
        
        if (arvosana > 100) {
            System.out.println("Arvosana: uskomatonta!");
        } else if (arvosana > 89) {
            System.out.println("Arvosana: 5");
        } else if (arvosana > 74) {
            System.out.println("Arvosana: hyväksytty");
        } else if (arvosana > -1) {
            System.out.println("Arvosana: hylätty");
        } else {
            System.out.println("Arvosana: mahdotonta!");
        }

    }
}
