package Threads;

// if we use Runnable interface then we do not have to extend Thread class

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Task is running in thread: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread t = new Thread(task);
        t.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
