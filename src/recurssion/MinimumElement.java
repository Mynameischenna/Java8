package recurssion;

public class MinimumElement {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,8,91,-23,1,303};
        int min=Integer.MAX_VALUE;
        System.out.println(minElement(arr,min,0));
    }

    private static int minElement(int[] arr, int min,int index) {
        if(index==arr.length) {
            return min;
        }
        if(arr[index]<min) return minElement(arr,arr[index],index+1);

        return minElement(arr,min,index+1);
    }
}
