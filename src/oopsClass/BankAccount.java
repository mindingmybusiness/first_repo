package oopsClass;

public class BankAccount {

	
	private int accNum;
	private int balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	
	public BankAccount() {
		this(111,1000,"Default Name", "Default Email", "Default Phone");
		System.out.println("Empty constructor called");
	}
	
	public BankAccount(int accNum, int balance, String customerName, String customerEmail, String customerPhone) {
		System.out.println("All param constructor called");
		this.accNum = accNum;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
	}
	
	public BankAccount(int accNum, int balance, String customerName) {
		this(accNum,balance,customerName,"Default Email","Default phone");
		System.out.println("Three param constructor called");
	}
	
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setcustomerEmail(String customerEmail) {
		this.customerEmail = customerName;
	}
	
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	public int getAccNum() {
		return this.accNum;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	
	public String getCustomerEmail() {
		return this.customerEmail;
	}
	
	public String getCustomerPhone() {
		return this.customerPhone;
	}
	
	public void depositFunds(int depositAmount) {
		balance = balance + depositAmount;
		System.out.println("The balance after deposit is: "+ balance);
	}
	
	public int withdrawFunds(int withdrawalAmount) {
		if((balance - withdrawalAmount) > 0 ) {
			System.out.println("WithdrawalAmount is: "+ withdrawalAmount);
			balance = balance - withdrawalAmount;
			System.out.println("The balance after deposit is: "+ balance);
			return withdrawalAmount;
			
		} else {
			System.out.println("The balance is insufficient to withdraw "+ withdrawalAmount);
			return -1;
		}
	}
}
