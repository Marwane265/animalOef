package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class Animal {


    // Maak methodes aan om het dier te laten rennen en om te stoppen of minder snel te gaan.
    // Maak een eigen methode aan speak() hier retourneer je het geluid van het dier.


    // Bonus: Maak door methode overloading nog een speak() methode aan.


    // Die de aantal keer dat je het geluid wil horen vraagt en dit uitprint.


    // TIP: gebruik StringBuilder, for loop of iets in die geest.
    // Denk eraan dat je de originele methode kunt gebruikenin de loop.


    private String name;

    private int age;

    private int speed;

    

    private static int counter = 0;

    {
        counter++;
    }


    //constructor

    public Animal() {
        this("unknown", 0, 0);

    }


    public Animal(String name) {
        this.name = name;

    }

    public Animal(String name, int age) {

        this.age = age;
        this.name = name;


    }


    public Animal(String name, int age, int speed) {

        this.age = age;
        this.name = name;
        this.speed = speed;


    }


    //getters and setters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    //eigen methode => Maak een eigen methode aan speak() hier retourneer je het geluid van het dier.
    // Maak methodes aan om het dier te laten rennen en om te stoppen of minder snel te gaan.

//    public void speak() {
//
//        Random random = new Random();
//
//        int num = random.nextInt(3);
//
//        switch (num) {
//            case 0:
//                System.out.println("stoppen");
//                break;
//            case 1:
//                System.out.println("rennen");
//                break;
//            case 2:
//                System.out.println("minder snel");
//                break;
//            default:
//                System.out.println("not a valid number");
//        }
//    }


    //Bonus:
    public void speak(int noise) {

        for (int index = 1; index <= noise; index++) {
            System.out.println("Hello, hy");

        }

    }

    public String speak() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sound");
        return sc.nextLine();

    }

    //Override methode
    @Override
    public String toString() {
        return "Animal{" +
                " name=''" + name + '\'' +
                ", age='" + age + '\'' +
                ", speed='" + speed + '\'';
    }


}





