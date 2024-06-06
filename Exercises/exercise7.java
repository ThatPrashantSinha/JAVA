package Exercises;
public class exercise7 {
    public static boolean hasEqualSum(int numOne,int numTwo,int numThree) {
        if(numOne+numTwo==numThree){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 01, 02));
    }
}
