package Java.JavaLearnings.PART6;

import ProducerConsumer.SharedResources;

public class ThreadCreation {
    public static void main(String[] args) {
        // MyThread1 obj1 = new MyThread1();
        // obj1.run();
        // Mythread2 obj2 = new Mythread2();
        // Thread t1 = new Thread(obj2);
        // t1.start();

        // MonitorExample obj = new MonitorExample();
        // Thread t2 = new Thread(()->{
        // obj.task1();
        // });
        // Thread t3 = new Thread(()->{
        // obj.task2();
        // });
        // Thread t4 = new Thread(()->{
        // obj.task3();
        // });

        // t2.start();
        // t3.start();
        // t4.start();
        // try {
        // Thread.sleep(11000);
        // } catch (InterruptedException e) {

        // e.printStackTrace();
        // }

        System.out.println("Main method start");
        ShareResource sharedResource = new ShareResource();
        Thread ProducerThread = new Thread(new ProduceTask(sharedResource));
        Thread consumerThread = new Thread(new ConsumeTask(sharedResource));
        ProducerThread.start();
        consumerThread.start();
      

    }

}
