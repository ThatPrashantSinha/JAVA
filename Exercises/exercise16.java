package Exercises;

public class exercise16 {
    public static boolean isPalindrome(int number) {
        int reverse =0;
        int num=number;
        while (true) {
            reverse+=(number%10);
            number/=10;
            if(number!=0){
                reverse*=10;
            }else if(number==0){
                break;
            }
        }
        if(reverse==num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
