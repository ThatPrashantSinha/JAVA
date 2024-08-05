package Practice;
import java.util.Arrays;
import java.util.Scanner;

public class challenge21 {
    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an array");
        String readINt= scanner.nextLine();
        String[] covertedint = readINt.split(",");
        int[] nextInt= new int[covertedint.length];
        for(int i=0;i<=covertedint.length-1;i++){
            nextInt[i]=Integer.parseInt(covertedint[i]);
        }
        scanner.close(); 
        return nextInt;
    }
    public static int findMinor(int[] arr ) {
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int[] finalArray = readIntegers();
        int minor = findMinor(finalArray);
        System.out.println(minor);
    }
}
