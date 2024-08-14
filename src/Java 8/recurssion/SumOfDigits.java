package recurssion;

public class SumOfDigits {
	public static void main(String[] args) {
		int sum=23421;
		System.out.println(digitSum(sum));
	}

	private static int digitSum(int sum) {
		if(sum==0) return 0;
		return digitSum(sum/10)+sum%10;
		
	}

}
