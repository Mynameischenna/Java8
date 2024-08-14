package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class DeQue {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque();
		
		//stack:
//		dq.offerFirst(23);
//		dq.offerFirst(34);
//		dq.offerFirst(89);
//		dq.pollFirst();
//		System.out.println();
//		System.out.println(dq.peekLast());
//		System.out.println(dq);
//		
//		//queue
//		System.out.println("queue");
//		Deque<Integer> q = new ArrayDeque();
//		q.offerLast(98);
//		q.offerLast(76);
//		q.offerLast(35);
//		
//		q.pollLast();
//		System.out.println(q.peek());
//		
//		System.out.println(q);
		
		Stack<Integer> s = new Stack();
		
		s.push(21);
		s.push(65);
		s.push(3);
		s.push(9);
		
		System.out.println(s);
		
		
	}

}
