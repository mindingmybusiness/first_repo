package learning.problems;

public class PoundToKilograms {
	
	public static void main(String[] args) {
		double pounds = 109.45;
		double kilograms;
		
		kilograms = (float) (0.45359237 * pounds);
		System.out.println("Kilograms for "+ pounds + "pounds is: "+ kilograms);
		
		//for such small calculations this is fine but for
		//larger and more precise calculations we user BigDecimal
		
	}

}
