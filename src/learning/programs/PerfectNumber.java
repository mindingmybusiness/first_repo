package learning.programs;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
	}
	
	public static boolean isPerfectNumber(int number) {
		if(number==1) {
			return false;
		}
		int sum=1;
		for(int i=2; i<number; i++) {
			if(number%i ==0) {
				sum+=i;
			}
		}
		if(sum== number) {
			return true;
		}else {
			return false;
		}
	}

}
