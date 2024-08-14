package recurssion;

public class Test {
    public static void main(String[] args) {
        String s = "abc";
//        permutation("",s);
        cell("","12");
    }

    private static void cell(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int c = up.charAt(0)-'0';
        for (int i = (c-1)*3; i < c*3 ; i++) {
            char ch = (char)('a'+i);
            cell(p+ch,up.substring(1));
        }
    }

    private static void permutation(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        for(int i=0; i<= p.length();i++ ){
            String left = p.substring(0,i);
            String right = p.substring(i);
            permutation(left+c+right,up.substring(1));
        }
    }


}
