package Design_Pattern.Prototype_Example01;

public class Car implements CarPrototype {
    private String model;
    private String engine;
    private String color;

    public Car(String model, String engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public CarPrototype clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            // e.printStackTrace();
            // return null;
            throw new AssertionError();
        }
    }

    public void showDetails() {
        System.out.println("Model: " + model + " Engine: " + engine + " Color: " + color);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
