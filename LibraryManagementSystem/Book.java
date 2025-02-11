package LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        this.isAvailable = false;
    }

    public void returnBook() {
        this.isAvailable = true;
    }

    public void displayBookInfo() {
        System.out.println("Book: " + title + " by " + author + " (Available: " + isAvailable + ")");
    }
}
