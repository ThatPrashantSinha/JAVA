package Practice;

import java.util.Arrays;
import java.util.Random;

public class challenge20 {
    public static int[] genRandom(int length) {
        Random random = new Random();
        int[] gArray = new int[length];
        for(int i=0;i<length;i++){
            gArray[i]=random.nextInt(6969);
        }
        System.out.println(Arrays.toString(gArray));
        int[] ranArray = Arrays.copyOf(gArray, length);
        return ranArray;
    }
    public static void main(String[] args) {
        int temp=0;
        int[] first = genRandom(10);
        Arrays.sort(first);
        System.out.println(Arrays.toString(first));
        int[] sortedArray = new int[first.length];
        for(int el=first.length-1;el>=0;el--){
            sortedArray[temp]=first[el];
            temp++;
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
