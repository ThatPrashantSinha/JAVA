package Practice;

import java.util.Scanner;

public class challenge12 {
    public static void main(String[] args) {
        int numCount=1;
        int num=0;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        while (numCount<=5) {
            try{
                System.out.print("Enter number #"+numCount+" ");
                num = Integer.parseInt(scanner.nextLine());
                numCount++;
                sum+=num;
            }catch(NumberFormatException e){
                System.out.println("Enter a valid integer");
            }
        }
        System.out.println(sum);
        scanner.close();
    }
    
}