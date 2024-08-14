package collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue1 {
	// queue is fifo first in first out
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList();
		q.offer(1); // alternate q.add(2);
		q.offer(2);
		q.offer(4);
		q.offer(43);
		q.offer(12);
//		System.out.println("peek element: "+q.peek()); // q.element();
//		q.poll(); // q.remove(); 
//		for(int i :q) {
//			System.out.println(i);
//		}
//		System.out.println(q.isEmpty());  
		
		Stack<Integer> s = new Stack();
		s.push(1);
		s.push(3);
		System.out.println(s.peek());
		System.out.println(s.pop()); // it will return poppped element
		
	}

}
