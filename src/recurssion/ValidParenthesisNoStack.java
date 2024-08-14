package recurssion;

public class ValidParenthesisNoStack {
    public static void main(String[] args) {
        // checking valid parenethisis with out using stack
        String s= "[()]";
        System.out.println(checkvalidity(s));
    }

    private static boolean checkvalidity(String s) {
        StringBuilder builder = new StringBuilder();
        int i = 0;// counter to check the position in string
        int k=0;
        while(i<s.length()){
            char last = s.charAt(i);
            if(last == '(' || last == '[' || last == '{') {
                builder.append(last);
                k++;
            }
            else {
                if(k<=0) return false;
                k=k-1;
                char ans = builder.charAt(k);
                builder.deleteCharAt(k);
                if ((last == ')' && ans != '(') || ((last == '}' && ans !='{')) || ((last == ']' && ans != '[')) ) return false;
            }
            i++;
        }
        return k==0;

    }

}
