package Exercises;
public class exercise19 {
    public static boolean hasSharedDigit(int firstNum,int secondNum) {
        int i=0;
        int j=0;
        int snum=secondNum;

        if(((firstNum<10)||(firstNum>99))||((secondNum<10)||(secondNum>99))){
            return false;
        }else{
            while (firstNum!=0) {
                i+=firstNum%10;
                firstNum/=10;
                while (secondNum!=0) {
                    j+=secondNum%10;
                    secondNum/=10;
                    if(i==j){
                        return true;
                    }
                    j=0;
                }
                secondNum=snum;
                i=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }
}
