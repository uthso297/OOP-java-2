package Threads;

class AliveExample extends Thread {
    public void run() {
        System.out.println("Thread work...");
    }

    public static void main(String[] args) {
        AliveExample t = new AliveExample();
        System.out.println("Is alive before start? " + t.isAlive());
        t.start();
        System.out.println("Is alive after start? " + t.isAlive());
    }
}