package Java.JavaLearnings.PART6.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public  class SharedResource {
    public final ReentrantLock lock = new ReentrantLock();

    public void methodA(){
        try{
            lock.lock();
            System.out.println("Thread Acquired by : " + Thread.currentThread().getName() + " and its count is  : " + lock.getHoldCount());
            methodB();
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        finally{    
            lock.unlock();
            System.out.println(Thread.currentThread().getName() 
                + " released lock in methodA | hold count: " 
                + lock.getHoldCount());
        }

    }

    public void methodB(){
        try{
            lock.lock();
            System.out.println("Thread Acquired by : " + Thread.currentThread().getName() + " and its count is  : " + lock.getHoldCount());
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        finally{    
            lock.unlock();
            System.out.println(Thread.currentThread().getName() 
                + " released lock in methodB | hold count: " 
                + lock.getHoldCount());
        }

    }

    
}
