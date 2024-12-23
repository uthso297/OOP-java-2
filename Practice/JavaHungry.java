package Practice;

public class JavaHungry {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5 };

        try {
            int num = 99 / 0;
            System.out.print(arr[0]);
            System.out.print("A");
            int num1 = 99 / 0;
            System.out.print("B");

        } catch (ArithmeticException ex) {
            System.out.print("C");
        } catch (NumberFormatException ex) {
            System.out.print("D");
        } catch (Exception ex) {
            System.out.println("E");
        } finally {
            System.out.print("F");
            System.out.print("G");
            System.out.print(arr[4]);
        }
    }
}
