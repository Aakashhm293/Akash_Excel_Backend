package programs;

import java.util.Scanner;

public class MinValueInArray {

    public static int minElementsInArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of Integers");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements one by one");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        scanner.close();

        System.out.println("The smallest number in the array is " + min + ".");
        return min;
    }

    public static void main(String[] args) {
        int min = minElementsInArray();
        System.out.println(min);
    }
}