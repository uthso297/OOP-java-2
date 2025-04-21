package Threads;

class HI extends Thread {
    // public void show(){
    public void run() {
        for (int i = 0; i <= 1; i++) {
            System.out.println("HI\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HELLO extends Thread {
    // public void show(){
    public void run() {
        for (int i = 0; i <= 1; i++) {
            System.out.println("Hello\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {

        // System.out.println("Main method\n");

        
        HI obj1 = new HI();
        HELLO obj2 = new HELLO();

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();

        System.out.println("Main method\n");

    }
}
