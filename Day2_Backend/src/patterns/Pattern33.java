package patterns;

public class Pattern33 {
	
//	1  2  3  4  5  4  3  2  1  
//	   1  2  3  4  3  2  1  
//	      1  2  3  2  1  
//	         1  2  1  
//	            1  

	
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j + "  ");
			}
			for (int j = n - i - 1; j >= 1; j--) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}
}
