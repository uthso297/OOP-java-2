package Constructor;

class Person {
    String name;
    int age;

    Person() {
        // Setting default values
        this.name = "Unknown";
        this.age = 0;
    }

    Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

}

public class BasicConstructor {
    public static void main(String[] args) {
        // default
        Person p1 = new Person();
        p1.display();
        // parameterized
        Person p2 = new Person("Uthso", 23);
        p2.display();
    }
}
