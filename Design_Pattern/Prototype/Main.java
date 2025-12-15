package Design_Pattern.Prototype;

public class Main {
    public static void main(String[] args) {
        // our prototype object
        Student prototype = new Student("Rahim", "CSE");

        // clone it
        Student s1 = prototype.clone();
        Student s2 = prototype.clone();

        s1.show();
        s2.show();
    }
}
