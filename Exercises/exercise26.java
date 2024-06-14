package Exercises;


public class exercise26 {
    public static boolean isPrime(int num) {
        if(num<=2){
            return true;
        }
        for(int j=2;j<=num/2;j++){
            if (num%j==0){
                return false;
            }
        }
        return true;
    }
    public static int getLargestPrime(int number) {
        int factor=0;
        if(number<2){
            return -1;
        }else{
            for(int i=number;i<=number;i--){
                if(number%i==0&&isPrime(i)){
                    factor=i;
                    return factor;
                }
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getLargestPrime(8));
        System.out.println(isPrime(71));
    }
}
