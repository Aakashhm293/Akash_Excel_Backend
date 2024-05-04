package programs;

public class IntersectionArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 8, 3, 5 };
		int[] arr2 = { 1, 9, 6, 8, 5 };
		int[] arr3 = new int[arr1.length + arr2.length];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[i]) {
					arr3[k] = arr1[i];
				}
			}

		}
		int count = 0;
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] != 0)
				count++;
		}
		System.out.println("InterSection of the Array Element is : ");
		for (int i = 0; i < count; i++) {
			System.out.println(arr3[i]);
		}
	}
}
