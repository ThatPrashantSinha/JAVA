package Practice;

public class challenge11 {
    public static int sumDigits(int num) {
        int calc=0;
        if(num<0){
            return -1;
        }else{
            while(true){
                calc+=num%10;
                num=num/10;
                if(num==0){
                    break;
                }
            }
            return calc;
        }
    }
public static void main(String[] args) {
    System.out.println(sumDigits(-1));
}
}
