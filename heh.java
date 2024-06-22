import java.util.Scanner;

public class heh {

    
    public static void inputThenPrintSumAndAverage(String[] args) {
        int num=0;
        int sum=0;
        int avg=0;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try{
                System.out.println("Enter number: ");
                num= Integer.parseInt(scanner.nextLine());
                sum+=num;
                count++;
            }catch(NumberFormatException str){
                break;
            }
        }
        scanner.close();
        avg=sum/count;
        System.out.println("SUM = "+sum+" AVG = "+avg);
    }
}