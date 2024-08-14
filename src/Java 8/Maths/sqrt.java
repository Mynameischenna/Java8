package Maths;

public class sqrt {
	public static void main(String[] args) {
		// find sqrt of a number
		System.out.println(sqrt(15));
	}
	static int sqrt(int n) {
		int s=1;
		int e=n-1;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(mid*mid==n) return mid;
			else if(mid*mid>n) {
				e=mid-1;
			}
			else s=mid+1;
		}
		return -1;
	}
}
