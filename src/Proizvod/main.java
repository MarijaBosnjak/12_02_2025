package Proizvod;

import java.util.ArrayList;
import java.util.Scanner;

//Kreiraj klasu Proizvod koja se sastoji od 3 vrijednosti: naziv, cijena, količina.
//Kreiraj konstruktor i metodu za prikaz informacija o proizvodu "Naziv + cijena + količina"
//Program treba unositi proizvode u ArrayList ili List dok mu ne upišemo riječ za prekid unosa.
//Nakon prekida unosa, ispiši sve proizvode
public class main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Proizvod> proizvodi = new ArrayList<>();
    while(true)

    {
        System.out.println("Unesi naziv proizvoda:");
        String naziv = sc.nextLine();
        if (naziv.equals("prekid")) {
            break;
        }
        //Unos cijene proizvod
        System.out.println("Unesi cijenu proizvoda:");
        double cijena = sc.nextDouble();
        //Unos kolicine
        System.out.println("Unesi kolicinu");
        int kolicina = sc.nextInt();
        sc.nextLine();//ciscenje buffera nakon nextDouble i nextInt

//kreiranje novog roizvoda i dodavanje u listu
        Proizvod NoviProizvod = new Proizvod(naziv, cijena, kolicina);//kreira se novi proizvod prosljedujuci unesene vrijednosti konstruktoru
        proizvodi.add(NoviProizvod);
    }
    //ispis liste proizvoda pomocu for petlje
        for (Proizvod p : proizvodi) {
            System.out.println(p.PrikazInformacija());

        }
}
}
