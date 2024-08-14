package Strings;

public class stringBuffer {
	public static void main(String[] args) {
//		3 types of constructors
//		1)default
		StringBuffer s1 = new StringBuffer("chenna");
//		2)parameterised const
		StringBuffer s2 = new StringBuffer("chenna");
//		3)capacity parameter
		StringBuffer s3 = new StringBuffer(20);
		System.out.println("inittial capacity is "+s3.capacity());
		
		//methods
		//append()
		s1.append("rambo");
		s1.insert(0,'s');
		// insert()
		s1.insert(0,"kesava ");
		//delete()
		s1.delete(1, 3);
//		s1.deleteCharAt(-1);
		
		//reverse()
		s1.reverse();
		
//		index of()
		System.out.println(s1.indexOf("s",1));
		System.out.println("s1 is "+s1);
//		replace()
		s1.replace(1, 3, "dance");
		System.out.println("s1 is "+s1);
		
		System.out.println(s1.length());
		s1.ensureCapacity(23);
		System.out.println(s1.capacity()); // initial capacity 16 chars
		
		s1.append("reddy");//append at last 
		
		
		System.out.println(s1.insert(0, "dfd"));//insert 
		
		System.out.println("deleting "+s1.delete(0, 3));  //delete
		System.out.println(s1.deleteCharAt(5));
//		System.out.println(s1.hasAnyCharacter(" ")); // Output: false
		String s="chenkuuna";
		System.out.println(s.lastIndexOf('n',5));
	}

}
