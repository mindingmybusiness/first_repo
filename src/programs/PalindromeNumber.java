package programs;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(1089));
	}
	
	public static boolean isPalindrome(int num) {
		int reversedNum = 0;
		int originalNum = num;
		
		while(num!=0) {
			int remainder = num %10;
			reversedNum = (reversedNum *10)+remainder;
			num = num/10;
		}
		
		if(originalNum== reversedNum) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int sumFirstAndLastDigit(int num) {
		int lastdigit = num%10;
		
		int firstDigit =0;
		
		while(num>=9) {
			num = num/10;
		}
		firstDigit = num;
		return firstDigit + lastdigit;
	}
	             

}
