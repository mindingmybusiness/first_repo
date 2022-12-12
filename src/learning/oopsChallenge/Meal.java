package learning.oopsChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Meal {
	private static ArrayList<String> TOPPINGS = new ArrayList<String>();

	private Burger burger;
	private Side sideItem;
	private Drink drink;
	private double mealPrice;
	private char sizeOfDrink;

	public void menuMessage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter how many toppings would you like 1-5");
		int noOfToppings = scan.nextInt();
		System.out.println("Please enter the toppings of your choice");
		for (int i = 0; i < noOfToppings; i++) {
			TOPPINGS.add(scan.next());
		}
		scan.close();

	}

	public double getMealPrice() {
		mealPrice = burger.getBurgerPrice() + sideItem.getSideItemPrice() + drink.getDrninkPrice(sizeOfDrink);
		return mealPrice;
	}

	public void setSizeOfDrink(char size) {
		this.sizeOfDrink = size;
	}

	public Meal(Burger burger, Side sideItem, Drink drink) {
		this.burger = burger;
		this.sideItem = sideItem;
		this.drink = drink;
	}

	public void addToppings() {
		burger.addToppings(TOPPINGS);
	}


	public void printPrice() {
		System.out.println("Burger BasePrice : "+ burger.getBasePrice());
		System.out.println("Burger : " + burger.getBurgerPrice());
		System.out.println("Side Item : " + sideItem.getSideItemPrice());
		System.out.println("Drink : " + drink.getDrninkPrice(sizeOfDrink));
		System.out.println("Total Price : "+ getMealPrice());
	}
}
