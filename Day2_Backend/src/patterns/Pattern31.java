package patterns;

public class Pattern31 {
	
//    		A
//    	  A B A
//    	A B C B A
//    A B C D C B A
//  A B C D E D C B A
	
	public static void main(String[] args) {
		int n = 5;
		char startChar = 'A';

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (startChar + j));
				if (j < i) {
					System.out.print(" ");
				}
			}
			for (int j = i - 1; j >= 0; j--) {
				System.out.print(" " + (char) (startChar + j));
			}
			System.out.println();
		}
	}
}
