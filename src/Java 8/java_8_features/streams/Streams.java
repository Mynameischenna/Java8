package java_8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		
		List<Integer> arr = Arrays.asList(1,6,3,8,5,4);
		
//		Stream<Integer> data =arr.stream();// converting normal list to stream 
//		Stream<Integer> sort=data.sorted();//sorted method created new stream
//		Stream<Integer> a=sort.map(n->n*2);//map methods created new stream
//		// now we get 3 streams which is not a best practise to do
//		a.forEach(n ->System.out.println(n));
		
		int res = arr.stream()
				.sorted()
				.filter(n->n%2==1)
				.map(n->n*2)
				.reduce(0,(a,b)->a+b); // initial value to add with first number 
//		2,4,8
//		2+initial value = 2+0(in our case)
//		2+4=6
//		6+8=14
		System.out.println(res);
	}

}
//parallel streams - use mutli threading to do operations 