package stringassignment;

public class IsAnagram {
	public static boolean isAnagram(String str1, String str2) {
		String cleanStr1 = str1.toLowerCase();
		String cleanStr2 = str2.toLowerCase();

		if (cleanStr1.length() != cleanStr2.length()) {
			return false;
		}

		int[] charCount = new int[256];

		for (char c : cleanStr1.toCharArray()) {
			charCount[c]++;
		}

		for (char c : cleanStr2.toCharArray()) {
			charCount[c]--;
		}

		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str1 = "schoolmaster";
		String str2 = "theclassroom";

		System.out.println(isAnagram(str1, str2));
	}
}
