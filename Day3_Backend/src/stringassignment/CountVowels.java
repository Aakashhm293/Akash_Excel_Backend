package stringassignment;

public class CountVowels {
	public static void countVowels(String str) {
		str = str.toLowerCase();
		int[] counts = new int[5];
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
				counts[0]++;
				break;
			case 'e':
				counts[1]++;
				break;
			case 'i':
				counts[2]++;
				break;
			case 'o':
				counts[3]++;
				break;
			case 'u':
				counts[4]++;
				break;
			default:
				break;
			}
		}

		for (int i = 0; i < vowels.length; i++) {
			System.out.println("Count of '" + vowels[i] + "': " + counts[i]);
		}
	}

	public static void main(String[] args) {
		String str = "Akash is a Good Boy";
		countVowels(str);
	}
}
