package programs;

public class MergeArrays {
	
	static int[] array1 = {1,2,3,4,5};
	static int[] array2 = {6,7,8,9,10};
	
	public static int[] mergeArrays(int[] array1, int[] array2) {
		int[] toBeMergedArray = new int[array1.length+array2.length];
		for (int i = 0; i < array1.length; i++) {
			toBeMergedArray[i] = array1[i];
		}
		for (int j = 0; j < array2.length; j++) {
			toBeMergedArray[j+array1.length] = array2[j];
		}
		return toBeMergedArray;
	}

	public static void main(String[] args) {
		int[] mergedArray = mergeArrays(array1, array2);
		PrintArray.printArray(mergedArray);
	}
}
