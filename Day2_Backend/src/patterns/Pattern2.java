package patterns;

public class Pattern2 {
	
	/*
	 12345
	 12345
	 12345
	 12345
	 12345 
	 */
	
	public static void main(String[] args) {
		
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}
