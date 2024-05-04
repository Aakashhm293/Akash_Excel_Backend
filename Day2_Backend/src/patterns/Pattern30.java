package patterns;

public class Pattern30 {
	
//    			1
//  		  1 * 2
//			1 * 2 * 3
//		  1 * 2 * 3 * 4
//		1 * 2 * 3 * 4 * 5
	
	public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
                if (j < i + 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
