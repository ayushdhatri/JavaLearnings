package Java.JavaLearnings.PART5.JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(null, "Test");
        map.put(0, null);
        map.put(1, "A");
        map.put(2, "8");

        System.out.println(map.putIfAbsent(2, "6"));
        // in this case also it will push override the key-value becuase value was null
        // if the value would not have been null it would have thrown error
        for(Map.Entry<Integer, String> entryMap : map.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key : " + key + " Value is : " + value);
        }
        


        
    }
    
}
