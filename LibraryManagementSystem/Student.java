package LibraryManagementSystem;

public class Student extends User {

    private int borrowedBooks;

    public Student(String name, int id) {
        super(name, id);
        this.borrowedBooks = 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student name: " + name + "(ID: " + id + "), Books Borrowed: " + borrowedBooks);
    }

    public void borrowBooks() {
        borrowedBooks++;
    }

}
