package inheritance;

public class Dog extends Animal{

	private String earShape;
	private String tailShape;
	
	
	public Dog() {
		super("Dog","big",40);
	}
	
	public Dog(String type, double weight) {
		this(type, weight, "Perky","curled");
	}
	
	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type,weight<15?"small":(weight < 35 ? "medium": "large"), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	

	@Override
	public String toString() {
		return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "]" + super.toString();
	}



	public void makeNoise() {
		bark();
		System.out.println("Dog barks");
	}
	
	
	
	@Override
	public void move(String speed) {
		super.move(speed);
		if(speed.equals("slow")) {
			walk();
			wagTail();
		}else {
			run();
			bark();
		}
		System.out.println("____________");
	}

	private void bark() {
		System.out.println("woof");
	}
	public void run() {
		System.out.println("Dog runs");
	}
	
	public void walk() {
		System.out.println("Dog walks");
	}
	
	public void wagTail() {
		System.out.println("Dog wags tail");
	}
}
