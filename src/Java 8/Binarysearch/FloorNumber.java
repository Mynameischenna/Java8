package Binarysearch;

public class FloorNumber {
	public static void main(String[] args) {
		int a[]= {2,4,7,9,11,32,45,67};
		int target=7;
		System.out.println(search(a,target));
	}

	private static int search(int[] a, int target) {
		int s=0,e=a.length-1;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(target>a[mid]) s=mid+1;
			else e=mid-1;
		}
		return a[e];
	}
}
