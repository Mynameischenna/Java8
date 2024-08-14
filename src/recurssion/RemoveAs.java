package recurssion;

public class RemoveAs {
    public static void main(String[] args) {
        String s = "cdadapplesea";
        // remove all a's from the string
        System.out.println(deleteA(s,0));
        System.out.println(delete1(s));
        System.out.println(removeApple(s));
    }
    // remove substring from string
    //ex remove apple from string
    private static String removeApple(String s){
        if(s.isEmpty()) return "";
        if(!s.startsWith("apple")) return s.charAt(0)+removeApple(s.substring(1));
        else return removeApple(s.substring(5));
    }

    // using internal variable
    private static String delete1(String s){
        if(s.isEmpty()) return "";
        if(s.charAt(0)!='a') return s.charAt(0)+""+delete1(s.substring(1));
        return delete1(s.substring(1));
    }
    // this is one way of doing this
    private static String deleteA(String s , int index) {
        if(index>=s.length()) return s;
        StringBuilder sd = new StringBuilder(s);
        if(s.charAt(index)=='a') return deleteA(sd.deleteCharAt(index).toString(),index);
        return deleteA(s,index+1);
    }
}
