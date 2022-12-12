package learning.problems;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three angles of the triangle");
		int angle1 = sc.nextInt();
		int angle2 = sc.nextInt();
		int angle3 = sc.nextInt();

		if ((angle1 + angle2 + angle3) == 180) {
			System.out.println("It is a valid triangle");
		} else {
			System.out.println("It is not a valid triangle");
		}

	}

}
