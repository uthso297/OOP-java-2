package Design_Pattern;

class Burger_Store {
    private final String patty;
    private final String bun;
    private final boolean cheese;
    private final boolean extraPatty;
    private final boolean egg;
    private final boolean sausage;

    private Burger_Store(Builder builder) {
        this.patty = builder.patty;
        this.bun = builder.bun;
        this.cheese = builder.cheese;
        this.extraPatty = builder.extraPatty;
        this.egg = builder.egg;
        this.sausage = builder.sausage;
    }

    static class Builder {
        private  String patty;
        private  String bun;
        private  boolean cheese;
        private  boolean extraPatty;
        private  boolean egg;
        private  boolean sausage;

        public Builder setPatty(String patty){
            this.patty = patty;
            return this;
        }
        public Builder setbun(String bun){
            this.bun = bun;
            return this;
        }
        public Builder setcheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public Builder setextraPatty(boolean extraPatty){
            this.extraPatty = extraPatty;
            return this;
        }
        public Builder setegg(boolean egg){
            this.egg = egg;
            return this;
        }
        public Builder setsausage(boolean sausage){
            this.sausage = sausage;
            return this;
        }

        public Burger_Store build(){
            return new Burger_Store(this);
        }
    }

    public void display(){
        System.out.println("Burger with " + patty + " " + bun +
        (cheese ? ",cheese" : "") +
        (extraPatty ? ",extraPatty" : "") +
        (egg ? ",egg" : "") +
        (sausage ? ",sausage" : "") 
        );
    }
}

public class SWEfourtyBuilder {
    public static void main(String[] args) {
        Burger_Store burger = new Burger_Store.Builder()
                                .setPatty("Sesame")
                                .setbun("Chicken")
                                .setcheese(true)
                                .setextraPatty(false)
                                .setegg(true)
                                .setsausage(false).build();
    burger.display();
    }
}
