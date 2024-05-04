package patterns;

public class Pattern32 {
	
//    		A
//  	  B A B
//		C B A B C
//	  D C B A B C D
//  E D C B A B C D E
	
	public static void main(String[] args) {
		int n = 5;
		char startChar = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 0; j--) {
				System.out.print((char) (startChar + j));
				if (j > 0) {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + (char) (startChar + j));
			}
			System.out.println();
		}
	}
}
