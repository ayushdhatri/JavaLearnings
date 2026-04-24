package Java.JavaLearnings.PART5.JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Iterators {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);values.add(2);values.add(3);values.add(4);
        System.out.println("Iterating the vlaues using iterator method");
        Iterator<Integer> valuesIterator = values.iterator();
        System.out.println("Before Deleting element the size of the array is : " + values.size());
        while (valuesIterator.hasNext()){
            int val = valuesIterator.next();
            System.out.println(val);
            if(val == 3){
                valuesIterator.remove();
            }
            
        }
          System.out.println("After Deleting element the size of the array is : " + values.size());
        valuesIterator = values.iterator();
        while (valuesIterator.hasNext()){
            int val = valuesIterator.next();
            System.out.println(val);
        }

        // which ever class is child of iterable has the for-each loop avaialble
        for(int val : values){
            System.out.println(val);
        }

        // 3rd way of traversing is using forEachMethod
        values.forEach((Integer val)-> System.out.println(val));
        


        
    }
    
}
