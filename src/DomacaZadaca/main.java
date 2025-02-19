package DomacaZadaca;
//String[] imena = {"mara", "pero"};
//String[] prezimena = {"Marić", "perić"};
//Kreirati petlju koja će uzimati imena i prezime i skombinirati ih u random imena.
public class main {

        public static void main(String[] args) {
            String[] imena = {"Mara", "Pero", "Ana", "Ivan"};
            String[] prezimena = {"Marić", "Perić", "Jurić", "Kovačević"};

            RandomImena generator = new RandomImena(imena, prezimena);

            for (int i = 0; i < 5; i++) { // Generišemo 5 slučajnih imena
                System.out.println(generator.generirajIme());
            }
        }

}
