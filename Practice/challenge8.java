package Practice;

public class challenge8 {
    public static boolean isPrime(int num) {
        for(int wnum=2;wnum<=num/2 ; wnum++){
            if(num%wnum==0){
                return false;
            }
        }
        return true;
    }
    
    public static void noOfPrime(int numOne, int numTwo) {
        int count=0;
        for(int i=numOne; i<=numTwo; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
                if(count==3){
                    break;
                }
            }
        }  
        
 
    }
    public static void main(String[] args) {
        System.out.println(isPrime(14));
        noOfPrime(20, 40);
        
    }
}

