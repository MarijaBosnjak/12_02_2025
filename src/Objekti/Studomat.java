package Objekti;

public class Studomat {
    public static void main(String[] args) {
        Studenti student1 = new Studenti("Jurica", "Dragić", 22);
        Studenti student2 = new Studenti("Barbara", "Kolak", 33);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student2.getIme());
        student2.setIme("Ružica");
        System.out.println(student2.getIme());
        System.out.println(student1.getPrezime());
        student1.setPrezime("Runjiiic");
        System.out.println(student1.getPrezime());
        student1.dodajIspit("Matematika");
        student1.dodajIspit("Fizika");

        student2.dodajIspit("Biologija");
        student2.dodajIspit("Informatika");

        // Ispis podataka o studentima i njihovim prijavljenim ispitima
        System.out.println(student1);


        System.out.println(student2);


    }
}
