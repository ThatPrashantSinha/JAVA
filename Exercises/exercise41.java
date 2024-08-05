package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class exercise41 {
    private static Scanner scanner = new Scanner(System.in);
    private static int readInteger() {
        System.out.println("enter the lenght of array");
        int readInt= Integer.parseInt(scanner.nextLine());
        return readInt;
    }
    private static int[] readElements(int length ) {
        int[] readArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter the lenght of array");
            int temp = Integer.parseInt(scanner.nextLine());
            readArray[i]=temp;
        }
        return readArray;
    }
    private static int findMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int[] finalArray = readElements(readInteger());
        System.out.println(findMin(finalArray));
        scanner.close();
    }
    
}
