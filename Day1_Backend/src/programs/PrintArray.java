package programs;

public class PrintArray {
	
	static int[] array = {1,2,3,4,5,6};
	
	public static int[] printArray(int array[]){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}

	public static void main(String[] args) {
		printArray(array);
	}
}
