package Threads;

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter: " + ch);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        NumberThread n = new NumberThread();
        LetterThread l = new LetterThread();

        n.start();
        l.start();
    }
}
