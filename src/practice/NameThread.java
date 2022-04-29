package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NameThread {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            // submit the NameThread instance
            NameThreadd nt = new NameThreadd();
            executorService.execute(nt);
        }

        // Terminate the executor service
        executorService.shutdown();
    }
}

class NameThreadd extends Thread{
    public void run(){
        // get thread's name here.
        System.out.println(this.getName());
    }
}