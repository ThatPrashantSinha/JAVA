package Exercises;

public class exercise22 {
    public static int getGreatestCommonDivisor(int first,int second) {
        int numOne=0;
        int numTwo=0;
        if(first<10||second<10){
            return -1;
        }else{
            int i=first;
            while(i!=0){
                if(first%i==0){
                    numOne+=i;
                    int j=second;
                    while (j!=0) {
                        if(second%j==0){
                            numTwo+=j;
                            if(numOne==numTwo){
                                return numOne;
                            }
                        }
                        j--;
                        numTwo=0;
                    }

                }
                i--;
                numOne=0;
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(153, 81));
    }
}
