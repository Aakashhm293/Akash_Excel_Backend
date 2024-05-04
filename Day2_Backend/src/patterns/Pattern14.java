package patterns;

public class Pattern14 {
	
//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1 
	
	public static void main(String[] args) {

		int num = 1;
		int n = 6;
		for (int i = 1; i <= n; i++) {
			num = i;
			for (int j = 1; j < i; j++) {
				num--;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
