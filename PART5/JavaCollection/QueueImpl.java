package Java.JavaLearnings.PART5.JavaCollection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.forEach((Integer x) -> System.out.println(x));
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.clear();
        System.out.println(q.size());

    }
    
}
