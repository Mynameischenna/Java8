package collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test1 {
	public static void main(String[] args) {
		
		
		List<Integer> l = new ArrayList();
		l.add(123);
		l.add(67);
		l.add(45);
		l.add(2);
		Queue<StudentMarks> q = new PriorityQueue<>((s1,s2)->s1.getMmarks()-s2.getMmarks());
		q.offer(new StudentMarks(23,99));
		q.offer(new StudentMarks(29,9));
		q.offer(new StudentMarks(33,87));
		for(int i=0;i<3;i++) {
			System.out.println(q.poll());
		}
		
	}
}

