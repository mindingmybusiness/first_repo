package programs;

public class SortArray {

	public static void main(String[] args) {
		System.out.println("The array is 1,2,3,4,5");
		int[] test = {1,2,3,4,5};
		sortArray(test);
	}

	public static void sortArray(int[] test) {
		int[] arraySorted = test;
		//for(int i=0;i < arraySorted.length-1; i++) {
			for(int j=0;j<arraySorted.length-1;j++) {
				if(arraySorted[j+1]>arraySorted[j]) {
					swap(arraySorted[j], arraySorted[j+1]);
				}
			}
	//	}
		for(int i=0; i<arraySorted.length-1;i++) {
			System.out.println(arraySorted[i]);
		}
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
	}

}
