package patterns;

public class Pattern4 {
	/*
	 
	 *****
	 ****
	 ***
	 **
	 *
	 
	 */
	
	public static void main(String[] args) {
		int n=6;
		
		for(int i=0;i<n;i++) {
			for(int j=5;j>i;j--) {
				if(j>i && i==j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
