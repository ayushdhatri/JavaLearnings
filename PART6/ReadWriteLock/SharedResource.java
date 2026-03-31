package Java.JavaLearnings.PART6.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;
    ReadWriteLock lock = new ReentrantReadWriteLock();
    public void producer(){
        try{
            lock.readLock().lock();
            System.out.println("Read Lock acquired by : " + Thread.currentThread().getName());
            Thread.sleep(8000);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            lock.readLock().unlock();
            System.out.println("Read Lock released by : " + Thread.currentThread().getName());
        }
    }

    public void consume(){
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
        }
        catch(Exception ex){

        }
        finally{
            lock.writeLock().unlock();
            System.out.println("Write Lock released by : " + Thread.currentThread().getName());
        }


        
    }
    
}
