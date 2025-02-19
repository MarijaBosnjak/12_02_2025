package Knjižara;

public class Knjiga {
    String naziv;
    String autor;
    double cijena;

    public Knjiga(String naziv, String autor, double cijena) {
        this.naziv=naziv;
        this.autor=autor;
        this.cijena=cijena;

    }
    public void ispisInformacija() {
        System.out.println("Naziv knjige: " + naziv);
        System.out.println("Autor: " + autor);
        System.out.println("Cijena: " + cijena + " kn");
    }
}