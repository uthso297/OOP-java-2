package Design_Pattern.Prototype;

public class Student implements Cloneable {
    private String name;
    private String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // cloning logic
    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void show() {
        System.out.println("Name: " + name + ", Dept: " + department);
    }
}
