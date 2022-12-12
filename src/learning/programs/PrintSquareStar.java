package learning.programs;

public class PrintSquareStar {

	public static void main(String[] args) {
		printSquareStar(8);
	}
	
	public static void printSquareStar(int number) {
		if(number <5) {
			System.out.println("Invalid Value");
		}
		
		for(int i = 1;i<=number;i++) {
			System.out.print('*');
		}
		System.out.println();
		for(int j=1;j<=number/2;j++) {
			System.out.print('*');
		}
		System.out.print(' ');
		for(int j=1;j<=number/2;j++) {
			System.out.print('*');
		}
		System.out.println();
		for(int i = 1;i<=number-2;i++) {
			System.out.print('*');
			System.out.print(' ');
		}
		System.out.println();
		for(int j=1;j<=number/2;j++) {
			System.out.print('*');
		}
		System.out.print(' ');
		for(int j=1;j<=number/2;j++) {
			System.out.print('*');
		}
		System.out.println();
		for(int i = 1;i<=number;i++) {
			System.out.print('*');
		}
	}

}
