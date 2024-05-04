package patterns;

public class Pattern12 {
	
//	5 5 5 5 5 
//	4 4 4 4 
//	3 3 3 
//	2 2 
//	1 
	
	public static void main(String[] args) {

		int n = 6;
		int num = 6;
		for (int i = 1; i <=n; i++) {
			num--;
			for (int j = n; j > i; j--) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
