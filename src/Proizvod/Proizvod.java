package Proizvod;
//Kreiraj klasu Proizvod koja se sastoji od 3 vrijednosti: naziv, cijena, količina.
//Kreiraj konstruktor i metodu za prikaz informacija o proizvodu "Naziv + cijena + količina"
//Program treba unositi proizvode u ArrayList ili List dok mu ne upišemo riječ za prekid unosa.
//Nakon prekida unosa, ispiši sve proizvode
public class Proizvod {
    private String naziv;
    private double cijena;
    private int kolicina;

    public Proizvod(String naziv,double cijena,int kolicina){
   this.naziv=naziv;
   this.cijena=cijena;
   this.kolicina=kolicina;
    }
    public String PrikazInformacija(){
        return "Naziv proizvoda je :" +naziv + "\t" +"cijena je:" +cijena+
                "\t"+ "Kolicina je:" +kolicina ;
    }
}
