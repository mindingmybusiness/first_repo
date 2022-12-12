package learning.class1;

public class Challenge2 {
	
	public static void main(String[] args) {
		double myDouble = 20.00d;
		double mySecondDouble = 80.00d;
		double newDouble = (myDouble + mySecondDouble)*100.00d;
		System.out.println(newDouble);
		newDouble = (double) newDouble % 40;
		System.out.println(newDouble);
		boolean isZero = (newDouble == 0)? true: false;
	/*	if(newDouble ==0) {
			isZero = true;
		}else {
			isZero = false;
			System.out.println("Got some reminder");
		}*/
		
		
		System.out.println(isZero);
		
		if(!isZero) {
			System.out.println("Got some remainder");
		}
		
	}

}
