package Super;

public class ArrayInput {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;

        myDouble = 9.78d;
        myInt = (int) myDouble; 
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
