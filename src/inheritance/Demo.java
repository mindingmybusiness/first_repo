package inheritance;

public class Demo {
	public static void main(String[] args) {
		Animal animal = new Animal("Generic","Huge", 400);
		doingAnimalStuff(animal, "slow");
		
		Dog dog = new Dog();
		doingAnimalStuff(dog, "fast");
		
		Dog yorkie = new Dog("Yorkie", 15);
		doingAnimalStuff(yorkie, "slow");
		
		Dog lab = new Dog("lab", 65, "floppy","swimmer");
		doingAnimalStuff(lab, "fast");
		
		Fish goldie = new Fish("Goldenfish", 0.25, 2,3);
		doingAnimalStuff(goldie, "fast");
		
	}
	
	public static void doingAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println(" _ _ _ _ _ ");
	}
}

