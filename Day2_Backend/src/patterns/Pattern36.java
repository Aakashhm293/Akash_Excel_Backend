package patterns;

public class Pattern36 {
	
//	* * * * * * * 
//	  * * * * * 
//	    * * * 
//	      * 
//	    * * * 
//	  * * * * * 
//	* * * * * * * 
	
	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n / 2 + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < n - 2 * i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = n / 2 - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < n - 2 * i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
