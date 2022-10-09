package programs;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		reverseArray(array);
		
	}
	
	public static void reverseArray(int[] array) {
		System.out.println("Array = " + Arrays.toString(array));
		int len = array.length -1;
		int middle =0;
		if(array.length%2 ==0) {
			middle = array.length/2;
		}else {
			middle = (array.length/2)+1;
		}
		
		for(int i=0;i<=middle-1;i++) {
			int temp = array[i];
			array[i]= array[len-i];
			array[len-i]= temp;
		}
		
		System.out.println("Reversed array = " + Arrays.toString(array));
//		for(int i=0; i<array.length;i++) {
//			System.out.println("reversed array is: "+ array[i]);
//		}
	}

}
