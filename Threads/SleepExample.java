package Threads;

class SleepExample extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i);
            // we have to do either throws InterruptedException or try catch to call sleep
            try {
                Thread.sleep(3000); // sleep for 3 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted during sleep");
            }
        }
    }

    public static void main(String[] args) {
        SleepExample s = new SleepExample();
        s.start();
    }
}
