package patterns;

public class Pattern40 {
	
//    			1  
// 			 1  2  1  
//		  1  2  3  2  1  
//	   1  2  3  4  3  2  1  
//		  1  2  3  2  1  
// 			 1  2  1  
//    			1  
	
	public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= (n - i) * 3; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "  ");
            }
            // Print decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= (n - i) * 3; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "  ");
            }
            // Print decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }
    }
}
