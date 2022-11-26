package oopsClass;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount shubha = new BankAccount(100,23000,"Tester");
		//shubha.setBalance(10000);
		//shubha.depositFunds(50000);
		shubha.withdrawFunds(3000);
	}

}
