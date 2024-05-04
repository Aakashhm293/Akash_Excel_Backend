package patterns;

public class Pattern41 {
	
//    					* 
//  				  *   * 
//					*       * 
//				  *           * 
//				*               * 
//			  *                   * 
//			*                       * 
//			  *                   * 
//				*               * 
//				  *           * 
//					*       * 
//  				  *   * 
//    					* 
	
	public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            if (i > 1) {
                for (int k = 1; k < (i - 1) * 2; k++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            System.out.print("* ");
            if (i > 1) {
                for (int k = 1; k < (i - 1) * 2; k++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
