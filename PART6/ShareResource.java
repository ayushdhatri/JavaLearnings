package Java.JavaLearnings.PART6;

public class ShareResource {
    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item Added by " + Thread.currentThread().getName() + " and invoking all threads which are waiting");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("ConsumeItem invoked by : " + Thread.currentThread().getName());
        while(!itemAvailable){
            try{
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now");
                wait();// it releases the monitor lock
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        System.out.println("Item Consume by " + Thread.currentThread().getName());
        itemAvailable = false;

    }

    
}
