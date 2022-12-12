package learning.stringOptions;

public class StringMethods {

	public static void main(String[] args) {
		
//		printStringInformation("        ");
//		String hi = "Hello World";
//		printStringInformation(hi);
//		String hello = "hello world";
//		
//		comparisonMethods(hello,hi);
		
		manipulationMethods();
		
	}
	
	public static void printStringInformation(String str) {
		int len = str.length();
		System.out.printf("Length = %d %n",len);
		
		if(str.isEmpty()) {
			System.out.println("String is empty");
		}
		
		if(str.isBlank()) {
			System.out.println("String is blank");
		}
		System.out.printf("First char = %c %n",str.charAt(0));
		
		System.out.printf("r is at = %d %n",str.indexOf('r'));
		
		System.out.printf("world is at = %d %n", str.indexOf("World"));
		
		System.out.printf("Last occurence of l = %d %n", str.lastIndexOf('l'));
		
		System.out.printf("Last Index of l from 8th pos %d %n", str.lastIndexOf('l',8));
		
	}
	
	public static void comparisonMethods(String str, String str1) {
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str1.startsWith("Hel"));
		
		System.out.println(str1.endsWith("rld"));
		
		System.out.println(str1.contains("World"));
		
		System.out.println(str1.contentEquals(str));
	}
	
	public static void manipulationMethods() {
		String birthDate = "17/11/1990";
		int startingIndex = birthDate.indexOf("1990");
		System.out.println("Birth Year :" + birthDate.substring(startingIndex));
		
		String newDate = String.join("/", "25","11","1990");
		System.out.println(newDate);
		
		System.out.println("ABC\n".repeat(4));
	}
	

}
