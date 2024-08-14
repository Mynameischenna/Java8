package java_8_features.forEach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(6,1,2,3,4);
		Comparator< Integer> d= new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		arr.sort((a,b)->a.compareTo(b));
		System.out.println(arr);
		
		
		//enhansed for loop
//		for(Integer i :arr) {
//			System.out.println(i);
//		}
		
		Consumer<Integer> con =t-> {
				System.out.println(t);
				
		};
		arr.forEach(con);
		
//		for each loop
//		arr.forEach(i->System.out.println(i));

	}
	
	
}
