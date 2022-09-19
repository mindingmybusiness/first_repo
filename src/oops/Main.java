package oops;

public class Main {

	public static void main(String[] args) {

		//BankAccount bobsAcc = new BankAccount("12345", 500, "Bob Marley", "customeremail@gmail.com","9887867893");
//		BankAccount bobsAcc =  new BankAccount(); 
//		System.out.println(bobsAcc.getCustomerPhoneNum());
//		bobsAcc.withdrawAmount(100);
//		bobsAcc.depositAmount(50);
		
		VipCustomer vip = new VipCustomer("Shubha", 600);
		System.out.println(vip.getEmailAdd());
		System.out.println(vip.getCreditLimit());
		
		VipCustomer vip1 = new VipCustomer();
		System.out.println(vip1.getEmailAdd());
		
	}

}
