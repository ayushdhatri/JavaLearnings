package Java.JavaLearnings.PART5.JavaCollection;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeImpl {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> dq = new ConcurrentLinkedDeque();
        // first simply push the element
        dq.addFirst(1);
        // lets try to add elements after 1
        dq.addLast(2);

        // Lets try to add element before 1
        dq.addFirst(3);
        dq.forEach((Integer x) -> System.out.println(x));
        System.out.println("first element of the deque : " + dq.peekFirst());
        System.out.println("Last element of the deque : " + dq.peekLast());
        


    }
    
}
