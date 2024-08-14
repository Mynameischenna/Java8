package Binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {2,4 ,12 ,16,19,28,32,39};
		int target=10;
		int value=search(a,target);
		if(value==-1)  System.out.println("element is not found");
		else System.out.println("element is found at index of "+value);

	}
	
	static int search(int a[],int target) {

		
		int start=0;
		int end=a.length-1;
		int mid=-1;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(a[mid]==target) return mid; 
			else if(a[mid]>target) end=mid-1;
			else start=mid+1;
		}
		return -1;
	}

}

// return the index pof element if you find element in the array
