package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class exercise40 {
    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        int c=0;
        System.out.println("enter length of array");
        int getIntegers=Integer.parseInt(scanner.nextLine());
        int[] first = new int[getIntegers];
        while (c<=getIntegers-1) {
            System.out.println("enter element of array");
            int input=Integer.parseInt(scanner.nextLine());
            first[c]=input;
            c++;
        }
        scanner.close();
        return first;
    }
    public static void printArray(int[] printArray) {
        for (int i = 0; i < printArray.length; i++) {
            System.out.println("Element "+i+" contents "+printArray[i]);
        }
    }
    public static int[] sortIntegers(int[] unsortedArray) {
        int temp=0;
        int[] copied = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(copied);
        int[] sortedArray = new int[copied.length];
        for(int el=copied.length-1;el>=0;el--){
            sortedArray[temp]=copied[el];
            temp++;
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] arrayToBeSorted = getIntegers();
        int[] finalArray = sortIntegers(arrayToBeSorted);
        printArray(arrayToBeSorted);
        System.out.println("-".repeat(20));
        printArray(finalArray);

    }
}
