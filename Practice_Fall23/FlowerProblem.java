package Practice_Fall23;

abstract class Flower {

    abstract public void petals();

    public void color() {
        System.out.println("All flowers have colour");
    }
}

class Jasmine extends Flower {

    public Jasmine() {
        System.out.println("Jasmine petals are edible");
    }

    public void petals() {
        System.out.println("Petals of jasmine mosturize our skin");
    }

    public void color() {
        System.out.println("The color jasmine is a plate tint of yellow");
    }
}

public class FlowerProblem {
    public static void main(String[] args) {
        Jasmine jas = new Jasmine();
        jas.color();
        jas.petals();
    }
}
