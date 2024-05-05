package stringassignment;

public class IsPalindrome {
	public static boolean isPalindrome(String str) {
		String lowerCaseString = str.toLowerCase();
		if (lowerCaseString.isEmpty() || lowerCaseString.length() == 1) {
			return true;
		}
		int fromStart = 0;
		int toEnd = lowerCaseString.length() - 1;
		while (fromStart < toEnd) {
			if (lowerCaseString.charAt(fromStart) != lowerCaseString.charAt(toEnd)) {
				return false;
			}
			fromStart++;
			toEnd--;
		}
		return true;
	}

	public static void main(String[] args) {
		
//		String str = "Akash";
		String str = "Malayalam";
		System.out.println(isPalindrome(str));
	}
}
