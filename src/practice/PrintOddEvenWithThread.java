package practice;

/* Create two threads, one for printing odd numbers and another for printing even numbers.
 * These two threads should print all the numbers sequentially till 100. */
public class PrintOddEvenWithThread {
    static int counter = 1;


    public void printOddNumber() {
        // write logic for printing odd numbers when its turn
        synchronized (this) {
            while (counter < 100) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        // write logic for printing even numbers when its turn
        synchronized (this) {
            while (counter < 100) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        // Create 2 threads and execute them

        PrintOddEvenWithThread oddEven = new PrintOddEvenWithThread();

        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                oddEven.printEvenNumber();
            }
        });

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                oddEven.printOddNumber();
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }

}