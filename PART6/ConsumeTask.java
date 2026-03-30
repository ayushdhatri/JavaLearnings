package Java.JavaLearnings.PART6;


public class ConsumeTask implements Runnable{
    ShareResource sharedResources;
    ConsumeTask(ShareResource sharedResources){
        this.sharedResources = sharedResources;
    }
    @Override
    public void run(){
        System.out.println("Consumer Thread : " + Thread.currentThread().getName());
        sharedResources.consumeItem();
    }

    
}
