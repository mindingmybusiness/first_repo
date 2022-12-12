package learning.problems;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		int[] inputArray = {1,23,32,243,33,76,77,97,10};
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Please enter the array length"); int length =
		 * sc.nextInt(); System.out.println("Please enter the sequence of numbers");
		 * 
		 * for(int i=0;i<length;i++) { inputArray[i] = sc.nextInt(); }
		 */
		
		int sumEven = 0;
		int sumOdd = 0;
		for(int i=0;i<inputArray.length;i++) {
			if((inputArray[i]%2) == 0 ) {
				sumEven = sumEven + inputArray[i];
			}else {
				sumOdd = sumOdd +inputArray[i];
			}
		}
		System.out.println("Sum of even numbers is: "+ sumEven);
		System.out.println("Sum of odd numbers is: "+ sumOdd);

	}

}
