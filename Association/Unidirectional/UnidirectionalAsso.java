package Association.Unidirectional;

/* 
 * 
 An Association represents a relationship between two classes, indicating that they are connected or linked in some way. It shows that objects of one class  can interact with objects of another class.
 * 
 * 
Association represents a "has-a" or "uses-a" relationship.

It shows that one class uses or is connected to another.

It's bidirectional by default but can be unidirectional.

Can have multiplicity (one-to-one, one-to-many, etc.).

It doesn't imply ownership (unlike Aggregation or Composition).
 * 
 * 
 * two types:
 * 1.Unidirecrional
 * 2.Bidirectrional
 * 
 * Unidirectional: One class knows about the other, but not vice versa.
 * 
 *                         UML
 * 
 *               =======================
 * 
 *      +----------------+           +----------------+
        |   Student      | --------- |    Course      |
        +----------------+           +----------------+
        | - name: String |           | - title: String|
        | - course:Course|           +----------------+
        | +displayInfo() |           
        +----------------+

 */

 // Course.java
class Course {
    private String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Student.java
 class Student {
    private String name;
    private Course course; // Association (Student "has-a" Course)

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println(name + " is enrolled in " + course.getTitle());
    }
}

//main class
public class UnidirectionalAsso {
    public static void main(String[] args) {
        Course course1 = new Course("Mathematics");
        Student student = new Student("Alice", course1);

        student.displayInfo();  // Output: Alice is enrolled in Mathematics
    }
}

// one to one relation