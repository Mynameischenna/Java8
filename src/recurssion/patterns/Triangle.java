package recurssion.patterns;

//* * * *
//* * *
//* *
//*

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int row = 4;
        int col = 0;
//        triangle2(row,col);
        int[] arr = {4,2,3,1,-1,231 ,0};
//        selectionSort(arr,0,Integer.MAX_VALUE,0,0);
        bubbleSort(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void triangle(int row, int col) {
        if(row == 0) return;
        if(row == col){
            System.out.println();
            triangle(row-1,0);
        }
        else{
            System.out.print("* ");
            triangle(row,col+1);
        }
    }
    private static void triangle2(int row, int col) {
        if(row == 0) return;
        if( row == col){
            triangle2(row-1,0);
            System.out.println();
        }
        else{
            triangle2(row,col+1);
            System.out.print("* ");
        }
    }

    // bubble sort
    private static void bubbleSort(int[] arr,int len, int i) {
        if(len == 0) return;
        if(i == len -1){
            bubbleSort(arr,len -1 , 0);
        }
        else{
            if(arr[i]> arr[i+1]){
                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            bubbleSort(arr,len, i+1);
        }
    }
    // selection sort
    private static void selectionSort(int[] arr, int i,int minValue,int pointer,int start) {
        int len = arr.length;
        if(start == len -1) return;
        if(i == len){
            // swap
            int temp = arr[start];
            arr[start] = arr[pointer];
            arr[pointer] = temp;
            selectionSort(arr,start+1,Integer.MAX_VALUE,0,start+1);
        }
        else{
            if(arr[i]< minValue){
               minValue = arr[i];
               pointer = i;
            }
            selectionSort(arr,i+1,minValue,pointer,start);
        }
    }

}
