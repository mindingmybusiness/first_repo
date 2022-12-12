package learning.oopsChallenge;

public class Drink extends Item {

	private double drinkPrice;

	public Drink(char size, String type, double drinkPrice) {
		super(size, type);
		this.drinkPrice = drinkPrice;
	}
	
	public double getDrninkPrice(char size) {
		if(size == 's' || size == 'S') {
			drinkPrice = drinkPrice-10;
		}
		if(size == 'm' || size == 'M') {
			drinkPrice = drinkPrice+0;
		}
		if(size == 'l' || size == 'L') {
			drinkPrice = drinkPrice+10;
		}
		return drinkPrice;
	}

}
