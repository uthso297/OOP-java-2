package BLC_Problem;

public class Student extends User {
    public int studentId;

    public Student(String firstName, String lastName, String department, int age) {
        super(firstName, lastName, department, age);
    }

    @Override
    public void displayInfo() {

        System.out.println("student's ID: " + studentId);
        System.out.println("student's first name: " + firstName);
        System.out.println("student's last name: " + lastName);
        System.out.println("student's department: " + department);
        System.out.println("student's age: " + age);

    }
}
