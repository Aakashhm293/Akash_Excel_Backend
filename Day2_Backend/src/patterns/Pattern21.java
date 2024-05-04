package patterns;

public class Pattern21 {
	
//			1 
//		  1 0 1 
//		1 0 1 0 1 
//	  1 0 1 0 1 0 1 
//	1 0 1 0 1 0 1 0 1
	
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
	}
}
