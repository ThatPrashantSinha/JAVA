package Practice;

import java.util.Arrays;

public class challenge22 {
    public static int[] reverse(int[] fArray) {
        int temp;
        for (int i = 0; i < fArray.length/2; i++) {
            temp=fArray[0+i];
            fArray[0+i]=fArray[fArray.length-1-i];
            fArray[fArray.length-1-i]=temp;
        }
        return fArray;
    }
    public static void main(String[] args) {
        int[] finalArray = {1,2,3,4,5,6,7,8};
        int[] output= reverse(finalArray);
        System.out.println(Arrays.toString(output)); 
    }
}