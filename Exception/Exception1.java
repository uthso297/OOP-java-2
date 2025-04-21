package Exception;

public class Exception1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        // String str = null;
        int nums[] = new int[5];

        try {
            j = 18 / i;
            System.out.println(nums[4]);
            // str.length();
        } 
        catch (ArithmeticException e) {
            System.out.println("Can not devide by 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of index");
        } 
        catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
