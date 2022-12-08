package oopsChallenge;

import java.util.ArrayList;

public class Burger {
	private static double BURGER_PRICE;
	private double basePrice;
	private String type;
	private static int numberOfToppings;
	
	
	public Burger(double basePrice, String type) {
		this.basePrice = basePrice;
		this.type = type;
	}
	
	public void addToppings(ArrayList<String> toppings) {
		System.out.println("Added toppings of: " );
		for(int i=0;i<toppings.size();i++) {
			System.out.println(toppings.get(i));
			setNumberOfToppings(getNumberOfToppings() + 1);
		}
		System.out.println("On the burger : " +type);
		setBurgerPrice();
	}
	
	public void setBurgerPrice() {
		if(getNumberOfToppings() == 1) {
			BURGER_PRICE = basePrice+(10*1);
		}else if(getNumberOfToppings() == 2) {
			BURGER_PRICE = basePrice+(10*2);
		}else if(getNumberOfToppings() == 3) {
			BURGER_PRICE = basePrice+(10*3);
		}else if(getNumberOfToppings() == 4) {
			BURGER_PRICE = basePrice+(10*4);
		}else if(getNumberOfToppings() == 5) {
			BURGER_PRICE = basePrice+(10*5);
		}
	}
	
	public double getBurgerPrice() {
		return BURGER_PRICE;
	}
	
	public double getBasePrice() {
		return this.basePrice;
	}

	public static int getNumberOfToppings() {
		return numberOfToppings;
	}

	public static void setNumberOfToppings(int numberOfToppings) {
		Burger.numberOfToppings = numberOfToppings;
	}
	
}
