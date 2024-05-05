package stringassignment;

public class IsPanagram {
	public static boolean isPanagram(String str) {
		str = str.toLowerCase();
	    boolean[] alphabetPresent = new boolean[26];
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);

	        if (Character.isLetter(ch)) {
	            int index = ch - 'a';
	            alphabetPresent[index] = true;
	        }
	    }
	    for (boolean letterPresent : alphabetPresent) {
	        if (!letterPresent) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
		
		String str = "The five boxing wizards jump quickly";
		System.out.println(isPanagram(str));
	}
}
