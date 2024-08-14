package Binarysearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
	
//		int a[]= {2,4 ,12 ,16,19,28,32,39}; // asc order

		int a[]= {99,78,39,23,20,18,12,9,6,4,-1};
		int target=-1;
		int value=search(a,target);
		if(value==-1)  System.out.println("element is not found");
		else System.out.println("element is found at index of "+value);
		
		
	}
	
	
static int search(int a[],int target) {
	
		int start=0;
		int end=a.length-1;
		int mid=-1;
		boolean isAsc;
		isAsc= a[start]<a[end];
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(a[mid]==target) return mid;
			if(isAsc) {
				if(target<a[mid]) end=mid-1;
				else start=mid+1;
			}
			else {
				if(target>a[mid]) end=mid-1;
				else start=mid+1;
			}	
		
		}
		return -1;
	}
}

