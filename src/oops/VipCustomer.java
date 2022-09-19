package oops;

public class VipCustomer {
	private String name;
	private int creditLimit;
	private String emailAdd;
	
	public VipCustomer() {
		this("Name", 500, "email");
		System.out.println("This is an empty constructor");
	}
	
	public VipCustomer(String name, int creditLimit) {
		this(name, creditLimit, "email@email.com");
		System.out.println("The constructor with two params called");
	}
	
	public VipCustomer(String name, int creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAdd = email;
		System.out.println("The constructor with three params called");
	}
	
	public String getName() {
		return name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmailAdd() {
		return emailAdd;
	}
}
