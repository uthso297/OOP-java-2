package Abstraction.Interface;

interface Vehicle {
    void startEngine();

    void stopEngine();

    default void honk() {
        System.out.println("Honk!Honk!");
    }
}

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car engine starts with a roar!");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine shuts down quietly.");
    }
}

class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The bike engine starts with a vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println("The bike engine shuts off with a gentle voom!");
    }
}

public class InterfacePractice {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.startEngine();
        car.stopEngine();

        bike.startEngine();
        bike.stopEngine();

        car.honk();
        bike.honk();
    }

}
