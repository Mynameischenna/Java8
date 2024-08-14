package recurssion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        String s="aba";
        subsets(s,"");
//        System.out.println(subsets1(s,""));
    }

    private static void subsets(String unprocessed,String processed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        subsets(unprocessed.substring(1),processed+unprocessed.charAt(0));
        subsets(unprocessed.substring(1),processed);
    }
    // return arraylist without being passed as paremeter
    private static ArrayList<String> subsets1(String unprocessed, String processed) {
        ArrayList<String> ll = new ArrayList<>();
        if(unprocessed.isEmpty()) {
            if(!processed.isEmpty()) ll.add(processed);

            return ll;
        }
        ArrayList<String> ans1=subsets1(unprocessed.substring(1),processed+unprocessed.charAt(0));
        ArrayList<String> ans2= subsets1(unprocessed.substring(1),processed);

        ll.addAll(ans1);
        ll.addAll(ans2);
        return ll;
    }
}
