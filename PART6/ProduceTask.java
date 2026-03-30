package Java.JavaLearnings.PART6;

import ProducerConsumer.SharedResources;

public class ProduceTask implements Runnable {
    ShareResource sharedResource;
    ProduceTask(ShareResource sharedResources){
        this.sharedResource = sharedResources;
    }
    @Override
    public void run(){
        System.out.println("Producer Thread : " + Thread.currentThread().getName());
        try{
            Thread.sleep(5000l);
        }
        catch(Exception ex){

        }
        sharedResource.addItem();


    }


    
}
