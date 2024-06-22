    package Practice;

    import java.util.Scanner;

    public class challenge13 {
        public static void main(String[] args) {
            int max=0;
            int min=0;
            int num=0;
            Scanner scanner = new Scanner(System.in);
            while(true){
                try{
                    System.out.print("Enter number: ");
                    num= Integer.parseInt(scanner.nextLine());
                    if(min==0&&max==0){
                        min=num;
                        max=num;
                    }else{
                        if(num<min){
                            min=num;
                        }else if(num>max){
                            max=num;
                        }
                    }
                }catch(NumberFormatException stri){
                    break;
                }
            }
            System.out.println("Max num: "+max);
            System.out.println("Min num: "+min);
            scanner.close();
        }
    }
