package Exception;

public class Throw {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("Handled default zero of int");

        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Sets default value and " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }

}
