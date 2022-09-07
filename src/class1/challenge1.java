package class1;

public class challenge1 {
	
	public static void main(String[] args) {
		byte myByteValue = 100;
		short myShortValue = 109;
		int myIntValue = 169;
		
		long myLongValue = 50000L + (10L * (myByteValue+myShortValue+myIntValue));
		
		System.out.println(myLongValue);
		
		short myShortTotal = (short) (1000 + 10 *(myShortValue + myByteValue + myIntValue));
		System.out.println(myShortTotal);
	}

}
