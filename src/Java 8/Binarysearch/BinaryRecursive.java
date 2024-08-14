package Binarysearch;

public class BinaryRecursive {
	public static void main(String[] args) {
		int arr[]= {2,3,4,6,7,9,10};
		int target=7;
		System.out.println(bsSearch(arr, 0, arr.length-1,target ));
	}
	public static int bsSearch(int[] arr,int s,int e,int target) {
		int mid=0;
		if(s<=e) {
			mid=s+(e-s)/2;	
			if(arr[mid]==target) return mid;
			if(target<arr[mid]) return bsSearch(arr, s, mid-1, target);
			else return bsSearch(arr, mid+1, e, target);
		}
		
		return -1;
	}

}

// recurssion
//end condition to break the loop
//loop();calling same method again and again