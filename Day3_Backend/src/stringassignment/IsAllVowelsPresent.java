package stringassignment;

public class IsAllVowelsPresent {
	public static boolean isAllVowelsPresent(String str) {
		str = str.toLowerCase();
	    boolean isPresent = true;
	    String vowels = "aeiou";
	    for (char vowel : vowels.toCharArray()) {
	        if (str.indexOf(vowel) == -1) {
	            isPresent = false;
	            break;
	        }
	    }
	    return isPresent;
	}
	
	public static void main(String[] args) {
		String str = "Akash is a unique person";
		System.out.println(isAllVowelsPresent(str));
	}
}
