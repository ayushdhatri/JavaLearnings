package Java.JavaLearnings.PART5.JavaCollection;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {
    

    @Override
    public int compare(Car obj1, Car obj2){
        // if the result of compare is positive then it will swap and the position remains the same
        return obj1.carName.compareTo(obj2.carName);// here we try tying to sort in ascending order

    }

    
}
