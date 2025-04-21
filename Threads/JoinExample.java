package Threads;

class JoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("From thread: " + i);
        }
    }

    public void print(){
        System.out.println("Printing....");
    }
    // we have to do either throws InterruptedException or try catch to call join

    // using throws InterruptedException
    
    // public static void main(String[] args) throws InterruptedException {
    // JoinExample t = new JoinExample();
    // t.start();
    // t.join(); // main thread waits for t to finish
    // System.out.println("Main thread resumes after join");
    // }

    // using try catch
    public static void main(String[] args) {
        JoinExample t = new JoinExample();
        t.print();
        t.start();
        try {
            t.join();  // it means Wait for t1 to finish
            // main thread waits for t to finish
            // Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main thread resumes after join");
    }
}
