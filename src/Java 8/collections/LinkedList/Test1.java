package collections.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<Integer>();
		int a[]= {23,4,5,6};
		System.out.println(Arrays.toString(a));
		ll.add(23);
		ll.add(45);
		ll.add(47);
		ll.add(1,37);
		ll.remove(Integer.valueOf(37));// deleteing by element not by index
		System.out.println("element is "+ll.get(2));
		System.out.println(ll.set(1, 99));
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(37));
		System.out.println(ll);
	}

}
