package patterns;

public class Pattern29 {

//			5 
//		  4 5 4 
//		3 4 5 4 3 
//	  2 3 4 5 4 3 2 
//	1 2 3 4 5 4 3 2 1 

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = n - i + 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			for (int j = n - 1; j >= n - i + 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
