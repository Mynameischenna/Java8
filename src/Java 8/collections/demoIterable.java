package collections;

import java.util.ArrayList;
import java.util.List;

public class demoIterable {
	public static void main(String[] args) {
		List<Integer> s = new ArrayList();
		int[] arr = {-1,-100,3,99};
		for(int i :arr) {
			s.add(i);
		}
		int n=2;
		int las;
		for(int i=0;i<n;i++) {
			
			s.add(0,s.remove(6));
			System.out.println(s);
		}
		
		System.out.println(s);
		
	}

}
