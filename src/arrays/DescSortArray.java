package arrays;

import java.util.Scanner;

public class DescSortArray {

	public static void main(String[] args) {
		int[] array = getIntegers(8);
		int[] sortedArray = sortIntegers(array);
		printArray(sortedArray);
	}

	public static int[] getIntegers(int number) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter" + number + " integer values\r");
		int[] values = new int[number];
		System.out.println("Enter the array");
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
		for(int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
