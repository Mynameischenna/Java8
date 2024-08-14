package Strings;

public class powerofnum {
	public static void main(String[] args) {
		int x=1;
		int y=8;
		int val=x;
		int k=y;
		while(k>0) {
			val=val*x;
			System.out.println("x is"+val);
			if(val==y) System.out.println("found");
			k--;
		}
		System.out.println("not found");
	}

}

