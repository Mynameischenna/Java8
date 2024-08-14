package collections.queue;

import java.util.PriorityQueue;

public class customeOrdering {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> s = new PriorityQueue<>((a,b)->b-a);
		
		s.offer(25);
		s.offer(45);
		s.offer(12);
		s.offer(7);
		
		while(!s.isEmpty()){
			System.out.println(s.poll());
		}
		
		// bascially you by default its following natural ordering
		//how to do custome ordering? you can do thsi by comparators compare method priorityqueue constructor takes object of comparator 
		//so we are defined lambdas bc of its afunctionl interface
		
		PriorityQueue<StudentMarks> sma = new PriorityQueue<>((s1,s2)->s2.getMmarks()-s1.getMmarks());
		sma.offer(new StudentMarks(23, 432));
		sma.offer(new StudentMarks(233, 434));
		sma.offer(new StudentMarks(213, 445));
		sma.offer(new StudentMarks(24, 42));
		sma.offer(new StudentMarks(298, 43));
		
		int index=0;
		while(!sma.isEmpty()) {
			if(index==2) {
				return;
			}
			System.out.println(sma.poll());
			index++;
		}
		
		
	}

}
