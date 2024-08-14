package collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		//Adding elements
		
		list.add(1);
		list.add(23);
		list.add(1,24);
		Integer[] a = list.toArray(new Integer[0]);// arraylist to normal array
		List<Integer> list2 = new ArrayList();
//		list2.add(23);
//		list2.add(4);
////		list.addAll(list2);
//		list.addAll(1,list2);
	
//		System.out.println(list);
		
//		Accessing elements
//		list.set(0, 34);
		
		//@return {@code true} if this list contained the specified element
		System.out.println(list.remove(Integer.valueOf(1)));// this will remove element 1 not index 1
		
		
//		System.out.println(list.get(0));
//		System.out.println(list);
//		System.out.println(list.lastIndexOf(1));
		
		
	}

}
