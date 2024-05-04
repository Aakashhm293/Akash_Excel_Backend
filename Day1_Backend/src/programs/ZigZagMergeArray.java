package programs;

public class ZigZagMergeArray {
	
	public class ArrayOperations {
		
		static int[] array1 = {1, 3, 5, 7, 9};
        static int[] array2 = {2, 4, 6, 8, 10};
	    
	    public static int[] zizZagMergeArray(int[] array1, int[] array2) {
	    	
	        int[] mergedArray = new int[array1.length + array2.length];
	        int index = 0;
	        
	        int smallerLength = Math.min(array1.length, array2.length);
	        for (int i = 0; i < smallerLength; i++) {
	            mergedArray[index++] = array1[i];
	            mergedArray[index++] = array2[i];
	        }
	        
	        if (array1.length > smallerLength) {
	            for (int i = smallerLength; i < array1.length; i++) {
	                mergedArray[index++] = array1[i];
	            }
	        } else if (array2.length > smallerLength) {
	            for (int i = smallerLength; i < array2.length; i++) {
	                mergedArray[index++] = array2[i];
	            }
	        }
	        
	        return mergedArray;
	    }

	    public static void main(String[] args) {
	        int[] mergedArray = zizZagMergeArray(array1, array2);
	        PrintArray.printArray(mergedArray);
	    }
	}
}
