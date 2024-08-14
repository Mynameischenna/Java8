package java_8_features.streams;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluation {
	
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,4,7,34,56);
		
			arr.stream()
		.filter(LazyEvaluation::filter)
		.map(LazyEvaluation::name)
		.forEach(n->System.out.println(n));
//		System.out.println(rs);
	}
	
	public static boolean filter(int a ) {
		System.out.println("hey hi");
		return a%2==0;
	}
	
	public static int name(int n) {
		System.out.println("in map");
		return n*2;
	}

}
