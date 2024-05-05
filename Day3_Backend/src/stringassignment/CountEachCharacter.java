package stringassignment;

public class CountEachCharacter {
	public static String countEachCharacter(String str) {
		StringBuilder result = new StringBuilder();
		String cleanStr = str.toLowerCase();
		
		int[] charCount = new int[256];
		for (char c : cleanStr.toCharArray()) {
			charCount[c]++;
		}
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				result.append((char) i).append(":").append(charCount[i]).append(", ");
			}
		}
		if (result.length() > 0) {
			result.setLength(result.length() - 2);
		}

		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(countEachCharacter("Akash"));
	}
}
