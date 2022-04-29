package dev.santoshk;

class Counter {
    static int counter;

    public static synchronized void increment() {
        counter++;
    }
}

class Incrementer extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Counter.increment();
        }
    }
}

public class SynchronizeKeywordTutorial {
    public static void main(String... args) throws InterruptedException {
        Thread t1 = new Incrementer();
        Thread t2 = new Incrementer();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter value is " + Counter.counter);
    }
}
