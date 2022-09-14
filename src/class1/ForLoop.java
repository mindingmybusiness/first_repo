package class1;

public class ForLoop {

	public static void main(String[] args) {
		int count =0;
		int sum =0;
		for(int i=1;i<=1000;i++) {
			if((i%3==0) && (i%5==00)) {
				count++;
				sum += i;
				System.out.println("Found number = "+ i);
			}
			
			if(count ==5) {
				break;
			}
			
		}
		System.out.println("Sum = "+ sum);
	}

}
