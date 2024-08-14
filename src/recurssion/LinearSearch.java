package recurssion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 8, 4};
        int target = 4;
        int index = 0;
//        ArrayList<Integer>
        System.out.println(search1(arr,target,index));
    }
    static ArrayList<Integer> search(int arr[],int target,int index){
        ArrayList<Integer> lis = new ArrayList<>();
        if(index==arr.length) return lis;
        if(arr[index]==target) lis.add(index);
        ArrayList<Integer> newar = search(arr,target,index+1);
        lis.addAll(newar);
        return lis;



    }
    static ArrayList<Integer> search1(int arr[],int target,int index){

        if(index==arr.length) return new ArrayList<>();
        if(arr[index]==target) {
            ArrayList<Integer> lis = new ArrayList<>();
           lis.add(index);
            return lis;
        }
        ArrayList<Integer> lis = new ArrayList<>();
        lis.addAll(search1(arr,target,index+1));
        return lis;



    }
}