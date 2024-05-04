package patterns;

public class Pattern10 {
	
//	1 2 3 4 5 
//	1 2 3 4  
//	1 2 3   
//	1 2    
//	1   
	
	public static void main(String[] args) {

		int n = 5;
		int num = 0;
		for (int i = 0; i < n; i++) {
			num = 0;
			for (int j = n; j > 0; j--) {
				num++;
				if (j > i) {
					System.out.print(num+" ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
