package programs;

import java.util.HashMap;

public class MergeArrays {

//	static int[] array1 = {100,2,300,4};
//	static int[] array2 = {700,7,8,9,10};
//	
//	public static int[] mergeArrays(int[] array1, int[] array2) {
//		int[] toBeMergedArray = new int[array1.length+array2.length];
//		for (int i = 0; i < array1.length; i++) {
//			toBeMergedArray[i] = array1[i];
//		}
//		for (int j = 0; j < array2.length; j++) {
//			toBeMergedArray[j+array1.length] = array2[j];
//		}
//		return toBeMergedArray;
//		
//	}

	public static void main(String[] args) {

//		List<Integer> array1 = new ArrayList<>();
//		array1.add(100);
//		array1.add(2);
//		array1.add(300);
//		array1.add(4);
//		List<Integer> array2 = new ArrayList<>();
//		array2.add(700);
//		array2.add(7);
//		array2.add(8);
//		array2.add(9);
//		array2.add(10);
//
//		List<Integer> array3 = new ArrayList<>();
//
//		array3.addAll(array1);
//		array3.addAll(array2);
//
//		array3.stream().sorted().forEach(System.out::println);

		HashMap<Integer, String> hm = new HashMap<>();

		System.out.println(hm.put(1, "Akash"));
		System.out.println(hm.put(2, "Chethan"));
		System.out.println(hm.put(1, "Chethan"));
		System.out.println(hm.put(1, "Akash"));

	}
}
