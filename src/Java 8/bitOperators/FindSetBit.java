package bitOperators;

// finr the set right most set bit
public class FindSetBit {
	public static void main(String[] args) {
		int n=10;
		int rightbit=0;
		for(int i=0;i<n;i++) {
			n=10;
			int r=(n>>i+1)&1;
			if(r==1) {
				rightbit=i;
				break;
			}
		}
		System.out.println(rightbit);
	}

}
