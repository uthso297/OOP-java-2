package Practice_Fall23;

public class JavaHungry2 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5 };
        System.out.print(arr[0]);

        try {
            System.out.print("A");
            int num = 99 / 0;
            System.out.print("B");
        }

        catch (NumberFormatException ex) {
            System.out.print("C");
        }

        catch (ArithmeticException ex) {
            System.out.print("D");
        }

        catch (Exception ex) {
            System.out.print("E");
        } finally {
            System.out.print("F");
            System.out.print("G");
            System.out.print(arr[4]);
        }
    }
}
