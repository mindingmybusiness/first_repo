package learning.oopsChallenge;

public class Main {

	public static void main(String[] args) {
		Burger burger = new Burger(300, "Veggie burger");
		Side side = new Side("Salsa Salad", 140);
		Drink drink = new Drink('m', "Coke", 70);
		
//		Meal meal = new Meal(burger, side, drink);
//		meal.menuMessage();
//		meal.addToppings();
//		meal.printPrice();
		
		DeluxeMeal deluxeMeal = new DeluxeMeal(burger, side, drink);
		deluxeMeal.printPrice();
		
	}

}
