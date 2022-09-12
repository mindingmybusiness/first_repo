package programs;

public class GetDuration {

	public static void main(String[] args) {
System.out.println(getDuration(65, 45));
	}
	
	public static String getDuration(int minutes, int seconds) {
		if((minutes <0)|| (seconds <0)||(seconds >59)) {
			return ("Invalid Value");
		}else {
			int hours = minutes/60;
			int remMins = minutes%60;
			return (hours + "h " + remMins + "m " + seconds + "s ");
		}
	}

}
