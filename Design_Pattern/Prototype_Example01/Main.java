package Design_Pattern.Prototype_Example01;

public class Main {
    public static void main(String[] args) {
        Car suvPrototype = new Car("Suv", "V6 petrol", "Black");

        Car hybridEngine = (Car) suvPrototype.clone();
        hybridEngine.setEngine("Hybrid Engine");

        Car redColor = (Car) suvPrototype.clone();
        redColor.setColor("Red");

        suvPrototype.showDetails();
        hybridEngine.showDetails();
        redColor.showDetails();
    }
}
