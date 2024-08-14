package recurssion;

public class FirstUpperCase {
	public static void main(String[] args) {
		// finding first upper case in a string in recurssion
		String s="geE";
		char chars[]=s.toCharArray();
		System.out.println(findchar(chars,0));
	}
	
	static char findchar(char chars[],int i) {
		if(Character.isUpperCase(chars[i])) return chars[i];
		return findchar(chars,i+1);

	}

}
//\Time Complexity : O(N)

//Auxiliary Space: O(N) for call stack