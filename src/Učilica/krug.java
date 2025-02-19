package Učilica;

import static java.lang.Math.PI;

public class krug {
    private double r;
   private String naziv;

    public krug(String naziv,double r){
        this.naziv=naziv;
        this.r=r;
    }
    public double izracunajOpseg(){
        return 2*Math.PI * r;
    }
   /* public double IzracunajPovrsinu(){
        double  Math.PI * r * r;

    }*/

}