package Exercises;

public class exercise17 {
    public static int sumFirstAndLastDigit(int number) {
        int reverse =0;
        int num=number;
        if (number < 0){
            return -1;
        }else{
            while (number!=0) {
                reverse+=(number%10);
                number/=10;
                if(number!=0){
                    reverse*=10;
                }
            }
            return (num%10)+(reverse%10);
        }  
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(124));
    }
}
