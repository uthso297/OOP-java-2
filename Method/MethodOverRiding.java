class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }

}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat sounds mewo mewo");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        myAnimal.sound();
        cat1.sound();
        dog1.sound();

    }
}
