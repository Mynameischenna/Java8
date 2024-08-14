package recurssion;

public class BinarySearchRec {
	public static void main(String[] args) {
		int arr[]= {2,3,12,24,31,36,40,51};
		int target=11;
		int s=0;
		int e=arr.length-1;
		System.out.println(binarys(arr,s,s+(e-s)/2,e,target));
	}

	private static int binarys(int[] arr,int s, int mid, int e, int target) {
			if(s>e) return -1;
			if(arr[mid]==target) return mid;
			if(target<arr[mid]) return binarys(arr,s,s+(e-s)/2,mid-1,target);
			else return binarys(arr,mid+1,s+(e-s)/2,e,target);
	}

}
