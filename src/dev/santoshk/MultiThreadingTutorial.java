package dev.santoshk;

import static java.lang.Thread.sleep;

//Umashankar
class Hi extends Thread{
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hi from thread " + Thread.currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//Viswa Patel
class Hello extends Thread{
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello from thread " + Thread.currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadingTutorial {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Hi();
//        Thread t2 = new Hello();
        Thread t3 = new Hi();

        t1.setPriority(1);
        t3.setPriority(10);

//        t1.setName("UmaShankar");
//        t2.setName("Viswa Patel");
//        t3.setName("Viswa Patel");

        t1.start();
//        t2.start();
        t3.start();

        t1.join();  // wait till t1 is completed
        t3.join();  // wait till t3 is completed

        System.out.println("Bye");
    }
}