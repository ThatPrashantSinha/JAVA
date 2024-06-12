package Exercises;
public class exercise18 {
    public static int getEvenDigitSum(int number) {
        int i=0;
        int sum=0;
        if (number < 0){
            return -1;
        }else{
            while (number != 0) {
                i+=number%10;
                if(i%2==0){
                    sum+=i;
                }
                i=0;
                number/=10;
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-12));
    }
}
