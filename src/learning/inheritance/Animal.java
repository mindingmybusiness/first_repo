package learning.inheritance;

public class Animal {
	
	private String type;
	private String size;
	private double weight;
	
	public Animal() {
		
	}
	
	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}

	public void move(String speed) {
		System.out.println(type + " Animal moves at the speed: "+ speed);
	}

	public void makeNoise() {
		System.out.println(type + " Animal makes noise");
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}
	
	
}
