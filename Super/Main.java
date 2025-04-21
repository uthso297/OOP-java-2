package Super;

// Superclass
class Person {
    String name;

    // Default constructor
    public Person() {
        System.out.println("Person constructor called.");
    }

    // Parameterized constructor
    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor with parameter called.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Subclass
class Employee extends Person {
    int salary;

    // Using super() to call the superclass constructor
    public Employee() {
        
        System.out.println("Employee constructor called.");
    }

    // Using super(parameter) to call the parameterized constructor of Person
    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void showDetails() {
        super.displayInfo(); // Calling superclass method using super
        System.out.println("Salary: $" + salary);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("---- Default Constructor Example ----");
        Employee emp1 = new Employee(); // Calls super()

        System.out.println("\n---- Parameterized Constructor Example ----");
        Employee emp2 = new Employee("John", 5000); // Calls super(parameter)
        emp2.showDetails();
    }
}

