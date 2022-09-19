package oops;

public class BankAccount {
	
	private String accountNum;
	private int balance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNum;
	
	public BankAccount() {
		this("9823329", 500, "Shubha", "shubha@gmail.com", "9329243298");
		System.out.println("Calling an empty constructor");
	}
	
	public BankAccount(String accountNum, int balance, String customerName, String customerEmail, String customerPhoneNum) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhoneNum = customerPhoneNum;
		System.out.println("constructor with parameters called");
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getAccountNum() {
		return accountNum;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhoneNum() {
		return customerPhoneNum;
	}

	public void setCustomerPhoneNum(String customerPhoneNum) {
		this.customerPhoneNum = customerPhoneNum;
	}
	
	public void depositAmount(int amount) {
		this.balance = balance+amount;
		System.out.println("new balance = "+ this.balance);
		
	}
	
	public void withdrawAmount(int amount) {
		if((balance - amount)<0) {
			System.out.println("The balance will become 0 on doing this operation");
		}else {
			this.balance = balance-amount;
			System.out.println("The new balance is: "+ this.balance);
		}
	}
	
}

