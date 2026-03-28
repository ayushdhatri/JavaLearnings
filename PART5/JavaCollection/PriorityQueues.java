package Java.JavaLearnings.PART5.JavaCollection;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer>pq = new PriorityBlockingQueue<>();
        pq.add(5);
        pq.add(7);
        pq.add(3);
        pq.add(4);
        for(int x : pq){
            System.out.println(x);
        }
        System.out.println(pq.peek());
        System.out.println(pq.remove(3));
        System.out.println("Total Elements : " + pq.size());
        pq.forEach((Integer x)-> System.out.println(x));
        if(!pq.isEmpty()) pq.poll();
        System.out.println("Total Elements : " + pq.size());
        pq.forEach((Integer x)-> System.out.println(x));

    }
    
}
