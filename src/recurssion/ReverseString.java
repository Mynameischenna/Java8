package recurssion;

public class ReverseString {
    public static void main(String[] args) {
        String s="chenna";
        System.out.println(reverse(s,0));
        System.out.println(length(s,0));
    }

    private static String reverse(String s, int i) {
        if(i==s.length()-1) return s.charAt(i)+"";
        return reverse(s,i+1)+s.charAt(i)+"";
    }
    static int length(String s,int i){
        if(s=="") return i;
        return length(s.substring(1),i+1);
    }
}
