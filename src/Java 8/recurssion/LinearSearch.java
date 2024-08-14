package recurssion;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {2,4,3,6,8,9};
		int target=91;
		int index = 0;
		System.out.println(search(arr,target , index));
	}

	private static boolean search(int[] arr, int target, int index) {
		// base condition
		if(index==arr.length) return false;
		
		return arr[index]==target || search(arr,target,index+1);
	}

}
