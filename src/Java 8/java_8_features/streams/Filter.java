package java_8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3,7,4,9,5);
		Predicate<Integer> pred = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				
				return t%2==1;
			}
		};
		
		arr.stream()
				.filter(pred)
				.forEach(n->System.out.println(n));

	}

}
//this is how filter work internally