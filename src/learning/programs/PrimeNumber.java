package learning.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(13));
	}

	public static boolean isPrime(int number) {
		if(number==1) {
			return true;
		}
		
		for(int i=2;i < number/2;i++) {
			if(number%i ==0) {
				return false; 
			}
		}
		return true;
	}
}
