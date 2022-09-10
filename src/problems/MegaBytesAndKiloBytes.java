package problems;

public class MegaBytesAndKiloBytes {

	public static void main(String[] args) {
		int kiloBytes = 10000;
		printKiloBytesAndMegaBytes(kiloBytes);
	}
	
	public static void printKiloBytesAndMegaBytes(int kiloBytes) {
		if(kiloBytes <0 ) {
			System.out.println("Invalid Value");
		} else {
			int remainder = kiloBytes % 1024;
			int megaBytes = kiloBytes / 1024;
			System.out.println(kiloBytes + "KB = "+ megaBytes + "MB + "+remainder +"KB");
		}
	}

}
