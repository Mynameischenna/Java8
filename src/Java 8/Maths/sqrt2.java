package Maths;

public class sqrt2 {
	public static void main(String[] args) {
		//find sqrr root of non perfect number
		int n=40;
		int p=3;
		System.out.printf(" the root is %.3f",sqrt(n,p));
		
	}
	static double sqrt(int n,int p) {
		int s=1;
		int e=n;
		double root=0.0;
//		double max=0.0;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(mid*mid==n) return mid;
			else if(mid*mid>n) {
				e=mid-1;
			}
			else {
				root=mid;
				s=mid+1;
			}
		}
//		System.out.println("mid is "+max);
		double k=0.1;
		System.out.println("root is "+root);
		for(int i=0;i<p;i++) {
			while(root*root<=n) {
				root+=k;
				System.out.println(root);
			}
			root-=k;
			k=k/10;
		}
		return root;
	}
}
// tc is o(logn)