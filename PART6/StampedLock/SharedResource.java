package Java.JavaLearnings.PART6.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Taken optimistic lock");
            a = 11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("updated a value successfully");
            }
            else{
                System.out.println("Rollback of work");
                a = 10;
            }
        }
        catch(Exception ex){

        }

    }
    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("Taken write lock");
        try{
            System.out.println("perfoming work");
            a = 9;
        }
        finally{
            lock.unlockWrite(stamp);
        }

    }
    
}
