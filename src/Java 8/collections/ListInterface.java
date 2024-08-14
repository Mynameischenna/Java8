package collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            arr.add(i);
//            System.out.println("array capacity: " + getCapacity(arr));
        }
    }

    
}
