package patterns;

public class Pattern22 {

//			    1 
//  		  1 2 3 
//			1 2 3 4 5 
//		  1 2 3 4 5 6 7 
//		1 2 3 4 5 6 7 8 9 

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}