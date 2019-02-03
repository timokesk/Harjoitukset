
public class Lukutilasto {
    private int lukujenMaara;
    private int summa;
    
    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;
    }
    
    public void lisaaLuku(int luku) {
        this.lukujenMaara = this.lukujenMaara + 1;
        this.summa = this.summa + luku;
    }
    
    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }
    
    public int summa() {
        return this.summa;
    }
    
    public double keskiarvo() {
        if (this.lukujenMaara == 0) {
            return 0;
        } else {
            return (double) this.summa/this.lukujenMaara;
        }
    }
}
