package Exercises;

public class exercise20 {
    public static boolean hasSameLastDigit(int firstNum,int secondNum,int thirdNum) {
        int i=0;
        int j=0;
        int k=0;
        if(((firstNum<10)||(firstNum>1000))||((secondNum<10)||(secondNum>1000))||((thirdNum<10)||(thirdNum>1000))){
            return false;
        }else{
            i+=firstNum%10;
            j+=secondNum%10;
            k+=thirdNum%10;
            if((i==j)||(j==k)||(i==k)){
                return true;
            }
            return false;
        }
    }
    public static boolean isValid(int number) {
        if((number<10)||(number>1000)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(21, 32, 11));
    }
}
