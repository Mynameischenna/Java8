package recurssion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> res = permutationsArray("",s);
        System.out.println(res);
    }

    private static void permutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
            permutations(first+c+second,up.substring(1));
        }
    }
    // return int the form of list
    private static ArrayList<String> permutationsArray(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> s= new ArrayList<>();
            s.add(p);
            return s;
        }
        char c = up.charAt(0);
        ArrayList<String> ans = new  ArrayList<String>();
        for (int i = 0; i <= p.length() ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
             ans.addAll(permutationsArray(first+c+second,up.substring(1)));
        }
        return ans;
    }
}
