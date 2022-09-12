package programs;

public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if ( (int) (num1 * 1000) == (int) (num2 * 1000) ){
			return true;
		}
		else {
			return false;
		} 
}

}
