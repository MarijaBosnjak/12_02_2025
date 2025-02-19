package Ucenik;

public class Ucenik {
   private String ime;
    private int BrojGodina;
    private int[] ocjene;
    public Ucenik(String ime,int BrojGodina, int ocjena1,int ocjena2, int ocjena3) {
        this.ime = ime;
        this.BrojGodina = BrojGodina;
        this.ocjene = new int[] {ocjena1, ocjena2, ocjena3};
    }
    public double prosjekOcjena() {
        return (ocjene[0] + ocjene[1] + ocjene[2]) / 3.0;
    }
    public String ispisPodataka() {
        return "Ime: " + ime + "\n" +
                "Godine: " + BrojGodina + "\n" +
                "Prosjek ocjena: " + prosjekOcjena();
    }
}
