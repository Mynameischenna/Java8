package recurssion;

public class Example1 {
	public static void main(String[] args) {
		numbers(5);
	}
	static void numbers(int n) {
		if(n==0) return;
		else {
			System.out.println(n);
		}
		numbers(n-1);
		System.out.println("hi"+n);
	}

}
 