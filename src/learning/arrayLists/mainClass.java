package learning.arrayLists;

import java.util.Scanner;

public class mainClass{
	
	private static Scanner sc = new Scanner(System.in);

	private static ArrayListsDemo groceryList = new ArrayListsDemo();
	
	
	public static void main(String[] args) {
		boolean quit = false;
		int choice =0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
				
			case 1:
				groceryList.printGroceryList();
				break;
			
			case 2:
				addItem();
				break;
			
			case 3:
				modifyItem();
				break;
				
			case 4:
				removeItem();
				break;
				
			case 5:
				searchForItem();
				break;
				
			case 6:
				quit = true;
				break;
			}
			
				
		}
	}


	private static void searchForItem() {
		System.out.println("Item to search for: ");
		String searchItem = sc.nextLine();
		if(groceryList.searchItem(searchItem)!=null) {
			System.out.println("Found "+ searchItem + " is in the shopping list" );			 
		}
		else {
			System.out.println(searchItem + " is not found in the shopping list");
		}
	}


	private static void removeItem() {
		System.out.println("Please enter item number: ");
		int itemNo = sc.nextInt();
		sc.nextLine();
		groceryList.removeGroceryItem(itemNo);
	}


	private static void modifyItem() {
		System.out.println("Please enter item number: ");
		int itemNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the replacement item: ");
		String newItem = sc.nextLine();
		groceryList.modifyGroceryItem(itemNo, newItem);
	}


	private static void addItem() {
		System.out.print("Please enter the grocery item: ");
		groceryList.addGroceryItem(sc.nextLine());
	}


	private static void printInstructions() {
			System.out.println("/n Press");
			System.out.println("/t 0 - to print choice options");
			System.out.println("/t 1 - to print the list of grocery items");
			System.out.println("/t 2 - to add an item to the list");
			System.out.println("/t 3 - to modify an item in the list");
			System.out.println("/t 4 - to remove an item from the list");
			System.out.println("/t 5 - to search for an item in the list");
			System.out.println("/t 6 - to quit the application");
	}
	

}
