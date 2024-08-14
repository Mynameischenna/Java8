package recurssion;

public class CountOvels {
    public static void main(String[] args) {
        String s="asdkhdktesi";
        int n=0;
        System.out.println( countv(s,n,0));
    }

    private static int countv(String s, int n,int index) {
        if(s.length()==index) return n;
        char ch=s.charAt(index);
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') return countv(s,n+1,index+1);
        return countv(s,n,index+1);
    }
}
