package recurssion;

public class Length {
	public static void main(String[] args) {
		System.out.println(recLen("chenna"));
	}
	private static int recLen(String str) 
    {
 
        // if we reach at the end of the string
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }
 
}
