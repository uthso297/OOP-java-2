package Abstraction.Interface;

interface Computer {
    void code();
}

class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("Code with laptop and run");
    }
}

class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("Code with desktop and run faster");
    }
}

class Develepoer {
    public void devWeb(Computer com) {
        com.code();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Develepoer uthso = new Develepoer();
        Computer desk = new Desktop();
        Computer lap = new Laptop();
        uthso.devWeb(desk);
        uthso.devWeb(lap);
    }
}
