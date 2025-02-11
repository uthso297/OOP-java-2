/*
 * Here's a problem for you to tackle that will help you understand the super method in Java:
### Problem:
You are building a simple simulation for an online shopping system. The system has multiple types of user accounts:

1. **Customer**: A regular customer who can make purchases.
2. **Admin**: A user with administrative privileges who can modify the product catalog, view all orders, and perform additional actions beyond a regular customer.

Each user has a name and an account balance. Both `Customer` and `Admin` should be able to display their name and balance, but an Admin should also be able to display their role as "Administrator."

- The `Customer` class will have methods to display the name and balance.
- The `Admin` class will extend `Customer` and should add an extra functionality to display their role as "Administrator."
- The `Admin` should override the method used to display the name and balance but still call the parent class `Customer`'s method to display the name and balance.

### Requirements:
1. Create a `Customer` class with a constructor, instance variables for name and balance, and a method to display the name and balance.
2. Create an `Admin` class that extends `Customer`. Add functionality to display the "Administrator" role and override the method to display the name and balance, using `super` to call the `Customer`'s display method.
3. Write a main method where you create instances of both `Customer` and `Admin` and show the functionality of the `super` method in action.

 */

package Super;

class Customer {
    String name;
    double balance;

    public Customer() {
        System.out.println(name + balance);
    }

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void displayName() {
        System.out.println(name);
    }

    public void displayBalance() {
        System.out.println(balance);
    }
}

class Administrator extends Customer {

    public Administrator(String name, double balance) {
        super(name, balance);
    }

    String role = "Admin";

    public void displayRole() {
        System.out.println(name + " is an " + role);
    }

}

public class ShoppingSystem {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Uthso", 20.00);
        customer1.displayName();
        customer1.displayBalance();

        Administrator admin1 = new Administrator("Sihab", 200.00);
        admin1.displayName();
        admin1.displayBalance();
        admin1.displayRole();
    }
}
