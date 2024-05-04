package patterns;

public class Pattern5 {
	public static void main(String[] args) {
		
//		ABCDE
//		ABCDE
//		ABCDE
//		ABCDE
//		ABCDE
		
		int n=5;
		
		char alp = 'A';
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(alp);
				alp++;
			}
			System.out.println();
			alp = 'A';
		}
	}
}
