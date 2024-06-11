package Practice;

public class challenge10 {
    public static boolean isEvenNumber(int num) {
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEvenNumber(7));
        int oddNum=0;
        int evenNum=0;
        int number=5;
        while (number<=20) {
            if(isEvenNumber(number)){
                evenNum++;
                System.out.println(number);
                if(evenNum==5){
                    break;
                }

            }else{
                oddNum++;
            }
            number++;
        }
        System.out.println("even "+evenNum);
        System.out.println("odd "+oddNum);
    }
}
