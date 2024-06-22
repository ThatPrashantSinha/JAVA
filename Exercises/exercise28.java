package Exercises;

import java.util.Scanner;
public class exercise28 {
    public static void inputThenPrintSumAndAverage() {
        int num=0;
        int sum=0;
        int avg=0;
        int count=0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            try{
                num= Integer.parseInt(scan.nextLine());
                sum+=num;
                count++;
            }catch(NumberFormatException str){
                break;
            }
        }
        if(count==0){
            System.out.println("SUM = "+sum+" AVG = "+avg);
        }else{
            avg=(int)Math.round((double) sum/count);
            System.out.println("SUM = "+sum+" AVG = "+avg);
        }
        scan.close();
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
