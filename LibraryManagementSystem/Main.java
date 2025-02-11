package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Admin admin = new Admin("Uthso", "Sihab");

        admin.addBook(library, "Opekkha", "Humayun Ahmed");
        admin.addBook(library, "Bela Furabar Age", "Arif Azad");

        Student student1 = new Student("Alex", 232);
        Teacher teacher1 = new Teacher("Dr. Smith", 201);

        System.out.println("\nAvailable Books:");
        library.showAllBooks();

        System.out.println("\nBorrowing Book...");
        Book bookToBorrow = library.findAvailableBook("Opekkha");
        if (bookToBorrow != null) {
            bookToBorrow.borrowBook();
            student1.borrowBooks();
        }

        System.out.println("\nUpdated Book List:");
        library.showAllBooks();

        System.out.println("\nUser Details:");
        student1.displayInfo();
        teacher1.displayInfo();
    }
}
