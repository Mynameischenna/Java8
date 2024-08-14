package recurssion;

public class ReverseNumber {
	public static void main(String[] args) {
		int n=11111;
System.out.println(reverse(n,0,n));
	}
//	static int reverse(int n) {
//		int ans=0;
//		while(n!=0) {
//			int k=n%10;
//			ans=ans*10+k;
//			n=n/10;
//			System.out.println("n uis "+n);
//		}
//		return ans;
//		
//	}
	static int reverse(int n,int ans) {
		if(n==0) return ans;
		else ans=n%10+ans*10;
		return reverse(n/10,ans);
		
	}
	// palindrome 
	static boolean reverse(int n,int ans,int k) {
		if(ans==k) return true;
		if(n==0) return false;
		else ans=n%10+ans*10;
		return reverse(n/10,ans,k);
		
		
	}
	
	

}
