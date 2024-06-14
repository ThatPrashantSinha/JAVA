package Exercises;

public class exercise25 {
    public static boolean  canPack(int bigCount,int smallCount,int goal) {
        if(smallCount<0||bigCount<0||goal<0){
            return false;
        }else if(smallCount+(bigCount*5)<goal||(smallCount==0&&goal<bigCount*5)){
            return false;
        }else{
            int remainder=goal%5;
            int num=goal/5;
            if(num<=bigCount&&remainder<=smallCount){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 18));
    }
}
