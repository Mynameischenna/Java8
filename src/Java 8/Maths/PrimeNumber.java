package Maths;

public class PrimeNumber {
	public static void main(String[] args) {
		// to check given number is prime or not
//		System.out.println(isPrime(11));
		
//		find prime numbers less than of a number n
		int n=40;
		boolean primes[]=new boolean[n+1];
		isPrimeRange(n,primes);
		for(int i=2;i<=n;i++) {
			if(!primes[i]) System.out.println(i);
//			System.out.println(!primes[i]+" "+i);
		}
		
	}
	static void isPrimeRange(int n,boolean primes[]) { // false means prime,true non prime
		for(int i=2;i<=n;i++) {
			if(!primes[i]) {
				for(int j=i*2;j<=n;j+=i) {
					primes[j]=true;
				}
			}
		}
		//tc:o(n*log(log(n))
//		sc:o(n)
	}
	
	static boolean isPrime(int n) {
		if(n<=1) return false;
		int c=2;
		while(c*c<=n) {
			if((n%c)==0) return false;
			c++;
		}
		return true;
		//tc: n*sqrt(n)
		
	}

}
