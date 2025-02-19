package Učilica;

public class trokut {
    private double a,b,c;
   private String naziv;
    public trokut(String raznostranicniTrokut, double a, double b, double c){
        this.naziv=naziv;
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double izracunajOpseg(){
        return a+b+c;
    }
    public double IzracunajPovrsinu(){
        double s=(a+b+c)/2;
         return s;
    }
}
