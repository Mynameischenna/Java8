package recurssion;

public class Nto1 {
	public static void main(String[] args) {
		// print numbers from 1 to 5 and vice versa
		fund(5);
		
	}
	static void fund(int n) {
		if(n==0) return ;
		fund(n-1);
		System.out.println(n);
	}

}
