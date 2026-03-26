package Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.RunTime;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundException {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(2);
        System.out.println(arr.get(3));
        /*
            Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 0
            at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
            at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            at java.base/java.util.Objects.checkIndex(Objects.java:365)
            at java.base/java.util.ArrayList.get(ArrayList.java:428)
            at Java.JavaLearnings.PART4.ExceptionalHandling.Exceptions.RunTime.IndexOutOfBoundException.main(IndexOutOfBoundException.java:9)
        */
    }
    
}
