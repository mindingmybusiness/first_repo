package problems;

import java.util.Scanner;

public class Grades {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any grade from A to F");
		
		String grade = sc.next();
		
		/*
		 * When using a switch case you can use char grade = sc.next().charAt(0);
		 */
		
		if(grade.equals("A")) {
			System.out.println("Excellent");
		}else if(grade.equals("B")) {
			System.out.println("Good");
		}else if (grade.equals("C")){
			System.out.println("Average");
		}else if (grade.equals("D")) {
			System.out.println("Deficient");
		}else if (grade.equals("F")) {
			System.out.println("Failing");
		}else {
			System.out.println("Invalid input");
		}
	}

}
