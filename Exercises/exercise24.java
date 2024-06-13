package Exercises;

public class exercise24 {
    public static int reverse(int num) {
        int reverse=0;
        while (num!=0) {
            reverse+=num%10;
            num/=10;
            if(num!=0){
                reverse*=10;
            }
        }
        return reverse;
    }
    public static int getDigitCount(int num) {
        int count=0;
        if (num==0){
            return count+1;
        }
        while (num>=0) {
            count+=1;
            num/=10;
        }
        return count;
    }
    public static String numberToWords(int number) {
        String s="";
        int lastDigit=0;
        if(number<0){
            return "Invalid Value";
        }else if (number>9){
            int reverse=reverse(number);
            while (reverse!=0) {
                lastDigit=reverse%10;
                reverse/=10;
                switch (lastDigit) {
                    case 1->s+="One ";
                    case 2->s+="Two ";
                    case 3->s+="Three ";
                    case 4->s+="Four ";
                    case 5->s+="Five ";
                    case 6->s+="Six ";
                    case 7->s+="Seven ";
                    case 8->s+="Eight ";
                    case 9->s+="Nine ";
                    case 0->s+="Zero ";
                }
                lastDigit=0;
            }
            if(getDigitCount(number)==getDigitCount(reverse)){
                return s;
            }else{
                int step=getDigitCount(number)-getDigitCount(reverse(number));
                while (step>0) {
                    s+="Zero";
                    step--;
                }
                return s;
            }
            
        }else{
            switch (number) {
                case 1->s+="One ";
                case 2->s+="Two ";
                case 3->s+="Three ";
                case 4->s+="Four ";
                case 5->s+="Five ";
                case 6->s+="Six ";
                case 7->s+="Seven ";
                case 8->s+="Eight ";
                case 9->s+="Nine ";
                case 0->s+="Zero ";
            }
            return s;

        }
    }
    public static void main(String[] args) {
        System.out.println(numberToWords(0));
        System.out.println(getDigitCount(0));
    }
}