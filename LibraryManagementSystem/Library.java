package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    public Book findAvailableBook(String title) {
        for (Book book : books) {
            if (book.isAvailable() && book.getTitle().equals(title)) {
                return book; 
            }
        }
        return null; 
    }
}
