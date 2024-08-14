package collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		
		// adding elements
		names.add("ramesh");
		names.add("bablu");
		names.add("ramesh");
//		names.addFirst("rambo");
//		names.addLast("reddy");
		names.add("sur");
		
		System.out.println("names "+names.size());
		
		// removing
//		names.remove();// removes first element
//		names.remove(1);
//		names.remove("ramesh");
//		names.removeFirst();
//		names.removeLast();
//		names.removeLastOccurrence("ramesh");
		
		
		// to print in reverse order
		Iterator i = names.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		names.set(0, "bob");
		
		Iterator<String> itr = names.iterator();
		
		ListIterator<String> n = names.listIterator();
		while(n.hasPrevious()) {
			System.out.println("prev"+n.previous());
		}
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
