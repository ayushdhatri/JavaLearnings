package Java.JavaLearnings.PART5.JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Collection {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);

        System.out.println("size " + values.size());
        System.out.println("isEmpty : " + values.isEmpty());
        System.out.println("contains : 3 or not : " + values.contains(3));
        
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(4);
        stackValues.add(5);
        stackValues.add(6);

        values.addAll(stackValues);
        values.forEach((Integer val) -> System.out.println(val));
        values.clear();
        System.out.println(values.size());
        
        
    }
    
}
