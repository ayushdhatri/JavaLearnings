package Java.JavaLearnings.PART6.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class DeliveryAgentLocation {
    private final StampedLock lock = new StampedLock();
    private double currentX;
    private double currentY;

    // writer the agent phone updates the location
    public void updateLocation(double newX, double newY){
        long stamp = lock.writeLock();
        try{
            this.currentX = newX;
            this.currentY = newY;
        }
        finally {
            lock.unlockWrite(stamp);
        }
    }

    public long calculateLocation(){
        long stamp  = lock.tryOptimisticRead();
        double localX = currentX;
        double localY = currentY;
        if(!lock.validate(stamp)){
            long readstamp = lock.readLock();
            try{
                localX = currentX;
                localY = currentY;
            }
            finally{
                lock.unlockRead(readstamp);
            }
        }
        return (long) Math.sqrt((localX * localX) + (localY * localY));


    }



    
}
