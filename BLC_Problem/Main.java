package BLC_Problem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("AL", "Masud", "SWE", 28);
        Staff staff = new Staff("AL", "Zakir", "SWE", 30);
        Student student = new Student("Happy", "Uthso", "SWE", 21);

        teacher.teacherId = 123;
        System.out.println("\nTeacher Info: ");
        teacher.displayInfo();

        staff.staffId = 456;
        System.out.println("\nStaffeacher Info: ");
        staff.displayInfo();

        student.studentId = 297;
        System.out.println("\nStudent Info: ");
        student.displayInfo();

        teacher.allowanceOfTeacher();
        System.out.println("\nAfter allowance Teacher Info: ");
        teacher.displayInfo();

        staff.bonus();
        System.out.println("\nAfter bonus Staff Info: ");
        staff.displayInfo();
    }
}
