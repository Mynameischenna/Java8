package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTriangle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        List<Integer> lis = new ArrayList<>();
        triangle(arr);
    }

    private static void triangle(int[] arr) {
        if(arr.length<1)  return;
        int temp[]= new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            temp[i]=arr[i]+arr[i+1];
        }
        triangle(temp);
        System.out.println(Arrays.toString(arr));

    }
}
