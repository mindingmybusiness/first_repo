package learning.programs;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		int arrayLen = readInteger();
		int[] array = readElements(arrayLen);
		int minValue = findMin(array);
		System.out.println(minValue);
	}

	public static int readInteger() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements in the array: ");
		int num = sc.nextInt();
		return num;
	}

	public static int[] readElements(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter" + num + " integer values\r");
		int[] values = new int[num];

		for (int i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
		}
		return values;
	}

	public static int findMin(int[] array) {
		int minVal = array[0];
		for (int i = 1; i < array.length; i++) {
			if (!(minVal < array[i])) {
				minVal = array[i];
			}
		}
		return minVal;
	}

}
