package stringassignment;

public class CountWords {

	public static int countWords(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countWords("Akash Is a Linux Nerd"));
	}
}
