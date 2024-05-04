package programs;

import java.util.Scanner;

public class CreateArray {
	public static int[] createArray() {
		System.out.println("Enter the Array Size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array Elements one by one");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Array Created");
		return arr;
	}
	
	public static void main(String[] args) {
		int[] array = createArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}