package Java.JavaLearnings.PART5.JavaCollection;

import java.util.ArrayDeque;

public class StackImpl {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.push(3);
        dq.push(4);
        dq.push(5);
        dq.forEach((Integer x)-> System.out.println(x));
        while(!dq.isEmpty()){
            System.out.println(dq.peek());
            dq.pop();
        }
        System.out.println(dq.size());
    }
    
}
