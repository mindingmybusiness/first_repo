package learning.oopsClass;

public class CustomerApp {

	public static void main(String[] args) {
		Customer shubha = new Customer("shubha", 19000,"shubha@email.com");
		
		System.out.println(shubha.getEmail());
		
		Customer vinay = new Customer();
		System.out.println(vinay.getEmail());
		
		Customer bhanu = new Customer("Bhanu", "bhanu@email.com");
		System.out.println(bhanu.getCreditLimit());
	}

}
