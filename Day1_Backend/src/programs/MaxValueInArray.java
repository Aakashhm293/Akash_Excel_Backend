package programs;

import java.util.Scanner;

public class MaxValueInArray {
	
	static int max;
	
    public static int maxElementsInArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of Integers");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements one by one");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        scanner.close();

        System.out.println("The biggest number in the array is " + max + ".");
        return max;
    }

    public static void main(String[] args) {
    	max = maxElementsInArray();
        System.out.println(max);
    }
}