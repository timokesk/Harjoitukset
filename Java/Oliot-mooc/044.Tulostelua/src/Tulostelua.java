
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        int a = 1;
        while (a <= maara) {
            System.out.print("*");
            a++;
        }
        System.out.print("\n");
    }

    public static void tulostaNelio(int sivunpituus) {
        int a = 1;
        while (a <= sivunpituus) {
            tulostaTahtia(sivunpituus);
            a++;
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        int a = 1;
        while (a <= korkeus) {
            tulostaTahtia(leveys);
            a++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int a = 1;
        while (a <= koko) {
            tulostaTahtia(a);
            a++;
        }
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

}
