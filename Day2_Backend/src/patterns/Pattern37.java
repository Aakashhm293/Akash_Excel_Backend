package patterns;

public class Pattern37 {
	
//	1 2 3 4 3 2 1 
//	  1 2 3 2 1 
//	    1 2 1 
//	      1 
//	    1 2 1 
//	  1 2 3 2 1 
//	1 2 3 4 3 2 1 
	
	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n / 2 + 1; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (n / 2 + 2) - i; k++) {
				System.out.print(k + " ");
			}
			for (int k = (n / 2 + 1) - i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for (int i = n / 2; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (n / 2 + 2) - i; k++) {
				System.out.print(k + " ");
			}
			for (int k = (n / 2 + 1) - i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
