package DomacaZadaca;

import java.util.Random;

public class RandomImena {
    private String[] imena;
    private String[] prezimena;
    private Random rand;
    public RandomImena(String[] imena, String[] prezimena){//konstruktor kroz koji primamo randomImena i prezimena
        this.imena=imena;
        this.prezimena=prezimena;
        this.rand=new Random();
    }
    public String generirajIme(){
        String randomIme=imena[rand.nextInt(imena.length)];
        String randomPrezime=prezimena[rand.nextInt(prezimena.length)];
        return randomIme +" " +randomPrezime;
    }
}
