package Practice_Fall23;

interface Teacherr {
    void eat();

    void sleep();
}

interface Studentt {
    void work();
}

class Human implements Teacherr, Studentt {
    public void eat() {
        System.out.println("Teacher is eating");
    }

    public void sleep() {
        System.out.println("Teacher is sleeping");
    }

    public void work() {
        System.out.println("Student is working");
    }
}

public class RobotSystem {
    public static void main(String[] args) {
        Human robot = new Human();
        robot.eat();
        robot.sleep();
        robot.work();
    }
}
