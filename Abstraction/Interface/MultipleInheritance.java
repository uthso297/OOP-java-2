package Abstraction.Interface;

interface Animals {
    void walk();
}

interface Herbivore {
    void eat();
}

class Horses implements Animals, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    public void eat() {
        System.out.println("Horse eat grass");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Horses horse = new Horses();
        horse.walk();
        horse.eat();
    }

}
