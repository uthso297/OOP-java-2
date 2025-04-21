package Design_Pattern;

 /*
  * 
What is the Singleton Design Pattern?
The Singleton pattern ensures that:
1.Only one object of a class is created in the whole application.
2.It provides a global point of access to that object.

Why use Singleton?
1.When you want to share one instance of a class across multiple parts of a program.
2.Examples: Database connection, Logger, Configuration manager, etc.
 * 
 */

class MySingleton {
    // Step 1: Create a private static instance of the class
    private static MySingleton instance;

    // Step 2: Private constructor so no one else can create objects
    private MySingleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Step 3: Public method to provide the instance
    public static MySingleton getInstance() {
        // Create instance only if it doesn't exist
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }

    // Just a sample method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class Singleton {

    public static void main(String[] args) {
        MySingleton obj1 = MySingleton.getInstance();
        obj1.showMessage();

        MySingleton obj2 = MySingleton.getInstance();

        // Check if both objects are the same
        System.out.println(obj1 == obj2); // true
    }

}
