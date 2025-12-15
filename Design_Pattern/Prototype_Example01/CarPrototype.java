package Design_Pattern.Prototype_Example01;

public interface CarPrototype extends Cloneable{
    CarPrototype clone();
    void showDetails();
}
