package patterns;

public class Pattern36 {
	
//	* * * * * * * 
//	 * * * * * * 
//	  * * * * * 
//	   * * * * 
//	    * * * 
//	     * * 
//	      * 
//	     * * 
//	    * * * 
//	   * * * * 
//	  * * * * * 
//	 * * * * * * 
//	* * * * * * * 
	
	public static void main(String[] args) {
        int n = 7;
        if (n == 7) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < 6 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
