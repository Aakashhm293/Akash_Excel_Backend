package patterns;

public class Pattern6 {
	
	/*
	abcde
	abcde
	abcde
	abcde
	abcde
	*/
	
	
	public static void main(String[] args) {
		
		int n=5;
		
		char alp = 'a';
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(alp);
				alp++;
			}
			System.out.println();
			alp = 'a';
		}
	}
}
