package Exception;

class MyOwnException extends Exception {
    public MyOwnException(String string) {
        super(string);
    }
}

public class CustomException {

    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new MyOwnException("You can not vote");
            }
        } catch (MyOwnException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }

}