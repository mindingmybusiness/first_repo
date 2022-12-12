package learning.oopsChallenge;

public class Side extends Item {
	private double sideItemPrice;
	
	public Side(String type, double sideItemPrice) {
		super(type);
		this.sideItemPrice = sideItemPrice;
	}

	public double getSideItemPrice() {
		return sideItemPrice;
	}

}
