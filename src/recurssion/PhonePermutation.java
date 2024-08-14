package recurssion;

import java.util.ArrayList;
import java.util.List;

public class PhonePermutation {
    public static void main(String[] args) {
        String s = "23";
        List<String> ans = phonePermutation("",s,new ArrayList<>());
        System.out.println(ans);
    }

    // using list in functioon paramter
    private static List<String> phonePermutation(String p, String up, List<String> ans ) {
        if(up.isEmpty()){
            ans.add(p);
            System.out.println(p);
            return ans;
        }
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            phonePermutation(ch+p,up.substring(1),ans);
        }

        return ans;
    }

    // using list in functioon paramter
    private static List<String> phonePermutation(String p, String up) {
        if(up.isEmpty()){
            List<String> ans= new ArrayList<>();
            ans.add(p);
            System.out.println(p);
            return ans;
        }
        List<String> ans= new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            ans.addAll(phonePermutation(ch+p,up.substring(1)));
        }

        return ans;
    }

}
