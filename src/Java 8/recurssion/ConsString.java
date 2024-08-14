package recurssion;

public class ConsString {
	public static void main(String[] args) {
		// remove consicutive strings
		String d="abbccab";
		System.out.println(cons(d,0));
	}

	private static String cons(String d, int i) {
		if(i==d.length()-2) return d.charAt(0)+"";
		
		return cons(d,i+1).charAt(0)+""!=d.charAt(i)+"" ?d.charAt(i)+d.charAt(i+1)+"":""+d.charAt(i);
		
	}
}
