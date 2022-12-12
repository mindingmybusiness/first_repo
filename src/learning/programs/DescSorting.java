package learning.programs;

import java.util.Arrays;
import java.util.Scanner;

public class DescSorting {
	
	public static void main(String[] args) {
		int[] arrayToBe = getIntegers(5);
		arrayToBe = sortIntegers(arrayToBe);
		printArray(arrayToBe);
		
	}

	public static int[] getIntegers(int number) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter" + number + " integer values\r");
		int[] values = new int[number];

		for (int i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
		}
		return values;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = array;
		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = i + 1; j < sortedArray.length; j++) {
				if (sortedArray[i] < sortedArray[j]) {
					int temp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}

		return sortedArray;
	}
}