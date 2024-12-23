package Practice;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class LibrarySystem {

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 years old to borrow books");
        } else {
            System.out.println("Age is valid for borrowing");
        }
    }

    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();
        try {
            system.checkAge(19);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        LibrarySystem system1 = new LibrarySystem();
        try {
            system1.checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
