package learning.problems;

import java.util.Scanner;

public class ReveresedInteger {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number to be reversed");
			int number = sc.nextInt();
			int remainder = 0;
			int result = 0;
			while(number<10) {
				number = number/10;
				remainder = number%10;
				result = result*10 +remainder*10;
			}
			result = result + number;
			System.out.println(result);
	}

}
