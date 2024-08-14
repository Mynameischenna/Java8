package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// lowest number has highest priority
		pq.offer(12);
		pq.offer(23);
		pq.offer(3);
		pq.offer(3); 
		pq.offer(39);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

		
		// using cutome object , you need to implement comparable interface ,it wil check if there is compareTo ( method the i t wil call that method
		
		PriorityQueue<StudentMarks> s = new PriorityQueue<StudentMarks>();
		
		s.offer(new StudentMarks(10, 230));
		s.offer(new StudentMarks(110, 30));
		s.offer(new StudentMarks(109, 280));
		
		
		while(!s.isEmpty()) {
			System.out.println(s.poll());
		}
		
		// second way
		// coparator has   more presidency over comparable , now it wont follow the order of integer class (natural ordering) ,it follow the comparator class (total ordering) 
//		PriorityQueue<Integer> s1 = new PriorityQueue<>((a,b)->b-a);
//		
//		s1.offer(23);
//		s1.offer(32);
//		s1.offer(45);
//		s1.offer(3);
//		
//		
//		while(!s1.isEmpty()) {
//			System.out.println(s1.poll());
//		}
		
//	comparator for studentmarks class	 
//PriorityQueue<StudentMarks> s = new PriorityQueue<>((a,b)->b.getMmarks()-a.getMmarks());
//		
//s.offer(new StudentMarks(10, 230));
//s.offer(new StudentMarks(110, 30));
//s.offer(new StudentMarks(109, 280));
//
//		
//		
//		while(!s.isEmpty()) {
//			System.out.println(s.poll());
//		}
//		
	}

}
