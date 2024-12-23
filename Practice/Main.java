package Practice;

class Student {
    private String name;
    public int age = 20;
    private double grade;

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
}

public class Main {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Alice Wonderland");
        student.setGrade(95.5);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
    }

}