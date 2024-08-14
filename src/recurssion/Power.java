package recurssion;

public class Power {
    public static void main(String[] args) {

        int n = 2;
        int power = 3;
        int res = 1;
        int result = pow(n,power,res);
        System.out.println(ress);
    }
    static int ress = 1;
    private static int pow(int n, int power,int res) {
        if(power == 0) return res;
        ress *= n;
        return pow(n,power-1,res*n);

    }
}
