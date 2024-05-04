package patterns;

public class Pattern17 {
	
//	1 1 1 1 1  
//	2 2 2 2   
//	3 3 3    
//	4 4     
//	5      
	      
	
	public static void main(String[] args) {

		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				
				if (j > i) {
					System.out.print(i+" ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
