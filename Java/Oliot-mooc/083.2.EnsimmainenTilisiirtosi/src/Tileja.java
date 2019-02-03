
public class Tileja {

    public static void main(String[] args) {
        Tili matinTili = new Tili("Matin tili",1000);
        Tili omaTili = new Tili("Oma tili",0);
        matinTili.otto(100.0);
        omaTili.pano(100.0);
        System.out.println(matinTili);
        System.out.println(omaTili);
    }
}
