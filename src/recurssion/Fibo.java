package recurssion;

public class Fibo {
    public static void main(String[] args) {
        // find n th fibo number
        int n = 5;
//        arrayl
        System.out.println(findFibo(n));
    }

    private static int findFibo(int n) {
        if(n<2) return n;

        return findFibo(n-1)+findFibo(n-2);
    }
}

