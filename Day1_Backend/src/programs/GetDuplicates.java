package programs;

public class GetDuplicates {
	public static void duplicateElement() {
		int[] array1 = { 9, 5, 3, 6, 8, 4, 2, 6, 5, 9, 8, 7, 4, 2, 8 };
		System.out.println("Duplicate Elements:");
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		duplicateElement();
	}
}
