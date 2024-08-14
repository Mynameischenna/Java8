package recurssion;

import java.util.ArrayList;
import java.util.List;

public class SubsetArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int index = 0;
        List<List<Integer>> res = new ArrayList<>();
        subset(arr,index,new ArrayList<>(),res);
        System.out.println(res);
    }

    private static void subset(int[] arr, int index,List<Integer> curr,List<List<Integer>> list) {
        if(index == arr.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        // add element
        int ele = arr[index];
        curr.add(ele);
        subset(arr,index+1,curr,list);

        // dont add element
        curr.remove(curr.size() - 1);
        subset(arr,index+1,curr,list);
    }

}
