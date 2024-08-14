package collections.ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
 class Employee{
	
	 int id;
	 String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class ArrayList1 {
	
	

	public static void main(String[] args) {
//		Iterable<T>
		List<String> list = new ArrayList<>();
		
		//different way to add elements to array list
		list.add("chenna");
		list.add("balu");
		
		List<String> list2 = new ArrayList<>();
		list2.add("ramu");
		list2.add(0,"ravi");
		
		list.addAll(list2);

		List<String> list3 = new ArrayList<>();
		list3.add("kiran");
		list3.add(0,"shiva");
		list.addAll(1, list3);
		
		//get and set elements
		System.out.println("get"+list.get(0));
		list.set(0, "divya"); // set will return the element that was present before updating
		
		// sort array list
		Collections.sort(list);
		
		// user defined class objects in array list
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1,"cnd"));
		emp.add(new Employee(3, "rambo"));
		//
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		//example to remove elements
		list.remove(0);
		
//		list.remove("ramu");
		// removing all elements from arraylist
		list.removeAll(list2);
		//Removing elements on the basis of specified condition  
		list.removeIf(name->name.contains("shiva]")); //Here, we are using Lambda expression   
		
		// removing all elements from the list
		list.clear();
		
		// array list using iterator
//		Iterator s = list.iterator();
//		while(s.hasNext()) {
//			System.out.println(s.next());
//		}
		for(String i:list) {
			System.out.println(i);
		}

		
	}

}
