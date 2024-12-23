package Practice;

interface Teacher {
    void eating();

    void sleeping();
}

interface Assistant extends Teacher {
    void assisting();
}

interface Students {
    void working();
}

class Human implements Assistant, Students {
    public void eating() {
        System.out.println("Teacher is eating");
    }

    public void sleeping() {
        System.out.println("Teacher is sleeping");
    }

    public void assisting() {
        System.out.println("Assistant is assisting");
    }

    public void working() {
        System.out.println("Student is working");
    }
}

public class RoboHelper {

    public static void main(String[] args) {
        Human robot = new Human();
        robot.eating();
        robot.sleeping();
        robot.assisting();
        robot.working();
    }

}
