package Knjižara;

public class Ispis {
    public static void main(String[] args){
        Knjiga knjiga1 = new Knjiga("Pitovanje zvano igra", "Marko Babic", 15.99);
        Knjiga knjiga2 = new Knjiga("Vlak u snijegu", "Mato Lovrak", 13.99);
        knjiga1.ispisInformacija();
    }
}
