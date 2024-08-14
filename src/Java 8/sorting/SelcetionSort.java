package sorting;

public class SelcetionSort {
	public static void main(String[] args) {
		int[] arr = {15, 10, 3, 8, 12, 5, 7, 1, 9, 2, 4, 11, 6, 14, 13};
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int max=Integer.MIN_VALUE;
			int index=0;
			for(int j=0;j<n-i;j++) {
				if(arr[j]>max) {
					max=arr[j]; // finding the max value
					index=j;
				}
			}
			// swap with correct index
			int temp=arr[index];
			arr[index]=arr[n-1-i];
			arr[n-i-1]=temp;
			
		}
		for(int i :arr) System.out.println(i);
	}

}
