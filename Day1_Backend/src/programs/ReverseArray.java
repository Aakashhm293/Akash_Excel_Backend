package programs;

public class ReverseArray {
	
	static int[] array = {1,2,3,4,5,6};
	
	public static int[] reverseArray(int[] array) {
		int[] reversedArray = new int[array.length];
		for (int i = 1; i <= array.length; i++) {
			reversedArray[i-1] = array[array.length-i];
		}
		return reversedArray;
	}
	
	public static void main(String[] args) {
		int[] newArray = reverseArray(array);
		PrintArray.printArray(newArray);
	}
}
