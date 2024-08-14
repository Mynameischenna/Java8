package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {2,4,1,7,5,9,11,3};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i:a) System.out.println(i);
	}

}
