package Objekti;

import java.util.ArrayList;

class Studenti {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private ArrayList<String> prijavljeniIspiti = new ArrayList<>();
    // Metoda za dodavanje ispita u ArrayListu
    public void dodajIspit(String ispit) {
        prijavljeniIspiti.add(ispit);
    }
    public Studenti() {

    }

    //konstruktor
    public Studenti(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    //konstruktor sa 2 parametra
    public Studenti(String ime, String prezime) {
        // this.ime = ime;
        //this.prezime = prezime;
        this(ime, prezime, 5);

    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    // Getter za listu prijavljenih ispita
    public ArrayList<String> getPrijavljeniIspiti() {
        return prijavljeniIspiti;
    }

    // Setter za listu prijavljenih ispita
    public void setPrijavljeniIspiti(ArrayList<String> prijavljeniIspiti) {
        this.prijavljeniIspiti = prijavljeniIspiti;
    }
    //ispisi vrijednosti
    public String toString() {
        return "Student: " +
                ime + " " + prezime + ", broj indeksa: " + brojIndeksa +"prijavljeniIspiti" +prijavljeniIspiti;
    }





}
