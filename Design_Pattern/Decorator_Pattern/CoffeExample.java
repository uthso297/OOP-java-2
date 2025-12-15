package Design_Pattern.Decorator_Pattern;

abstract class BaseCoffee {
    public abstract double getCost();

    public abstract String getDescription();

}

class Espresso extends BaseCoffee {
    @Override
    public double getCost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}

class Americano extends BaseCoffee {
    @Override
    public double getCost() {
        return 1.49;
    }

    @Override
    public String getDescription() {
        return "Americano";
    }
}

abstract class CoffeeDecorator extends BaseCoffee {
    // Empty decorator parent classs
}

class Milk extends CoffeeDecorator {
    private BaseCoffee baseCoffee;

    public Milk(BaseCoffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public double getCost() {
        return baseCoffee.getCost() + 0.25;
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription() + ", Milk";
    }
}

class Sugar extends CoffeeDecorator {
    private BaseCoffee baseCoffee;

    public Sugar(BaseCoffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public double getCost() {
        return baseCoffee.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription() + ", Sugar";
    }

}

class WhippedCream extends CoffeeDecorator {
    private BaseCoffee baseCoffee;

    public WhippedCream(BaseCoffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public double getCost() {
        return baseCoffee.getCost() + 0.75;
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription() + ", WhippedCream";
    }
}

public class CoffeExample {
    public static void main(String[] args) {
        BaseCoffee espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.getCost());

        BaseCoffee expressoFUll = new WhippedCream(new Milk(new Sugar(espresso)));
        System.out.println(expressoFUll.getDescription() + " $" + expressoFUll.getCost());
        BaseCoffee americanoFUll = new WhippedCream(new Milk(new Sugar(new Americano())));
        System.out.println(americanoFUll.getDescription() + " $" + americanoFUll.getCost());
    }
}
