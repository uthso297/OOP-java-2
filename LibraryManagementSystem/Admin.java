package LibraryManagementSystem;

public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void addBook(Library library, String title, String author) {
        library.addBook(new Book(title, author));
    }

}
