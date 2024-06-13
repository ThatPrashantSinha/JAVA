package Exercises;
public class exercise23 {
    public static boolean isPerfectNumber(int number) {
        int sum=0;
        if(number<=0){
            return false;
        }else{
            for(int i=1;i<=(number/2);i++){
                if(number%i==0){
                    sum+=i;
                }
            }
            if(sum==number){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}
