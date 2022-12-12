package learning.class1;

public class ByteShortIntLong {
	
	public static void main(String[] args) {
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("min value is: "+ myMinIntValue);
		System.out.println("max value is"+ myMaxIntValue);
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Min byte value = "+ myMinByteValue);
		System.out.println("Max byte value = "+ myMaxByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Min short value = "+ myMinShortValue);
		System.out.println("Max short value = "+ myMaxShortValue);
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Min long value = " + myMinLongValue );
		System.out.println("Max long value = " + myMaxLongValue);
		
		byte myNewByteValue = (byte) (myMinByteValue/2);
		System.out.println(myNewByteValue);
		//This is called casting
	}

}
