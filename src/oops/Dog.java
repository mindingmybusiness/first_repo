package oops;

public class Dog extends Animal{

	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	private void chew() {
		System.out.println("Dog chews");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog.eat called");
		chew();
		super.eat();
	}

	public void walk() {
		System.out.println("The dog walks");
		super.move(50);
	}
	
	public void run() {
		System.out.println("The dog runs");
		super.move(150);
	}
	
}
