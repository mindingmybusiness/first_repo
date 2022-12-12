package learning.inheritanceChallenge;

public class Main {
	public static void main(String[] args) {
		Employee tim = new Employee("Tim", "25/10/1985", "01/01/2020");
		System.out.println(tim);
		
		System.out.println();
		
		SalariedEmployee shubha = new SalariedEmployee("Shubha","20/07/1990","01/05/2023",2400000);
		System.out.println(shubha);
		
		shubha.retire();
		System.out.println(shubha);
		
		System.out.println();
		
		HourlyEmployee mary = new HourlyEmployee("Mary", "03/03/1998", "01/07/2022", 15);
		System.out.println(mary);
		System.out.println(mary.getDoublePay());
	}
}
