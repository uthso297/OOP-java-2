package Exception;

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Exception.Throw");
        System.out.println("Found");
    }
}

public class DuckingException {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
