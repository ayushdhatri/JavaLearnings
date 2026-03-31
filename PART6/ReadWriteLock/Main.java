package Java.JavaLearnings.PART6.ReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sh = new SharedResource();
        Thread t1 = new Thread(()->{
            sh.producer();
        });
        Thread t2 = new Thread(()->{
            sh.producer();
        });
        Thread t3 = new Thread(()->{
            sh.consume();
        });
        t1.start();
        t2.start();
        t3.start();

    }
    
}
