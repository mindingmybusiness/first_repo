package learning.problems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1;
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        
        for(int i=1;i<=num;i++) {
        	fact *=i;
        }
        System.out.println(fact + " is the factorial of "+ num);
        
	}

}
