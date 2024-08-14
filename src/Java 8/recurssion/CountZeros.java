package recurssion;

public class CountZeros {
	public static void main(String[] args) {
		// count zeros in a number
		int n=23023;
		System.out.println(count(n,0));
		System.out.println(count1(n));
	}

	private static int count(int n,int c) {
		if(n==0) return c;
//		else if(n%10==0) c++;
//		System.out.println(c);
		return count(n/10,n%10==0?++c:c);
		
	}
	
	// if you need extra arguments to store some value or some other requirments use helper function
	private static int count1(int n) {
		return helper(n,0);
		
	}
	static int helper(int n,int c) {
		if(n==0) return c;
		else if(n%10==0) return helper(n/10,c+1);
		return count(n/10,c);
	}

}
