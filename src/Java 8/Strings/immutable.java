package Strings;

public class immutable {
	public static void main(String[] args) {
		String s="chenna";
		String news=s.concat("sdld");
		System.out.println(s);
		System.out.println("new string "+news);
		// any operations on strings will always create a new string object
		
		
		// string constructors
//		1)default constr
		String s1 = new String(); // create empty string "";
		
//		2) parameterized cons
		String s3 = new String("chenna");  //s3="chenna";
		
//		3) Constructor with char[] Argument
		char[] ch= {'d', 'o','g'};
		String s2= new String(ch,1,2);  //(arr,initial offset,length)
		System.out.println("s2 is "+s2);
//		4)Constructor with byte[] Argument
		byte[] by= {79,79,23};
		String s4= new String(by);
		
//		5)string buffer argument
		StringBuffer stringBuffer = new StringBuffer("Hello");
		String str = new String(stringBuffer);
//		Use Case: When you need to convert a StringBuffer to a String.
		
//		6)String builder argument
		
		System.out.println("new strin is "+s4);
		System.out.println((int)'d');
		System.out.println('a'+(Math.abs('z'+2-'a'+1))%26);
	}

}
