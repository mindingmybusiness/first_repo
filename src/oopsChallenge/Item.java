package oopsChallenge;

public class Item {
	
	private double price;
	private char size;
	private String type;
	
	public Item(double price, char size, String type) {
		this.price = price;
		this.size = size;
		this.type = type;
	}
	
	public Item(char size, String type) {
		this(0,size,type);
	}
	
	public Item(String type) {
		this(0,'m',type);
	}
	

}
