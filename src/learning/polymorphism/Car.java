package learning.polymorphism;

public class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.engine = true;
		this.wheels = 4;
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

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
}
