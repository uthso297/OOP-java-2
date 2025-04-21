package Design_Pattern;

/*
Builder Design Pattern (in Java)
What is it?
The Builder Pattern helps you create complex objects step-by-step, without writing messy constructors (those long ones with many parameters).

public class Burger {
    Burger(String bun, String patty, boolean cheese, boolean lettuce, boolean tomato, boolean mayo, boolean ketchup) {
        // Ugh, this is hard to read & use!
    }
}

solution is builder pattern
Burger burger = new Burger.Builder()
                   .setBun("Sesame")
                   .setPatty("Beef")
                   .setCheese(true)
                   .setLettuce(true)
                   .setTomato(false)
                   .build();

 */

class Burger {
    private final String bun;
    private final String patty;
    private final boolean cheese;
    private final boolean lettuce;

    private Burger(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
    }

    static class Builder {
        private String bun;
        private String patty;
        private boolean cheese;
        private boolean lettuce;

        public Builder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public Builder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public Builder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder setLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }

    }

    public void display() {
        System.out.println("Burger with " + bun + " bun, " + patty + " patty" +
                (cheese ? ", cheese" : "") +
                (lettuce ? ", lettuce" : ""));
    }
}

public class Builder_Pattern {

    public static void main(String[] args) {
        Burger myBurger = new Burger.Builder()
                .setBun("Sesame")
                .setPatty("Chicken")
                .setCheese(true)
                .setLettuce(true)
                .build();
        myBurger.display();

        Burger myBurger2 = new Burger.Builder()
                .setBun("Sesame")
                .setPatty("Chicken")
                .setCheese(true)
                .setLettuce(false)
                .build();
        myBurger2.display();
    }

}
