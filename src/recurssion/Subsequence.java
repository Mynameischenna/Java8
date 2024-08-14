package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2,3,3};
//        List<List<Integer>> ans  = susequence(arr);
//        for(List<Integer> lis : ans){
//            System.out.println(lis);
//        }
        // if arrays contains duplicates
        Arrays.sort(arr);

        List<List<Integer>> ans  = susequence(arr);;
        for(List<Integer> lis : ans){
            System.out.println(lis);
        }
    }
    private static List<List<Integer>> susequence(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    // subsequenece when it contains duplicates
    private static List<List<Integer>> susequenceD(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int dup=-1;
        for (int num : arr) {
            int n = outer.size();
            if(dup!=num) {
                dup=num;
                for (int j = 0; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(num);
                    outer.add(internal);
                }
            }
            else{
                System.out.println("hello"+num);
                for (int j = outer.size()/2; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(num);
                    outer.add(internal);
                }
            }
        }
        return outer;
    }
}
