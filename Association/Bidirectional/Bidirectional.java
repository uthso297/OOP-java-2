package Association.Bidirectional;

/*
 *Bidirectional: Both classes hold references to each other — they both "know about" one another.
 *                           UML
 *          =====================================
 *              +----------------+          *        +----------------+
                |   Student      |------------------>|     Course     |
                +----------------+                   +----------------+
                | - name: String |<------------------| - title: String|
                | - course:Course|       1           | - students: List<Student> |
                +----------------+                   +----------------+
                | +enroll()      |                   | +addStudent()  |
                | +getName()     |                   | +listStudents()|
                +----------------+                   +----------------+


1.Student has 1 Course

2.Course has multiple Students (*)

3.Arrows go both ways = Bidirectional Association...(the arrow has no indicating sign.It is depicted as a solid line connecting the two classes in a class diagram.
)
 */

 import java.util.ArrayList;
 import java.util.List;
 
 class Course {
     private String title;
     private List<Student> students;
 
     public Course(String title) {
         this.title = title;
         this.students = new ArrayList<>();
     }
 
     public String getTitle() {
         return title;
     }
 
     public void addStudent(Student student) {
         students.add(student);
     }
 
     public void listStudents() {
         System.out.println("Students enrolled in " + title + ":");
         for (Student s : students) {
             System.out.println("- " + s.getName());
         }
     }
 }
 

  class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course course) {
        this.course = course;
        course.addStudent(this); // Notify Course of enrollment
    }

    public String getName() {
        return name;
    }

    public void displayCourse() {
        if (course != null) {
            System.out.println(name + " is enrolled in " + course.getTitle());
        } else {
            System.out.println(name + " is not enrolled in any course.");
        }
    }
}


public class Bidirectional {
    public static void main(String[] args) {
        Course math = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.enroll(math);
        bob.enroll(math);

        alice.displayCourse();  // Alice is enrolled in Mathematics
        bob.displayCourse();    // Bob is enrolled in Mathematics

        math.listStudents();
        // Output:
        // Students enrolled in Mathematics:
        // - Alice
        // - Bob
    }
}

// many to one  ===> student to course