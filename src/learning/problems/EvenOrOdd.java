package learning.problems;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		System.out.println("Entered number is: "+ number);
		
		if(number%2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + "is odd");
		}
	}

}
