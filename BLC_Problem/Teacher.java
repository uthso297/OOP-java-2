package BLC_Problem;

public class Teacher extends User {
    public int teacherId;
    private double teacherSalary;

    public Teacher(String firstName, String lastName, String department, int age) {
        super(firstName, lastName, department, age);
        this.teacherSalary = 50000.00;
    }

    @Override
    public void displayInfo() {

        System.out.println("Teacher's ID: " + teacherId);
        System.out.println("Teacher's first name: " + firstName);
        System.out.println("Teacher's last name: " + firstName);
        System.out.println("Teacher's department: " + department);
        System.out.println("Teacher's age: " + age);
        System.out.println("Teacher's salary: " + teacherSalary);

    }

    public double allowanceOfTeacher() {
        teacherSalary = (teacherSalary + ((teacherSalary * 10) / 100)) * 12;
        return teacherSalary;
    }
}
