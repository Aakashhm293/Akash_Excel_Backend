package programs;

class UnionArray {
	public static void main(String[] args) {
		int[] array1 = { 4, 6, 8, 4 };
		int[] array2 = { 4, 8, 3, 6 };
		int[] unionedArray = new int[array1.length + array2.length];
		int j = 0, i = 0, k = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] == array2[j]) {
				unionedArray[k++] = array1[i++];
				j++;
			} else if (array1[i] < array2[j]) {
				unionedArray[k++] = array1[i++];
			} else {
				unionedArray[k++] = array2[j++];
			}
		}
		while (i < array1.length) {
			unionedArray[k++] = array1[i++];
		}
		while (j < array2.length) {
			unionedArray[k++] = array2[j++];
		}
		for (int value : unionedArray) {
			if (value != 0) {
				System.out.println(value + "");
			}
		}
	}
}
