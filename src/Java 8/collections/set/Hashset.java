package collections.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import collections.queue.StudentMarks;

public class Hashset {
	public static void main(String[] args) {
//		Set<Integer> s = new HashSet();
//		s.add(1);
//		s.add(5);
//		s.add(7);
//		s.add(4);
//		s.add(1);
//		s.add(9);
//		System.out.println(s.add(4));
//		
//		System.out.println(s);
		
		
		
		// hashset for cutome object
		Set<StudentMarks> s = new HashSet();
		StudentMarks s1 = new StudentMarks(23, 9);
		s.add(new StudentMarks(23, 21));
		s.add(new StudentMarks(73, 28));
		s.add(new StudentMarks(63, 01));
		s.add(s1);
		System.out.println(s.contains(s1));
		
		


	}

}

// it doesnt follow insertion order and any sorted order, it will randomly display elements.
//hashset internally uses hashmap, basically add(E e) takes some element ,
// the add(E e ) method implementatin in hashset class
//private transient HashMap<E,Object> map;
//private final Object obj = new Object();
//public boolean add(E e ) {
//	return map.put(e,obj)==null;// if element already there it will update the current value and return old value
//	
//	key |value
//	
//	"tom"|20
//	"dol"|28
//	"res"|21
//	"fr"|22
//	
//	for example: add("fr");now what it will do is put method will; check if thsi key already presents or not in our case its present
//	so its update value the value and return the old value . if key is npot there means there value is null right so it wil return null
//			
//private boolean remove(E e) {
//		return map.remove(e)==obj;
//	}
//	
//	remove("tom"); removes tom key and return value;
