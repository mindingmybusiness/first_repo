package learning.problems;

import java.util.Scanner;

public class Powers {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result2 = (int) Math.pow(number, power);
		System.out.println(result2);
		
		int result = number;
		while(power !=1) {
			result = result * number;
			power--;
		}
		System.out.println(result);
		
		
		if(result == result2) {
			System.out.println("Your program is correct");
		}
	}
	

}
