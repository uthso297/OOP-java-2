package Threads;

class InterruptExample extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Woke up normally");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }

    public static void main(String[] args) {
        InterruptExample t = new InterruptExample();
        t.start();
        t.interrupt();  // interrupts during sleep
    }
}

