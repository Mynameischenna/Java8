package recurssion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "psp";
        boolean res = palindrome(s);
        System.out.println(res);
    }

//    private static String palindrome(String s) {
//        if(s.length() == 1) return s;
//        return palindrome(s.substring(1))+s.charAt(0);
//    }

        private static boolean  palindrome(String s) {
            if( s.isEmpty() || s.length() == 1) return true;
            if(s.charAt(0) == s.charAt(s.length()-1)){
                return palindrome(s.substring(1,s.length()-1));
            }
            return false;
        }
    }


