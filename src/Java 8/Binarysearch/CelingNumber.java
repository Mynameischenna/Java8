package Binarysearch;

import java.util.Scanner;



// celing number :smallest number which is greater than target
public class CelingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aa =sc.nextInt();
		
		for(String s :args) System.out.println("ars "+s);
		int a[]= {2,4,7,8,9,11,32,45,67};
		int target=7;
		System.out.println(search(a,target));
	}
	
	public static int search(int nums[],int target) {
		
		int s=0, e=nums.length-1;
		if(target>nums[e]) return -1;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(target>=nums[mid]) s=mid+1;
			else e=mid-1;
		}
		return nums[s];
		
	}

}
