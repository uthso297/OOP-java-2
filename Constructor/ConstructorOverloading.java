package Constructor;

class Book {
    String title;
    String author;
    double price;

    // default constructor
    Book() {
        // this("Opekkha", "Humayun Ahmed", 340.50);
        this.title = "Opeekha";
        this.author = "Humayun Ahmed";
        this.price = 340.40;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor oveloading
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();

        Book b2 = new Book("1984", "George Orwell", 200.10);
        b2.display();

        Book b3 = new Book("Brave New World", "Aldous Huxley");
        b3.display();
    }
}
