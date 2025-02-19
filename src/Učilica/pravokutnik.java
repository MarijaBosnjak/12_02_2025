package Učilica;

public class pravokutnik {
    private double a, b;
     private String naziv;

    public pravokutnik(String naziv, double a, double b) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
    }


    public double izracunajPovrsinu() {
        return a * b;
    }


    public double izracunajOpseg() {
        return 2 * (a + b);
    }
}

