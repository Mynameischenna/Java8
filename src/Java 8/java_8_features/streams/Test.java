package java_8_features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//import java.util.stream.Collector;

public class Test {  
  
    public static void main(String[] args) {  
    	
    	 List<Integer> arr = Arrays.asList(1, 2, 2, 4, 5, 6, 7, 8, 8, 10);
    	 arr.stream()
    	 .sorted(Comparator.reverseOrder());
    	 
    	 		
    }  
}  