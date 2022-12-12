package learning.programs;

public class ReversedWords {

	public static void main(String[] args) {
		String str = "This is new";
		System.out.println(reversedWords(str));
	}
	
	public static String reversedWords(String str) {
		String ans = "";
		String[] words = str.split(" ");
		
		for(String srt: words) {
			if(srt.trim().isEmpty()) {
				continue;
			}
			ans = srt + " " + ans;
		}
		return ans.trim();
	}

}
