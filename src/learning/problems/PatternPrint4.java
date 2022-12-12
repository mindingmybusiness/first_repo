package learning.problems;

public class PatternPrint4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for (int j=i; j<5;j++) {
				System.out.print(" ");
			}
			for(int h=1;h<=i;h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
