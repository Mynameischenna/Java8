package recurssion;

public class DiceFaces {
    public static void main(String[] args) {
        int face = 4;
        diceface("",face);
    }

    private static void diceface(String p, int face) {
        if(face == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<= face; i++) {
            diceface(p+i,face-i);
        }
    }
}
