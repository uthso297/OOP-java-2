package Association.Composition;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 
Composition is a special type of aggregation that represents a strong ownership relationship,
where the part cannot exist without the whole. If the whole is destroyed, its parts are also
destroyed.
● Represents a "strong part-of" relationship.
● The part (contained object) lives and dies with the whole.
● The part cannot exist independently of the whole.
● Depicted as a solid line with a filled diamond at the whole class's end.
Example:
In a house, the House (whole) consists of multiple Rooms (parts). If the House is demolished,
all its Rooms are also destroyed, as they cannot exist independently.

What is Composition in Java UML?
Composition is a stronger form of Aggregation.

It's a “part-of” relationship with ownership and lifecycle dependency.

Key Characteristics:
Strong ownership: The "whole" controls the "part."

If the whole is destroyed, the parts are destroyed too.

Represented in UML with a solid diamond (⬥).

Example with code:
A Library has Books.

A Book cannot exist without the Library that owns it.

If the Library is deleted, its Books are gone too.

example:

+------------------+                     +-----------------+
|    Library       | 1  <*>---- * |    Book         |
+------------------+                     +-----------------+
| - name: String   |                     | - title: String |
| - books: List<Book> |                    +-----------------+
+------------------+                     | + getTitle(): String |
| + Library(name)  |                     +-----------------+
| + addBook(title) |
| + showBooks()    |
+------------------+


============================================================================================================
============================================================================================================

Summary: Association Types
Type	        Ownership	        Lifetime       Dependency UML Symbol
Association	    ❌	               ❌	        →
Aggregation	    ✅ (weak)	       ❌	        ◇ (hollow)
Composition	    ✅ (strong)	       ✅	        ⬥ (solid)


 */

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private String name;
    private List<Book> books = new ArrayList<>(); // Composition

    public Library(String name) {
        this.name = name;
    }

    // Book creation is tightly bound to the Library
    public void addBook(String title) {
        Book book = new Book(title);
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}



public class Composition {
    public static void main(String[] args) {
        Library lib = new Library("Central");

        lib.addBook("Data Structures");
        lib.addBook("Algorithms in Java");

        lib.showBooks();

        // Books are part of Library, and can't exist independently outside
    }
}

