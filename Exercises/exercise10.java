package Exercises;
public class exercise10 {
    public static void printYearsAndDays(long minutes) {
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            long dd=minutes/1440;
            long yy=dd/365;
            dd=dd%365;
            System.out.println(minutes+" min = "+yy+" y and "+dd+" d");

        }
    }
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
}
