package Threads;

/*
Write a multithreaded program where a thread calculates and displays the square of numbers from 1 to 10. Use the Thread class to create the thread and override the run() method to perform the calculations.
Additionally, include another method in the thread class (outside the run() method) that performs a separate task, such as multiplying two numbers and showing the output of it.
*/

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square of " + i + " is " + (i * i));
        }
        multiply(5, 6);
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication of number " + a + " and " + b + " is " + (a * b));
    }
}

public class Quiz3Thread1 {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread();
        
        obj1.start();
    }
}
