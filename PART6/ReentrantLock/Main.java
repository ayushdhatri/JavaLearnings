package Java.JavaLearnings.PART6.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        Thread t1 = new Thread(obj::methodA, "Thread-1");
        Thread t2 = new Thread(obj::methodA, "Thread-2");

        t1.start();
        t2.start();



    }   
    
}
