package oopsClass;

public class Customer {
	
	private String name;
	private int creditLimit;
	private String email;
	
	public Customer(String name, int creditLimit, String email) {
		System.out.println("All param constructor");
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public Customer() {
		this("Default Name","default@email.com");
		System.out.println("Constructor with no params");
	}
	
	public Customer(String name, String email) {
		this(name,50000,email);
		System.out.println("Constructor with two params");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public int getCreditLimit() {
		return this.creditLimit;
	}

}
