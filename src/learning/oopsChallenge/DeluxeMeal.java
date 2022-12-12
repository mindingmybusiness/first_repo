package learning.oopsChallenge;

public class DeluxeMeal extends Meal{

	private char sizeOfDrink = 'L';
	@SuppressWarnings("static-access")
	public DeluxeMeal(Burger burger, Side sideItem, Drink drink) {
		super(burger, sideItem, drink);
		burger.setNumberOfToppings(5);
		super.setSizeOfDrink(sizeOfDrink);
		super.addToppings();
	}
	
	
	
}
