package Exercises;

public class exercise15 {
    public static boolean isOdd(int number) {
        if(number<0){
            return false;
        }else if(number%2==0){
            return false;
        }else{
            return true;
        }
    }
    public static int sumOdd(int start,int end) {
        if((start<0||end<0)||(end<start)){
            return -1;
        }else{
            int num=0;
            for(int i=start;i <= end; i++){
                if (isOdd(i)) {
                    num+=i;
                }
            }
            return num;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 10));
    }
}
