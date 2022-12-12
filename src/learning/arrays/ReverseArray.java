package learning.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = { 12, 13, 14, 15, 16 };
		reverse(array);
	}

	private static void reverseArray(int[] array) {
		int[] reversedArray = new int[array.length];
		int count = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			reversedArray[i] = array[count];
			count++;
		}
		System.out.println(Arrays.toString(reversedArray));
	}

	private static void reverse(int[] array) {
		System.out.println("Array = " + Arrays.toString(array));
		int len = array.length - 1;
		int middle = 0;
		if (array.length % 2 == 0) {
			middle = array.length / 2;
		} else {
			middle = (array.length / 2) + 1;
		}
		for (int i = 0; i <= middle - 1; i++) {
			int temp = array[i];
			array[i] = array[len - i];
			array[len - i] = temp;
		}

		System.out.println("Reversed array: " + Arrays.toString(array));

	}

	public static void reverse1(int a[]) {
		System.out.println(Arrays.toString(a));
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.toString(a));
	}

}
