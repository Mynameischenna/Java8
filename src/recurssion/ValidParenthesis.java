package recurssion;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "[()]{}{[()()]()}";
        System.out.println(checkParenthisis(s));
    }
    static int i = 0;
    private static boolean checkParenthisis(String s) {
        Stack<Character> stack = new Stack<>();
        while (i < s.length()) {
            char last = s.charAt(i);
            if (last == '(' || last == '{' || last == '[') {
                stack.push(last);
            } else {
                char peek = stack.peek();
                if (last == ')') {
                    if (peek == '(') stack.pop();
                    else return false;
                }
                else if (last == '}') {
                    if (peek == '{') stack.pop();
                    else return false;
                }
                else if (last == ']') {
                    if (peek == '[') stack.pop();
                    else return false;
                }
            }
            i++;

        }
        return stack.isEmpty();
    }
}

