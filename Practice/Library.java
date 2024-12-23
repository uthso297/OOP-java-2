package Practice;

class Book {
    String title;

    public Book() {

    }

    public Book(String title) {
        this.title = title;
    }

    public void read() {
        System.out.println("Reading the Book: " + title);
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
    }
}

class FictionBooks extends Book {
    String genre;

    public FictionBooks(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public void read() {
        System.out.println("Getting lost in the world of friction");
    }

    public void borrow() {
        System.out.println("Borrowing the  fiction book: " + title);
    }

    public void returnBook() {
        System.out.println("Returning the fiction book: " + title);
    }
}

class NonFictionBook extends Book {
    String topic;

    public NonFictionBook(String title, String topic) {
        this.title = title;
        this.topic = topic;
    }

    @Override
    public void read() {
        System.out.println("Explore the realm of non fiction");
    }

    public void borrow() {
        System.out.println("Borrowing the  non fiction book: " + title);
    }

    public void returnBook() {
        System.out.println("Returning the non fiction book: " + title);
    }

}

public class Library {
    public static void main(String[] args) {
        Book myBook = new Book("Java Programming");
        myBook.read();

        FictionBooks mysteryBook = new FictionBooks("The da vinci book", null);
        mysteryBook.read();
        mysteryBook.borrow();

        NonFictionBook historyBook = new NonFictionBook("A brief history of humankind", null);
        historyBook.read();
        historyBook.returnBook();
    }
}
