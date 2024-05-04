package programs;

public class SortArray {
	
	
	static int[] array = {1,2,3,6,5,4};
	
	
	public static int[] sortArray(int[] array) {
		System.out.println("Sorted Array");
		int temp;
		for(int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<array.length ; j++) {
				if(array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] sortedArray = sortArray(array);
		PrintArray.printArray(sortedArray);
	}
}
