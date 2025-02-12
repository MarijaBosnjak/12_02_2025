package Učilica;

public class pravokutnik {
    private double a, b;
    String naziv;

    public pravokutnik(double a, double b) {

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

