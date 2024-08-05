package Exercises;

import java.util.Arrays;

public class exercise42 {
    private static void reverse(int[] fArray) {
        int temp;
        System.out.print("Array = "+Arrays.toString(fArray));
        for (int i = 0; i < fArray.length/2; i++) {
            temp=fArray[0+i];
            fArray[0+i]=fArray[fArray.length-1-i];
            fArray[fArray.length-1-i]=temp;
        }
        System.out.println("Reversed array = "+Arrays.toString(fArray));
    }
    public static void main(String[] args) {
        int[] aasjd ={1,2,3,4,5,6,7,8,9};
        reverse(aasjd);
    }
}
