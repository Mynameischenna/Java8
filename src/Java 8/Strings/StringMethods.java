package Strings;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s1="chenna";
		
		System.out.println(s1.length()); //length
		System.out.println(s1.substring(1,4)); //(inc,exclusive)
		System.out.println(s1.substring(1));
		System.out.println(s1.concat("ramu")); // concatination return new string
		System.out.println(s1.charAt(0));
		System.out.println("contains "+s1.contains("che"));
		System.out.println("lower case "+s1.toLowerCase());
		System.out.println("uppercase "+ s1.toUpperCase());
		System.out.println("compares lexographically "+s1.compareTo("chenna"));
		System.out.println("compares lexigraphically ignoring case "+s1.compareToIgnoreCase("Chenna"));
		
		System.out.println("equals "+s1.equals("chenna"));
		System.out.println("ignore case euqls "+s1.equalsIgnoreCase("CFhenna"));
		
		System.out.println("index "+s1.indexOf('c')); //index
		System.out.println("index from last "+s1.lastIndexOf('n'));
		
		System.out.println(s1.strip());// removes spaces
		System.out.println(Arrays.toString(s1.split("e"))); //split the string and strore in the array
		System.out.println(s1.replace("nn", "u")); // replace
		
		
		
		
	}
}
