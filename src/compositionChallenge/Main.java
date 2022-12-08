package compositionChallenge;

public class Main {

	public static void main(String[] args) {
		SmartKitchen sk = new SmartKitchen();
		
//		sk.getDishWasher().setHasWorkToDo(true);
//		sk.getIceBox().setHasWorkToDo(true);
//		sk.getBrewMaster().setHasWorkToDo(true);
//		
//		sk.getDishWasher().doDishes();
//		sk.getIceBox().orderFood();
//		sk.getBrewMaster().brewCoffee();
		
		sk.setKitchenState(true, false, true);
		sk.doKitchenWork();
	}
}
