package Binarysearch;

public class InfiniteArray {
	public static void main(String[] args) {
		int[] ascendingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int target=100;
		System.out.println("index of target is "+size(ascendingArray,target));

	}
	public static int size(int[] arr,int target ) {
		//find the range ,we are starting with size of 2 and increasing exponentially
		int start=0;
		int end=1;
		
		try {
			while(target>arr[end]) {
				int newstart=end+1;
				end=end+(end-start+1)*2;
				start=newstart;
			}
		} catch (Exception e) {
			System.out.println(" iam catched");
			return -1;
		}
		
		
		return binarySearch(arr, target, start, end);
		
		
	}
	public static int binarySearch(int[] arr,int target,int start,int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target==arr[mid]) return mid;
			if(target>arr[mid]) start=mid+1;
			else end=mid-1;	
		}
		return -1;
		
	}

}
