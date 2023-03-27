package be.intecbrussel;

public class AnimalShelter {
    public static void main(String[] args) {


        // Maak methodes aan om het dier te laten rennen en om te stoppen of minder snel te gaan.
        // Maak een eigen methode aan speak() hier retourneer je het geluid van het dier.


        // Bonus: Maak door methode overloading nog een speak() methode aan.
        // Die de aantal keer dat je het geluidwil horen vraagt en dit uitprint.
        // TIP: gebruik StringBuilder, for loop of iets in die geest.
        // Denk eraan dat je de originele methode kunt gebruikenin de loop.


        Animal lion = new Animal();
        Animal monkey = new Animal("Gorilla", 25 );
        Animal crocodile = new Animal("Dragon", 600, 15);

        lion.speak();
        lion.speak(3);


        System.out.println();
        System.out.println();
        System.out.println();


    }


}
