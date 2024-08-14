package bitOperators;

public class findBit {
	public static void main(String[] args) {
		// find the ith boit of a number
		int a=10;
		int i=2;
		System.out.println(a>>i&1);
		
//		set the ith bit
		int a1=10;
		int i1=1;
		int l=1<<i1-1;
		System.out.println(a1|l);
		
		//reset the ith bit
		System.out.println(1<<a-1&1<<a-1);
		
	}

}
