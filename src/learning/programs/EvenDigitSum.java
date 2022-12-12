package learning.programs;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456));
	}
	
	public static int getEvenDigitSum(int num) {
		int sum =0;
		while(num!=0) {
			int remainder = num%10;
			if(remainder%2==0) {
				sum = sum + remainder;
			}
			num /= 10;
		}
		return sum;
			
	}

}
