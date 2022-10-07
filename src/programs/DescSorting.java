package programs;

import java.util.Arrays;
import java.util.Scanner;

public class DescSorting {

	public static void main(String[] args) {
		int[] test = getIntegers(5);
		sortIntegers(test);
		

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

	public static void sortIntegers(int[] array) {
		int[] sortedArray = Arrays.copyOf(array, array.length);
		for(int j=0;j<array.length;j++)
		for(int i=0; i< array.length-1;i++) {
			if(sortedArray[i+1]>sortedArray[i]) {
				swap(sortedArray[i], sortedArray[i+1]);
				//System.out.println("The number at" + i + "is greater than number at" + (i+1));

			}
		
		}
		for(int t=0;t<sortedArray.length-1;t++)
		System.out.println(sortedArray[t]);
	
		//return sortedArray;
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
	}

}
