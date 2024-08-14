package patterns;

import java.util.Scanner;

public class pattern5 {
	public static void pattern5(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*"+"");
			}
			System.out.println();
		}
	}
	public static void pattern6(int n) {

		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern7(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void pattern8(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*n-2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void pattern9(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*n-2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
//	10)
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
	public static void pattern10(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}															
			
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	public static void pattern11(int n) {
		
		int l=0;
		for(int i=0;i<n;i++) {
				if(i%2==0) {
					l=0;
				}
				else l=1;
				for(int j=0;j<=i;j++) {
					
					if(l==0) {
						l=1;
						System.out.print(l);
					}
					else {
						l=0;
						System.out.print(l);
					}
				}
			
			
			System.out.println();
		}
	}
	
	public static void pattern12(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1);
			}
//			System.out.println("one");
			for(int k=0;k<2*n-2*(i+1);k++) {
				System.out.print(" ");
			}

			for(int s=i+1;s>0;s--) {
				
				System.out.print(s);
			}
//			System.out.println("four");
			System.out.println();
		}
	}
	public static void pattern14(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				char a =(char)(65+j);
				System.out.print(a);
			}
			System.out.println();
		}
	}
	public static void pattern15(int n) {

		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				char a =(char)(65+j);
				System.out.print(a);
			}
			System.out.println();
		}
	}
	public static void pattern16(int n) {

		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				char a =(char)(65+i);
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	public static void pattern17(int n) {

		for(int i=0;i<n;i++) {
			for(int k=0;k<n-(i+1);k++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i;j++) {
				char a =(char)(65+j);
				System.out.print(a);
			}
			System.out.print((char)65);
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		n= sc.nextInt();
//		pattern5.pattern5(n);
		pattern5.pattern17(n);
	}

}

