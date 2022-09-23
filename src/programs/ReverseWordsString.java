package programs;

public class ReverseWordsString {

	public static void main(String[] args) {
		String str = "this is new";
		System.out.println(reversedWords(str));
	}

	public static String reversedWords(String s) {
		String ans = "";
		String[] arr = s.split(" ");

		for (String str : arr) {
			if (str.trim().isEmpty())
				continue;
			ans = str + " " + ans;
		}
		return ans.trim();
	}
}
