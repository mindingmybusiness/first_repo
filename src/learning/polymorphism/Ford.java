package learning.polymorphism;

public class Ford extends Car{
	
	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	public String startEngine() {
		String s = this.getClass().getName() + "s engine is starting";
		return s;
	}

	public String accelerate() {
		String s = this.getClass().getName() + "s is accelerating";
		return s;
	}

	public String brake() {
		String s = this.getClass().getName() + "s is braking";
		return s;
	}

}
