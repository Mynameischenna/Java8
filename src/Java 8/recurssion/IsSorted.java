package recurssion;

public class IsSorted {
	public static void main(String[] args) {
		int arr[]= {1,2,2,4,6,9};
		int i=0,j=arr.length-1;
		System.out.println(sorted(arr,0));
		sorted(arr,i);
	}

	private static boolean sorted(int[] arr, int i) {
		if(i==arr.length-1) return true;
		return arr[i]<=arr[i+1] && sorted(arr,i+1);
		
	}

	private static boolean isSorted(int[] arr, int index) {
		// base condition :that it has reached end of the array
		if(index==arr.length-1) return true;
		if(arr[index]>arr[index+1] ) return false;
		return isSorted(arr,index+1);
			
	}

}
