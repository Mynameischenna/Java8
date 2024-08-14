package patterns;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		n= sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
	}

}
// find the no of rows that is your outer loop
//2) for the inner loop ,focus on the columns and connect then somehow to the rows
//3) print them inside the inner for loop
//4)observe symmetry