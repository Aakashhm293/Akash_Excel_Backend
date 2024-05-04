package patterns;

public class Pattern25 {

//		    1
//		  2 1
//	    3 2 1
//    4 3 2 1
//  5 4 3 2 1

	public static void main(String[] args) {
		int n = 6;
		int num;
		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j--) {
				num = j;
				if (j > i) {
					System.out.print("  ");
				} else {
					System.out.print(" " + num);
				}

			}
			System.out.println();
		}
	}
}
