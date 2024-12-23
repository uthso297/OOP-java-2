package Practice_Fall23;

class Student{
    private String name;
    private double grade;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public double getGrade(){
        return grade;
    }
}


public class Main {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("ALice");
        student.setGrade(95.5);

        String name = student.getName();
        double grade = student.getGrade();
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);

    }

}