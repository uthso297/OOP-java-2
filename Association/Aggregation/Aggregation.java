package Association.Aggregation;
import java.util.List;
import java.util.ArrayList;

/*
 * 
 * 
Aggregation is a special form of Association.
It represents a "has-a" relationship with ownership, but not strong dependency.

Think of it like: “whole–part” relationship, where the part can exist independently of the whole.

● Represents a “part of” relationship.
● The whole class contains multiple instances of the part class (*).
● Objects have independent lifetimes—the part can exist without the whole.
● Depicted as a solid line with an unfilled diamond at the whole class's end.

Exapmle: 
A Company (whole) has multiple Employees (parts). While employees belong to a company,
they can still exist if the company ceases to operate.

Example with code:
A Department has multiple Teachers.
But a Teacher can exist without the Department.

                        UML
        ==================================

+----------------+     1        +----------------+
|   Department   |<>----------->|    Teacher     |
+----------------+              +----------------+
| - deptName     |              | - name         |
| - teachers     |              +----------------+
+----------------+              | +getName()     |
| +showTeachers()|              +----------------+
+----------------+

1.The diamond (<>) at the Department end represents Aggregation.

2.Department has-a list of Teachers.

3.Teacher can exist independently of Department.


 */

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Department {
    private String deptName;
    private List<Teacher> teachers; // Aggregation

    public Department(String deptName, List<Teacher> teachers) {
        this.deptName = deptName;
        this.teachers = teachers;
    }

    public void showTeachers() {
        System.out.println("Teachers in " + deptName + " Department:");
        for (Teacher t : teachers) {
            System.out.println("- " + t.getName());
        }
    }
}



public class Aggregation {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Dr. Smith");
        Teacher t2 = new Teacher("Ms. Johnson");

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);

        Department csDept = new Department("Computer Science", teachers);
        csDept.showTeachers();

        // Teachers still exist independently
        System.out.println("Teacher: " + t1.getName() + " still exists outside the Department.");
    }
}

