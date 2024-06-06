package Exercises;
public class exercise11 {
    public static void printEqual(int numOne,int numTwo,int numThree) {
        if(numOne<0||numTwo<0||numThree<0){
            System.out.print( "Invalid Value");
        }else if((numOne==numThree)&&(numThree==numTwo)){
            System.out.println( "All numbers are equal");
        }else if((numOne!=numTwo)&&(numOne!=numThree)&&(numThree!=numTwo)){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
    public static void main(String[] args) {
        printEqual(1, 1, 30);
    }
}
