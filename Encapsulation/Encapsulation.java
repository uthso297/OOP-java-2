package Encapsulation;

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Person obj1 = new Person();
        obj1.setName("Alice");
        System.out.println(obj1.getName());
        obj1.setAge(23);
        System.out.println(obj1.getAge());

    }

}
