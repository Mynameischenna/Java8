package recurssion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 2357;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n%10==n) return n;
        return sum(n/10)+n%10;
    }
}
