package arrayLists;

import java.util.ArrayList;

public class ArrayListsDemo {
	private ArrayList<String> groceryList = new ArrayList<String>();
	

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have "+ groceryList.size() + " items");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+ ". " + groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position, String item) {
		groceryList.set(position, item);
	}
	
	public void removeGroceryItem(int position) {
		String item = groceryList.get(position);
		groceryList.remove(position);
	}
	
	public String searchItem(String str) {
		int position = groceryList.indexOf(str);
		if(position >=1) {
			return groceryList.get(position-1);
		}
		return null;
	}
}

