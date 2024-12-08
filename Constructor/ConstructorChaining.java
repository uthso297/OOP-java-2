package Constructor;

class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Vehciles Constructor: " + brand + " " + model);
    }
}

class Car extends Vehicle {

    int year;

    Car(String brand, String model, int year) {
        super(brand, model);
        this.year = year;
        System.out.println("Car Constructor: " + year);

    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

}

public class ConstructorChaining {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022);
        car.display();
    }

}
